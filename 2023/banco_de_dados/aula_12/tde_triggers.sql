--MODELO CONCEITUAL - https://app.brmodeloweb.com/#!/conceptual/644bfceac0a4eb1b0e78d305

CREATE TABLE produtos(
    cod_produto int primary key auto_increment,
    status_produto int,
    valor_produto decimal(12,2) not null,
    descricao varchar(100),
    qtd_estoque int not null
);

CREATE TABLE orcamentos(
    cod_orcamento int primary key auto_increment,
    data_orcamento date,
    status_orcamento int not null,
    valor_orcamento decimal(12,2) not null
);

CREATE TABLE orcamentos_produtos(
    cod_orcamento_produto int primary key auto_increment,
    qtd_produto int,
    status_orcamento_produto int,
    cod_orcamento int not null,
    cod_produto int not null,
    constraint orcamentos_fk_orcamentos_produtos
    foreign key(cod_orcamento) references orcamentos(cod_orcamento)
        on delete restrict
        on update cascade,
    constraint produtos_fk_orcamentos_produtos
    foreign key(cod_produto) references produtos(cod_produto)
        on delete restrict
        on update cascade  
);

create table produtos_atualizados( 
    qtd_estoque_anterior int,
    qtd_estoque_atual int,
    valor_produto decimal(12,2) not null,
    cod_produto int not null,
    constraint produtos_fk_produto_atualizados
    foreign key(cod_produto) references produtos(cod_produto)
        on delete restrict
        on update cascade 
);

create table produtos_em_falta(
    qtd_estoque int not null,
    status_orcamento int not null,
    descricao varchar(100),
    cod_produto int not null,
    constraint produtos_fk_produtos_em_faltas
    foreign key(cod_produto) references produtos(cod_produto)
        on delete restrict
        on update cascade
);

INSERT INTO produtos (status_produto, valor, descricao, qtd_estoque) 
VALUES 
	(1, 100.00, 'Produto 1', 10),
	(1, 200.00, 'Produto 2', 5),
	(1, 50.00, 'Produto 3', 20),
	(1, 75.00, 'Produto 4', 15),
	(1, 150.00, 'Produto 5', 8);

INSERT INTO orcamentos (data_orcamento, status_orcamento, valor) VALUES 
    ('2023-04-25', 1, 500.00),
    ('2023-04-26', 2, 250.00),
    ('2023-04-27', 1, 800.00),
    ('2023-04-28', 1, 1200.00);


--1 – Faça um trigger para alterar o estoque de um produto quando ocorrer quaisquer alterações na tabela orçamentos_produtos. Também irá alterar o estoque, quando um ítem na tabela orçamentos_Produtos for cancelado. Isso ocorre quando o campo Orp_Status recebe o valor 2.

DELIMITER $$
CREATE TRIGGER trigger_altere_estoque_quando_update AFTER UPDATE ON orcamentos_produtos
    FOR EACH ROW
BEGIN
    
    if new.status_orcamento_produto = 2 then
        update produtos set qtd_estoque =  qtd_estoque + old.qtd_produto
        where cod_produto = new.cod_produto;
    else
        update produtos set qtd_estoque =  qtd_estoque - new.qtd_produto
        where cod_produto = new.cod_produto;
    end if;
END $$
DELIMITER ;


--2 – Faça um trigger para armazenar em uma tabela chamada produtos_atualizados (prd_codigo, prd_qtd_anterior, prd_qtd_atualizada, prd_valor) quando ocorrer quaisquer alterações nos atributos da tabela produtos. No entanto, caso a alteração atribua o valor zero para o atributo prd_qtd_estoque, a tabela produtos_em_falta deverá ser alimentada com as mesmas informações da tabela produto, exceto o atributo prd_valor. Além disso, o atributo prd_status do produto atualizado deve ser modificado para NULL e o atributo orp_status de todos os orcamentos_produtos desse produto deverá ser modificado também para NULL. 

DELIMITER $$
CREATE TRIGGER trigger_insira__produtos_em_falta_e_atualizados BEFORE UPDATE ON produtos 
    FOR EACH ROW
BEGIN
    if new.qtd_estoque = 0 then
        insert into produtos_em_falta(cod_produto, qtd_estoque, status_produto,descricao)
        values 
                (new.cod_produto,new.qtd_estoque,new.status_produto,new.descricao);

        update orcamentos_produtos set status_orcamento_produto = null where cod_produto = new.cod_produto;

        insert into produtos_atualizados(cod_produto, qtd_estoque_anterior,qtd_estoque_atual, valor)
        values 
                (new.cod_produto,old.qtd_estoque,null,new.valor);
    else
        insert into produtos_atualizados(cod_produto, qtd_estoque_anterior,qtd_estoque_atual, valor)
        values 
                (new.cod_produto,old.qtd_estoque,new.qtd_estoque,new.valor);
                
    end if;
END $$

DELIMITER ;



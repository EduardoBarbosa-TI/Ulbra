create table categoria(
    id int auto_increment primary key,
    nome varchar(100) not null
);

create table produtos(
    id_categoria int auto_increment primary key,
    descricao varchar(200),
    data_cadastro date not null,
    valor_unitario float not null,
    constraint produtos_fk_categoria
    foreign key(id_categoria) references categoria(id)  
    on delete restrict
    on update cascade
);


create table fornecedor(
    id int auto_increment primary key,
    nome varchar(100) not null
);

create table pedidos_produtos_fornecedor(
    id int auto_increment primary key,
    quantidade int not null unique,
    valor_unitario float not null,
    data date not null,

    id_produto int not null,
    id_fornecedor int not null,

    constraint produtos_fk_pedidos_produtos_fornecedor
        foreign key(id_produto) references produtos(id_categoria)
        on delete restrict
        on update cascade,
    constraint fornecedor_fk_pedidos_produtos_fornecedor  
        foreign key(id_fornecedor) references fornecedor(id)  
        on delete restrict
        on update cascade
);

/*3 - Adicionando coluna*/
alter table fornecedor add column data_ultima_compra date not null;

/*4 - Renomeando coluna*/
ALTER TABLE pedidos_produtos_fornecedor RENAME COLUMN data TO data_pedido;

/*5 - Deletando coluna*/
ALTER TABLE produtos DROP COLUMN data_cadastro;

/*6 - Alterando restrições de chave primária*/
ALTER TABLE produtos
        DROP FOREIGN KEY produtos_fk_categoria;

ALTER TABLE produtos
        ADD constraint categoria_fk_produtos
        foreign key(id_categoria) references categoria(id)
        on delete cascade
        on update restrict;

/*7 - Alterando o valor varchar de uma coluna*/
ALTER TABLE fornecedor MODIFY nome varchar(130);

/*8 - Excluindo tabela com restrição de chave estrangeira*/
DROP TABLE fornecedor;
MySqlError { ERRO 1451 (23000): Não é possível excluir ou atualizar uma linha pai: falha de restrição de chave estrangeira }

O sgbd não autorizou a exclusão da tabela por causa da declaração de restrição na foreign key "on delete restrict".

/*9 - Adicionando nova coluna em tabela*/

alter table pedidos_produtos_fornecedor add column numero_do_pedido varchar(20) not null unique;

/*10 - */

insert into categoria(nome) 
values
('bebidas'),
('doces'),
('limpeza'),
('pets'),
('carnes');


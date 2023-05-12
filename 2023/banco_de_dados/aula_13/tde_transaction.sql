--Modelo conceitual - https://app.brmodeloweb.com/#!/conceptual/645922a719e7f27dc3850c2b

--Criação de tabelas no SGBD MySQL
create table ingredientes(
    cod_ingrediente int primary key auto_increment,
    nome varchar(25) not null,
    data_validade date not null,
    qtd_estoque_ingrediente int not null
);
create table produtos(
    cod_produto int primary key auto_increment,
    nome varchar(25) not null,
    categoria varchar(20) not null,
    preco decimal(12,2) not null,
    qtd_estoque_produto int not null
);
create table receitas(
    cod_receita int primary key auto_increment,
    descricao varchar(1500) not null,
    cod_produto int not null,
    constraint produtos_fk_receitas
    foreign key(cod_produto) references produtos(cod_produto)
        on delete restrict 
        on update cascade
);
create table ingredientes_receitas(
    cod_ingrediente_receita int primary key auto_increment,
    qtd_ingrediente int not null,
    cod_receita int not null,
    cod_ingrediente int not null,
    constraint receitas_fk_ingredientes_receitas
    foreign key(cod_receita) references receitas(cod_receita)
        on delete restrict
        on update cascade,
    constraint ingredientes_fk_ingredientes_receitas
    foreign key(cod_ingrediente) references ingredientes(cod_ingrediente)
        on delete restrict
        on update cascade         
);
create table producoes(
    cod_producao int primary key auto_increment,
    qtd_produzida_lote int default 0,
    lote int not null,
    data_producao date not null,
    status_fabricacao varchar(20) not null
);
create table itens_produtos_producoes(
    cod_item_produto_producao int primary key auto_increment,
    qtd_produzida_produto int not null,
    cod_produto int not null,
    cod_producao int not null,
    constraint produtos_fk_itens_produtos_producoes
    foreign key(cod_produto) references produtos(cod_produto)
        on delete restrict
        on update cascade,
    constraint producoes_fk_itens_produtos_producoes
    foreign key(cod_producao) references producoes(cod_producao)
        on delete restrict
        on update cascade  
);
--Trigger para garantir a semântica
DELIMITER $$
CREATE TRIGGER tr_adicionando_qtd_produtos_produzidos_quando_insert BEFORE INSERT ON itens_produtos_producoes
    FOR EACH ROW
begin
    update producoes set qtd_produzida_lote = qtd_produzida_lote + new.qtd_produzida_produto
    where cod_producao = new.cod_producao;

    update producoes set data_producao = current_date where cod_producao = new.cod_producao;
end $$
DELIMITER ;

--Alterar a tabela de Produtos e incluir o tempo de validade. 
alter table produtos add data_validade_produto datetime;

--Inserção de dados 
insert into produtos(nome,categoria,qtd_estoque_produto,preco)
values
        ('Bolo de cenoura','Bolos',0,36.00),
        ('Pão francês','Pães',0,20.00);
insert into ingredientes(nome,data_validade,qtd_estoque_ingrediente)
values
        ('Farinha de trigo','2023-08-12',15000),
        ('Sal','2023-09-26',5000),
        ('Açucar','2023-05-20',2000),
        ('Fermento biológico seco', '2023-07-23',1000),
        ('Cenoura', '2023-05-16',10000),
        ('Óleo','2023-06-21',10000),
        ('Ovos','2023-07-28',360),
        ('Leite condensado','2023-08-17',19750),
        ('Chocolate em pó','2023-08-21',10000),
        ('Leite','2023-05-26',20000),
        ('Água mineral','2023-09-23',50000),
        ('Manteiga','2023-09-28',2000);


insert into receitas (cod_produto,descricao)
values 
    (1,'
        Para o bolo:
        300 g de cenouras médias raladas
        3 ovos
        200g de açúcar
        120ml de óleo
        260g de farinha de trigo
        12g de fermento em pó
        300ml de leite
        Para a cobertura:

        395ml lata de leite condensado
        15g colher de sopa de manteiga
        120ml de leite
        Instruções:

        Pré-aqueça o forno a 180°C.

        Em um liquidificador, bata as cenouras, os ovos, o açúcar e o óleo até obter uma mistura homogênea.

        Em uma tigela grande, misture a farinha de trigo e o fermento em pó.

        Adicione a mistura de cenoura à mistura de farinha de trigo e mexa bem até que fique homogêneo.

        Despeje a massa em uma forma untada e enfarinhada.

        Asse o bolo no forno pré-aquecido por cerca de 30 a 40 minutos, ou até que um palito inserido no centro do bolo saia limpo.

        Para a cobertura, em uma panela, misture o leite condensado, a manteiga e o leite. Leve ao fogo médio, mexendo sempre, até que a mistura engrosse e fique com uma cor caramelada.

        Despeje a cobertura sobre o bolo ainda quente e deixe esfriar antes de servir.'
    ),
    (2,'
        Ingredientes:
        500g de farinha de trigo
        10g de sal
        10g de açúcar
        10g de fermento biológico seco
        300ml de água morna
        Instruções:

        Em uma tigela grande, misture a farinha, o sal e o açúcar.

        Adicione o fermento biológico seco e misture novamente.

        Despeje a água morna sobre a mistura de farinha e misture bem até obter uma massa homogênea.

        Amasse a massa em uma superfície enfarinhada por cerca de 10 minutos até que ela fique lisa e elástica.

        Coloque a massa de volta na tigela e cubra com um pano limpo. Deixe descansar por cerca de uma hora em um lugar quente e sem correntes de ar, até que a massa dobre de tamanho.

        Preaqueça o forno a 220°C.

        Divida a massa em pedaços e modele-os em forma de pão francês.

        Coloque os pães em uma assadeira enfarinhada e deixe descansar novamente por cerca de 10 a 15 minutos.

        Faça cortes na superfície dos pães com uma faca afiada.

        Asse os pães no forno preaquecido por cerca de 20 a 25 minutos, ou até que fiquem dourados.

        Retire do forno e deixe esfriar um pouco antes de servir.'
    );

insert into ingredientes_receitas(cod_ingrediente,qtd_ingrediente,cod_receita)
values
        (1,260,1),
        (3,200,1),
        (4,12,1),
        (5,300,1),
        (6,120,1),
        (7,3,1),
        (8,395,1),
        (10,420,1),
        (12,15,1),
        (1,500,2),
        (2,10,2),
        (3,10,2),
        (4,10,2),
        (11,300,2);
insert into producoes(lote,data_producao,status_fabricacao)
values
    (2345,'2023-05-09','Concluido'),
    (2346,'2023-05-11','Em andamento'),
    (2349,'2023-05-09','Cancelado'),
    (2348,'2023-05-09','Concluido');

insert into itens_produtos_producoes(cod_produto,qtd_produzida_produto,cod_producao)
values
    (1,10,1),
    (1,20,2),
    (2,60,3),
    (2,120,4);
--Exibir quantos produtos há para cada categoria
select count(cod_produto) as qtd_produto_por_categoria, categoria
from produtos
group by(categoria);

--Exibir todos os produtos, quais ingredientes e em que quantidade são  utilizados para produzi-lo

select  p.nome,p.categoria,p.qtd_estoque_produto, i.nome, ir.qtd_ingrediente
from receitas r
join produtos p
	on p.cod_produto = r.cod_produto
join ingredientes_receitas ir
	on ir.cod_receita = r.cod_receita
join ingredientes i
	on i.cod_ingrediente = ir.cod_ingrediente

--Exibir qual a quantidade produzida de cada produto dos últimos 30 dias

select p.nome,SUM(ipp.qtd_produzida_produto) as qtd_total_produzido
from itens_produtos_producoes ipp
join producoes pc
	on pc.cod_producao = ipp.cod_producao
join produtos p
	on p.cod_produto = ipp.cod_produto
where timestampdiff(DAY,pc.data_producao, current_date) <= 30  && pc.status_fabricacao = 'Concluido'
group by(p.cod_produto)

--Se for dobrada a produção para o próximo mês, quanto de ingrediente será  necessário.
create view view_qtd_produzida_dobrada
as
select p.cod_produto,p.nome,SUM(ipp.qtd_produzida_produto * 2 ) as qtd_total_produzido
from itens_produtos_producoes ipp
join producoes pc
	on pc.cod_producao = ipp.cod_producao
join produtos p
	on p.cod_produto = ipp.cod_produto
where timestampdiff(DAY,pc.data_producao, current_date) <= 30  && pc.status_fabricacao = 'Concluido'
group by(p.cod_produto)

select vqpd.cod_produto,vqpd.nome as nome_produto,vqpd.qtd_total_produzido,i.nome as nome_ingrediente, ir.qtd_ingrediente, SUM((vqpd.qtd_total_produzido * ir.qtd_ingrediente)) as qtd_necessaria_ingredientes_com_producao_dobrada
from view_qtd_produzida_dobrada vqpd
join receitas r
	on r.cod_produto = vqpd.cod_produto
join ingredientes_receitas ir
	on ir.cod_receita = r.cod_receita
join ingredientes i
	on i.cod_ingrediente = ir.cod_ingrediente
group by(i.nome)

--Mostrar os ingredientes que nunca foram utilizados
select * 
from ingredientes i
left join ingredientes_receitas ir
	on ir.cod_ingrediente = i.cod_ingrediente
where ir.qtd_ingrediente is null

--Crie uma trigger para garantir o controle de estoque dos produtos fabricados. Quanto um produto for fabricado deve dar saída dos estoque dos ingredientes utilizados. Caso ocorra o estorno da fabricação, manter o estoque dos ingredientes atualizado também;

DELIMITER $$
CREATE TRIGGER tr_alterar_estoque_produto_quando_insert before insert on itens_produtos_producoes
begin 

    declare v_qtd_total_produzida int;
    declare v_cod_produto_fabricado int;
    declare v_cod_ingrediente int;
    declare v_status_fabricacao varchar(20);
    declare v_qtd_atual_estoque_ingrediente_produzidos int;
    declare v_qtd_atual_estoque_ingrediente_cancelados int;
    declare i int;


    select p.status_fabricacao, new.qtd_produzida_produto, new.cod_produto
    set v_status_fabricacao,v_qtd_total_produzida,v_cod_produto_fabricado
    from producoes p
    where p.cod_producao = new.cod_producao && p.status_fabricacao = 'Concluido' || p.status_fabricacao = 'Em andamento';

    select count(i.nome_ingrediente)
    set i
    from receitas r
    join ingredientes_receitas ir
        on ir.cod_receita = r.cod_receita
    join ingredientes i
        on i.cod_ingrediente = ir.cod_ingrediente
    where r.cod_produto = v_cod_produto_fabricado
    group by(i.nome);

    if v_status_fabricacao != null  then  
        start transaction;
            select i.cod_ingrediente,SUM(i.qtd_estoque_ingredientes-(ir.qtd_ingrediente * view_qtd_produzida)) 
            set v_cod_ingrediente,v_qtd_atual_estoque_ingrediente_produzidos
            from receitas r
            join ingredientes_receitas ir
                on ir.cod_receita = r.cod_receita
            join ingredientes i
                on i.cod_ingrediente = ir.cod_ingrediente
            where r.cod_produto = v_cod_produto_fabricado
            group by(i.nome)
            limit 1;

            update ingredientes set qtd_estoque_ingrediente = v_qtd_atual_estoque_ingrediente_produzidos
            where cod_ingrediente = v_cod_ingrediente;
        commit;
    else
    while(i > 0)
        start transaction;
            select SUM(i.qtd_estoque_ingredientes + (ir.qtd_ingrediente * view_qtd_produzida)) 
            set v_qtd_atual_estoque_ingrediente_cancelados
            from receitas r
            join ingredientes_receitas ir
                on ir.cod_receita = r.cod_receita
            join ingredientes i
                on i.cod_ingrediente = ir.cod_ingrediente
            where r.cod_produto = v_cod_produto_fabricado
            group by(i.nome)
            limit 1;

            update ingredientes set qtd_estoque_ingrediente = v_qtd_atual_estoque_ingrediente_produzidos
            where cod_ingrediente = v_cod_ingrediente;

            set i = i - 1;
        commit;
    end if;
end $$
DELIMITER ;

--Utilizando controle de transações, atualize as receitas para reduzir em 10% a  quantidade de fermento utilizada
start transaction;
    select SUM(ir.qtd_ingrediente - (ir.qtd_ingrediente * 0.10))
    from receitas r 
    join ingredientes_receitas ir
        on ir.cod_receita = r.cod_receita
    join ingredientes i
        on i.cod_ingrediente = ir.cod_ingrediente
    where i.nome = 'Fermento'

--Confirme a transação do exercício anterior
commit;


--Utilizando controle de transações, exclua todos os registros de produção do último mês

--Desfaça a transação realizada no exercício anterior
rollback;
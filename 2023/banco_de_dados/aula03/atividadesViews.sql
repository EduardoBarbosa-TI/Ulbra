create table status_orcamentos(
    cod_status int primary key,
    nome varchar(15) not null
);

create table orcamentos(
    cod_orcamento int primary key auto_increment,
    data_orcamento date not null,
    cod_status int not null,
    constraint status_orcamentos_fk_orcamentos
    foreign key(cod_status) references status_orcamentos(cod_status)
        on delete restrict
        on update cascade
);

create table produtos(
    cod_produto int primary key auto_increment,
    nome varchar(100) not null,
    valor decimal(12,2) not null,
    saldo int not null
);

create table orcamentos_produtos(
    cod_orcamento_produtos int primary key auto_increment,
    valor_unit decimal(12,2) not null,
    quantidade int not null,
    cod_produto int not null,
    cod_orcamento int not null,
    constraint produtos_fk_orcamentos_produtos
    foreign key(cod_produto) references produtos(cod_produto)
        on delete restrict
        on update cascade,
    constraint orcamentos_fk_orcamentos_produtos
    foreign key(cod_orcamento) references orcamentos(cod_orcamento)
        on delete restrict
        on update cascade
);

insert into status_orcamentos(cod_status,nome)
values
		(1,'Em orcamento'),
        (2,'Vendido'),
        (3,'Cancelado')

insert into orcamentos(data_orcamento,cod_status)
values
		('2014-02-05',2),
        ('2014-12-05',1),
        ('2014-03-09',3),
        ('2014-01-23',2),
        ('2014-07-15',1),
        ('2014-10-25',3)

insert into produtos(nome,valor,saldo)
values
		('Computador',1200,10),
        ('Mouse',300,20),
        ('Mouse pad',100,20),
        ('Gabinete',90,10),
        ('Teclado',250,30),
        ('Monitor',1320,12);

insert into orcamentos_produtos(valor_unit,quantidade,cod_produto,cod_orcamento)
values
		(1200,3,1,6),
        (300,1,2,5),
        (100,2,3,4),
        (90,1,4,3),
        (250,2,5,2),
        (1320,3,6,1)



create view lista_orcamentos_produtos
as
select o.cod_orcamento,o.data_orcamento,so.nome
from orcamentos o 
join orcamentos_produtos op
	on op.cod_orcamento = o.cod_orcamento
join produtos p 
	on p.cod_produto = op.cod_produto
join status_orcamentos so
	on so.cod_status = o.cod_status
group by(p.nome)


create view valor_total_produtos_periodos
as
select SUM(op.quantidade*op.valor_unit) as total_valor_produtos, o.data_orcamento
from orcamentos o 
join orcamentos_produtos op
	on op.cod_orcamento = o.cod_orcamento
join produtos p
	on p.cod_produto = op.cod_produto
group by(o.data_orcamento)


create view nome_produto_qtd_estoque
as
select p.cod_produto,p.nome,p.valor,p.saldo - (SUM(op.quantidade)) as quantidade_atual_estoque
from produtos p 
join orcamentos_produtos op
	on p.cod_produto = op.cod_produto
join orcamentos o
	on o.cod_orcamento = op.cod_orcamento
where p.nome = 'Computador' 
group by(p.nome)
having quantidade_atual_estoque > 0



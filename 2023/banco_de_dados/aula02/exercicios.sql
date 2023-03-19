--Escreva uma consulta que retorne o nome do cliente, a soma do valor total das compras e o número total de pedidos feitos por cada cliente, apenas para aqueles que fizeram pelo menos três pedidos. Use um inner join entre as tabelas "clientes" e "pedidos" e agrupe os resultados pelo nome do cliente.

CREATE TABLE clientes(
    cod_cliente int primary key auto_increment,
    nome varchar(100) not null,
    endereco varchar(100) not null   
);

CREATE TABLE pedidos(
    cod_pedido int primary key auto_increment,
    nome_pedido varchar(50) not null,  
    valor decimal(12,2) not null,
    quantidade int not null,
    data_pedido date not null,
    cod_cliente int not null,
    constraint clientes_fk_pedidos
    foreign key(cod_cliente) references clientes(cod_cliente)
        on delete restrict
        on update cascade   
);

select c.nome,count(c.nome) as qtd_pedidos, SUM(p.quantidade * valor) as valor_total
from clientes c
join pedidos p
	on p.cod_cliente = c.cod_cliente
group by(c.nome)
having pedidos >= 3



--Escreva uma consulta que retorne o nome do produto, a média do preço de venda e a soma total de unidades vendidas por categoria de produto. Use um left join entre as tabelas "produtos" e "vendas" e agrupe os resultados pela categoria do produto.

create table produtos(
	cod_produto int primary key auto_increment,
    nome varchar(30) not null,
    categoria varchar(30) not null
);

create table vendas(
	cod_venda int primary key auto_increment,
    valor decimal(12,2) not null,
    quantidade int not null,
    cod_produto int not null,
    constraint produtos_fk_vendas 
	foreign key(cod_produto) references produtos(cod_produto)
		on delete restrict
        on update cascade
);

insert into produtos(nome, categoria)
values 
		('Limpol', '1'),
        ('Vassoura', '1'),
        ('Qiboa', '1'),
        ('Trakinas', '2'),
        ('Passatempo', '2'),
        ('Teclado', '3'),
		('Monitor', '3'),
        ('Gabinete', '3'),
        ('Mouse', '3'),
        ('Laranja', '4'),
        ('Morango', '4'),
        ('Uva', '4')

insert into vendas(valor, quantidade, cod_produto)
values
		(8,5,4),
        (8,7,4),
        (7,3,5),
        (7,8,5),
        (8,5,1),
        (17,3,3),
        (12,5,1),
        (18,2,2),
        (18,4,2),
        (18,7,2),
        (18,7,2),
        (150,2,9),
        (800,1,7),
        (300,2,6),
        (600,1,8),
        (15,2,10),
        (233,7,11),
        (300,5,12)



select p.nome, avg(v.valor) as media_preco_venda, count(v.quantidade) as total_unidades_vendidas
from produtos p
left join vendas v
	on v.cod_produto = p.cod_produto
group by p.categoria


--Escreva uma consulta que retorne o nome do fornecedor, o nome do produto e o número total de unidades compradas por fornecedor e por produto, apenas para aqueles com mais de 100 unidades compradas. Use um inner join entre as tabelas "fornecedores", "produtos" e "compras" e agrupe os resultados pelo nome do fornecedor e pelo nome do produto.

create table fornecedores(
	cod_fornecedor int primary key auto_increment,
    nome varchar(100) not null
);

create table produtos(
	cod_produto int primary key auto_increment,
    nome varchar(30) not null
);

create table compras(
	cod_venda int primary key auto_increment,
    quantidade int not null,
    cod_produto int not null,
    cod_fornecedor int not null,
    constraint produtos_fk_compras 
    foreign key(cod_produto) references produtos(cod_produto)
		on delete restrict 
        on update cascade,
	constraint fornecedores_fk_compras 
    foreign key(cod_fornecedor) references fornecedores(cod_fornecedor)
		on delete restrict
        on update cascade 
);

insert into fornecedores(nome)
values 
		('Eduardo'),
        ('Felipe'),
        ('Alexandre'),
        ('Ricardo'),
        ('João')

insert into produtos(nome)
values 
		('Detergente'),
        ('Esponja'),
        ('Rodo'),
        ('Vassoura'),
        ('Limpol')

insert into compras(quantidade,cod_produto,cod_fornecedor)
values 
		(3,4,5),
        (7,1,3),
        (2,4,2),
        (4,2,4),
        (9,3,5),
        (7,1,1),
        (3,5,3),
        (2,3,5),
        (1,2,2)


select p.nome, f.nome,SUM(c.quantidade) as total_unidades_compradas
from produtos p
join compras c 
	on c.cod_produto = p.cod_produto
join fornecedores f
	on f.cod_fornecedor = c.cod_fornecedor
group by f.nome, p.nome
having total_unidades_compradas > 100

--Escreva uma consulta que retorne o nome do departamento, o nome do funcionário e a média do salário dos funcionários em cada departamento, apenas para aqueles com uma média de salário superior a R$ 5000. Use um left join entre as tabelas "funcionarios" e "departamentos" e agrupe os resultados pelo nome do departamento e pelo nome do funcionário.

create table funcionarios(
	cod_funcionario int primary key auto_increment,
    nome varchar(100) not null,
    salario decimal(12,2) not null
);

create table departamento(
	cod_departamento int primary key auto_increment,
    nome varchar(100) not null,
    cod_funcionario int not null unique,
    constraint funcionarios_fk_departamento
    foreign key(cod_funcionario) references funcionarios(cod_funcionario)
		on delete restrict
        on update cascade
);

insert into funcionarios(nome,salario)
values 
		('Eduardo',5000),
        ('Matias',7000),
        ('Matheus',8000),
        ('José',9000),
        ('João',6000)

insert into departamento(nome,cod_funcionario)
values 
		('Setor C',1),
        ('Setor A',2),
        ('Setor B',3),
        ('Setor D',4),
        ('Setor C',5)

select d.nome as nome_departamento, f.nome as nome_funcionario, avg(f.salario) as media_salarial
from funcionarios f
left join departamento d
	on d.cod_funcionario = f.cod_funcionario
group by d.nome, f.nome
having media_salarial > 5000

--Escreva uma consulta que retorne o nome do cliente, o nome do produto e a soma do valor total das compras feitas por cada cliente para cada produto. Use um right join entre as tabelas "clientes" e "compras" e um inner join entre as tabelas "produtos" e "compras" e agrupe os resultados pelo nome do cliente e pelo nome do produto.

create table clientes(
	cod_cliente int primary key auto_increment,
    nome varchar(100) not null
);

create table produtos(
	cod_produto int primary key auto_increment,
    valor decimal(12,2) not null,
    nome varchar(30) not null
);

create table compras(
	cod_compra int primary key auto_increment,
    quantidade int not null,
    cod_produto int not null,
    cod_cliente int not null,
    constraint produtos_fk_compras 
    foreign key(cod_produto) references produtos(cod_produto)
		on delete restrict 
        on update cascade,
	constraint clientes_fk_compras 
    foreign key(cod_cliente) references clientes(cod_cliente)
		on delete restrict
        on update cascade 
);

select c.nome, p.nome, SUM(cp.quantidade*p.valor) as total_compras
from clientes c
right join compras cp
	on cp.cod_cliente = c.cod_cliente
join produtos p
	on p.cod_produto = cp.cod_produto
group by c.nome, p.nome

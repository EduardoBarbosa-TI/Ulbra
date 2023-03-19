/*
    Abordei uma regra de negócio de uma construtora local onde muitas obra podem ter muitos funcionários, cada funcionário tem um código, nome e salario. Esses funcionários tem direito a sacar uma parte do dinheiro durante a semana por questões de necessidades, podendo um funcionário realizar muitos saques que devem conter valor e data. 
    As obras contém o endereco e orcamento e desse orcamento é realizado saques semanlmente para pagar os funcionários, portanto uma obra pode realizar muitos saques que contém valor e data. 
*/

CREATE DATABASE eduardodb

CREATE TABLE obras(
	cod_obra int primary key auto_increment,
    endereco varchar(50) not null,
    orcamento decimal(12,2) not null
);

CREATE TABLE funcionarios(
	cod_funcionario int primary key auto_increment,
    nome varchar(100) not null,
    salario decimal(12,2) not null
);

CREATE TABLE obras_funcionarios(
    cod_obras_funcionarios int primary key auto_increment,
    cod_obra int not null,
    cod_funcionario int not null,
    constraint funcionarios_fk_obras_funcionarios 
    foreign key(cod_funcionario) references funcionarios(cod_funcionario)
        on delete restrict
        on update cascade,
    constraint obras_fk_obras_funcionarios
    foreign key(cod_obra) references obras(cod_obra)
        on delete restrict
        on update cascade
);

CREATE TABLE saque_salario_funcionario(
	cod_saque int primary key auto_increment,
    valor decimal(12,2) not null,
    data_saque date not null,
    cod_funcionario int not null,
    constraint funcionarios_fk_saque_salario_funcionarios
    foreign key(cod_funcionario) references funcionarios(cod_funcionario)
		on delete restrict
        on update cascade
);

CREATE TABLE saque_orcamento_obra(
	cod_saque int primary key auto_increment,
    valor decimal(12,2) not null,
    data_saque date not null,
    cod_obra int not null,
    constraint obras_fk_saque_orcamento_obra
    foreign key(cod_obra) references obras(cod_obra)
		on delete restrict
        on update cascade
);

insert into obras(endereco,orcamento)
values
		('Porto Coronado LOTE: F03',18900000),
        ('Porto Coronado LOTE: P03',28900000),
        ('Porto Coronado LOTE: I03',30000000),
        ('Porto Coronado LOTE: A03',50000000),
        ('Porto Coronado LOTE: Y03',40000000)

insert into funcionarios(nome,salario)
values
		('Eduardo',4000),
        ('Paulo',8000),
        ('Ricardo',7000),
        ('Jonathas',5000),
        ('José',3000)

insert into obras_funcionarios(cod_funcionario,cod_obra)
values 
	(1,5),
    (2,4),
    (3,3),
    (4,2),
    (5,1)


insert into saque_orcamento_obra(valor,data_saque,cod_obra)
values
		(30000,'2023-03-09',1),
        (35000,'2023-02-20',2),
        (30000,'2023-02-09',3),
        (50000,'2023-02-13',4),
        (40000,'2023-01-09',5)

insert into saque_salario_funcionario(valor,data_saque,cod_funcionario)
values
		(50,'2023-03-09',1),
        (100,'2023-02-20',2),
        (70,'2023-02-09',3),
        (50,'2023-02-13',4),
        (40,'2023-01-09',5)
--Atividades


--Realizar uma consulta que liste os nomes e salários dos funcionários que trabalham na obra com o lote F03

select f.nome,f.salario
from obras_funcionarios ofs
join obras o 
	on o.cod_obra = ofs.cod_obra
join funcionarios f 
	on f.cod_funcionario = ofs.cod_funcionario
where o.endereco LIKE '%F03'


--Realizar uma consulta que liste quais obras realizaram os maiores orçamentos no mês de fevereiro

select max(soo.valor) as saque_maximo, o.endereco
from obras o
join saque_orcamento_obra soo
	on soo.cod_obra = o.cod_obra
where soo.data_saque >= '2023-02-01' and soo.data_saque <= '2023-02-28' 
group by soo.valor
order by soo.valor desc

--Realizar uma consulta que conte quantos funcionários realizaram saques de seu salario no mês de Fevereiro

Select f.cod_funcionario, f.nome,count(f.cod_funcionario) as saques_funcionarios
from funcionarios f
left join saque_salario_funcionario ssf
    on f.cod_funcionario = ssf.cod_funcionario
where ssf.data_saque >= "2023-02-01" and ssf.data_saque <= "2023-02-28"
group by f.nome
order by saques_funcionarios DESC

--Realizar uma consulta que conte quantos funcionários realizaram saques de seu salario no mês de Fevereiro, mas apenas os funcionários que realizaram dois ou mais saques.
Select f.cod_funcionario, f.nome,count(f.cod_funcionario) as saques_funcionarios
from funcionarios f
left join saque_salario_funcionario ssf
    on f.cod_funcionario = ssf.cod_funcionario
where ssf.data_saque >= "2023-02-01" and ssf.data_saque <= "2023-02-28"
group by f.nome
having saques_funcionarios >= 2
order by saques_funcionarios DESC

--Realizar uma consulta que mostre a obra que realizou o maior saque do orçamento no mês de fevereiro
select o.cod_obra,o.endereco,soo.valor, soo.data_saque
from obras o 
right join saque_orcamento_obra soo
	on o.cod_obra = soo.cod_obra
where soo.data_saque >= "2023-02-01" and soo.data_saque <= "2023-02-28"
order by soo.valor DESC
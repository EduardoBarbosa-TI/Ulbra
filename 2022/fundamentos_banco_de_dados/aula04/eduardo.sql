create table construtoras(
	id int primary key auto_increment,
	nome varchar(100) not null
)

create table mestres_de_obras(
	id int primary key auto_increment,
	nome varchar(100) not null,
	chave_pix varchar(30),
	id_construtora int not null,
	foreign key(id_construtora) references construtoras(id)
		ON delete restrict
		on update cascade
)

create table obras (
	id int primary key auto_increment,
	nome_condominio varchar(30) not null ,
	quadra_lote char(5) not null ,
	data_conclusao date not null,
	preco decimal(12,2) not null,
	id_mestre_de_obras int not null,
		foreign key(id_mestre_de_obras) references mestres_de_obras(id)
			on delete restrict
			on update cascade

);

create table funcionarios(
	id int primary key auto_increment,
	nome varchar(100) not null,
	salario decimal(12,2) not null
	
);

create table funcionarios_has_obras(
	id int primary key auto_increment,
	id_obra int not null,
	id_funcionario int not null,
	foreign key(id_obra) references obras(id)
		on delete restrict
		on update cascade,
	foreign key(id_funcionario) references funcionarios(id)
		on delete restrict
		on update cascade
);




insert into construtoras(nome)
values  ('Mesturini e Bonato'),
		('Ferreirinhos'),
		('Moschetta'),
		('Raup')

insert into mestres_de_obras(nome,chave_pix,id_construtora)
values  ('Alexandre','5185539384', '1'),
		('Paulo','5180039384', '4'),
		('Jocenir','5188839384', '3'),
		('Jose','5185449384', '2')
		


INSERT INTO obras(nome_condominio,quadra_lote,data_conclusao,preco,id_mestre_de_obras)
VALUES  ('Ventura','L11','2022-12-25','300000000.00','1'),
		('Celebration','I12','2022-12-15','300000000.00','1'),
		('Playa Vista','J11','2022-12-13','300000000.00','2'),
		('Enseada','U10','2022-11-25','300000000.00','3'),
		('Capão Ilhas','T21','2022-11-20','300000000.00','4'),
		('Porto Coronado','K19','2022-10-25','300000000.00','4')


INSERT INTO funcionarios (nome,salario)
VALUES  ('Jose','2000.00'),
		('Paulo','2000.00'),
		('Ricardo','4000.00'),
		('Jocenir','7000.00'),
		('Mikael','6000.00'),
		('Eduardo','2000.00'),
		('Joao','2000.00'),
		('Pedro','2000.00'),
		('Gabriel','2000.00'),
		('Arthur','2000.00'),
		('Beto','3000.00'),
		('Jair','6000.00'),
		('Messi','7000.00'),
		('Elon Musk','9000.00'),
		('Jose','5000.00'),
        ('jhonatan','2000.00'),
		('Gabriel carioca','2000.00'),
		('Arthur paulista','2000.00'),
		('Beto alemao','3000.00'),
		('Paulo jose','6000.00'),
		('Rober','7000.00'),
		('Mancha','9000.00'),
		('Mael','5000.00')
		
INSERT INTO funcionarios_has_obras(id_obra,id_funcionario)
VALUES (1,23),
(1,22),
(1,21),
(1,20),
(2,19),
(2,18),
(3,17),
(3,16),
(3,15),
(3,14),
(4,13),
(4,12),
(4,11),
(4,10),
(4,9),
(3,8),
(3,7),
(3,6),
(2,5),
(2,4),
(1,3),
(1,2),
(1,1)
	

--Liste o nome e salário dos funcionários que ganham mais de 2000,00
select f.nome, f.salario
from funcionarios f
where f.salario = 2000.00

--Liste quantos funcionários tem em cada obra que não foi concluída
select count(fo.id_funcionario)
from funcionarios_has_obras fo 
	inner join obras o
		on o.id = fo.id_obra
where o.data_conclusao > current_date


--Liste o nome de todos os mestres de obras que já concluíram as obras
select mo.nome
from obras o 
	inner join mestres_de_obras mo
		on mo.id = o.id_mestre_de_obras
where o.data_conclusao < current_date

--Liste o nome do condominio das obras em que mestre de obras tem mais que uma obra e o nome do mestre de obras  


select m.id, m.nome,o.nome_condominio, count(m.id) as mestre
from mestres_de_obras m
 inner join obras o
	on o.id_mestre_de_obras = m.id
group by m.id
having mestre > 1

--Liste o total do salário de todos os funcionários por cada obra que ainda não foi concluída 

select o.nome_condominio, o.quadra_lote, sum(f.salario) as soma_salario
from funcionarios_has_obras fo
	inner join obras o
		on o.id = fo.id_obra
	inner join funcionarios f
		on f.id = fo.id_funcionario
where o.data_conclusao >current_date
group by nome_condominio


--Agora DBA eu quero saber o salário e o nome de cada funcionário e identificar o condomínio, quadra e lote desses funcionários mas apenas para os funcionários que têm seu mestre de obra com mais de uma obra, independente se ela está ou não em andamento.

-- Porém DBA esqueci de dizer que e quero a consulta anterior em ordem ASC de nome dos mestres de obras e DEC de nome das construtoras 

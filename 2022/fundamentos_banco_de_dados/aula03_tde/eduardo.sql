CREATE DATABASE eduardodb

CREATE TABLE editoras(
	id int primary key auto_increment,
    nome varchar(40) not null   
);

CREATE TABLE assuntos(
	sigla char(1) primary key,
    descricao varchar(40) not null
);

CREATE TABLE livros(
	id int primary key auto_increment,
    titulo varchar(80) not null,
    preco decimal(12,2) not null,
    lancamento date,
    assunto char(1) not null,
    editora int not null,
    constraint assuntos_fk_livros
		foreign key(assunto) references assuntos(sigla)
			on delete restrict
            on update cascade,
	constraint editoras_fk_livros
		foreign key(editora) references editoras(id)
			on delete restrict
            on update cascade
);

CREATE TABLE autores(
	matricula int primary key auto_increment,
    nome varchar(40) not null,
    cpf char(11) not null unique,
    endereco varchar(50) not null,
    data_nascimento date not null,
    nacionalidade varchar(30) not null
);

CREATE TABLE autores_livros(
    id int primary key auto_increment,
	matricula int not null,
    id_livro int not null,
    constraint autores_fk_autores_livros 
		foreign key(matricula) references autores(matricula)
			on delete restrict
            on update cascade,
	constraint livros_fk_autores_livros
		foreign key(id_livro) references livros(id)
			on delete restrict
            on update cascade
);


insert into editoras(nome) 
values 
	('MIRANDELA EDITORA'),
    ('EDITORA VIA-NORTE'),
    ('EDITORA ILHAS TIJUCAS'),
    ('MARIA JOSÉ EDITORA')

insert into assuntos(sigla,descricao)
values 
	('B','BANCO DE DADOS'),
    ('P','PROGRAMAÇÃO'),
    ('R','REDES'),
    ('S','SISTEMA OPERACIONAIS')

insert into livros(titulo,preco,lancamento,assunto,editora)
values  ('BANCO DE DADOS PARA A WEB',31.20,'1999-10-01','B',1),
		('PROGRAMANDO EM LINGUAGEM C',30.00,'1997-01-10','P',1),
		('PROGRAMANDO EM LINGUAGEM C++',111.50,'1998-11-01','P',3),
        ('REDES DE COMPUTADORES',42.00,'1996-09-01','R',2)

insert into livros(titulo,preco,assunto,editora)
values  ('BANCO DE DADOS NA BIOINFORMÁTICA',48.00,'B',2)

insert into autores(nome,cpf,endereco,data_nascimento,nacionalidade)
values  ('Jocenir','12345678911','rua jaguatirica',			'2001-12-06', 'brasileiro'),
		('André','12345678912','rua são luis','2001-12-03', 'brasileiro'),
		('Jair','12345678913','rua paulo teixeira','2001-12-08', 'brasileiro'),
		('William','12345678914','rua leopardo','2001-12-09', 'estadunidense')

--3
--A
delete 
from livros l
where l.id >= 2 and l.preco > 50 and l.lancamento < current_date

--B
select a.cpf,a.nome,a.endereco
from autores a
where nome like '%joão%'

--C
delete
from livros
where titulo in( 'BANCO DE DADOS DISTRIBUÍDO','BANCO DE DADOS DISTRIBUÍDOS') 

--D
select a.nome, a.cpf
from autores a
where data_nascimento > '1990-01-00'

--E
select a.matricula,a.nome, a.endereco
from autores a
where endereco like '%rio de janeiro%'

--F
--SET SQL_SAFE_UPDATES = 0;

update livros set preco = 0 where lancamento is null or preco < 55

--G
delete
from livros 
where assunto NOT in('S','P','B')

--H
select count(matricula)
from autores 

--I
SELECT id_
FROM autores_livros

--J


--K
select avg(preco), editora
from livros
where preco > 45

--L
select editora, max(preco), min(preco),avg(preco)
from livros
where assunto in('S','P','B')

--M
select max(preco), min(preco),avg(preco)
from livros
where lancamento < '2022-11-22' and preco > 100


--4
--A
select l.titulo, l.preco * 0.10 as Opção_1,l.preco * 0.15 as Opção_2,l.preco * 0.20 as Opção_3
from livros l
where 
--B
select l.editora, l.assunto,l.titulo, e.id, e.nome
from editoras e
		right join livros l
			ON  l.lancamento is not null
order by l.preco DESC

--C
select a.nome,a.data_nascimento,a.nacionalidade
from autores_livros al
		left join livros l
			ON l.id = al.id_livro
		left join autores a
			ON a.matricula = al.matricula
where l.lancamento is null and a.nacionalidade = 'brasileiro'
order by a.nome 

--D
select a.nome, l.titulo
from autores_livros al
		left join autores a
			ON a.matricula = al.matricula 
		left join livros l
			ON al.id_livro =  l.id
where l.lancamento is not null
order by a.nome

--E
select   e.id, e.nome 
from autores_livros al
	left join livros l
		on l.id = al.id_livro
	left join autores a
		on a.matricula = al.matricula
	left join editoras e
		on e.id = l.editora
where a.nome = 'Ana da Silva'

--F
select  l.titulo,e.nome 
from livros l
	inner join autores_livros al
		on al.id_livro = l.id
	inner join editoras e
		on e.id = l.editora
where l.preco < 50

--G
select a.cpf, a.nome
from autores_livros al
	left join autores a
		on a.matricula = al.matricula
	left join livros l
		on l.id = al.id_livro
where l.preco > 50
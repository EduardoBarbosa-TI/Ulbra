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
    id_assunto char(1) not null,
    id_editora int not null,
    constraint assuntos_fk_livros
		foreign key(id_assunto) references assuntos(sigla)
			on delete restrict
            on update cascade,
	constraint editoras_fk_livros
		foreign key(id_editora) references editoras(id)
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
values  ('Jocenir','12345678911','rua jaguatirica','2001-12-06', 'brasileiro'),
		('André','12345678912','rua são luis','2001-12-03', 'brasileiro'),
		('Jair','12345678913','rua paulo teixeira','2001-12-08', 'brasileiro'),
		('William','12345678914','rua leopardo','2001-12-09', 'estadunidense')


--3
--A
delete 
from livros l
where l.id >= 2 and l.preco > 50 and l.lancamento < current_date;

--B
select a.cpf,a.nome,a.endereco
from autores a
where nome like '%joão%';

--C
delete
from livros
where titulo like 'BANCO_ DE DADO_ DISTRIBUÍDO_';


--D	
select a.nome, a.cpf
from autores a
where data_nascimento > '1990-01-01';

--E
select a.matricula,a.nome, a.endereco
from autores a
where endereco like '%rio de janeiro%';

--F
--SET SQL_SAFE_UPDATES = 0;

update livros set preco = 0 
where lancamento is null or preco < 55

--G
delete
from livros 
where assunto NOT in('S','P','B')

--H
select count(matricula) as quantos
from autores 

--I
SELECT avg(quantos) as media
from(
	select id_livro, count(matricula) as quantos,
	from autores_livros
	group by id_livro
) as nova_consulta
where media > 3

--J
select id_livro, count(matricula) as quantos
from autores_livros
group by id_livro
having quantos >= 2

--K
select editora_id, avg(preco) as media_por_editora
from 	livros
where 	preco>45
group by editora_id

--L
select id_editora, min(preco) as minimo, max(preco) as maximo, avg(preco) as media
from 	livros
where id_assunto in('S','P','B')
group by id_editora

--M
select id_editora, min(preco) as minimo, max(preco) as maximo, avg(preco) as media
from 	livros
where id_assunto in('S','P','B') and lancamento < current_date
group by id_editora
having maximo<100
--4
--A
SELECT e.id, e.nome, l.assunto_id, l.titulo, l.preco
from livros l 
        inner join editoras e ON e.id = l.id_editora
where l.lancamento < CURRENT_DATE
order by l.preco DESC, e.id ASC, l.titulo ASC

--B
SELECT e.id, e.nome, l.assunto_id, l.titulo, l.preco
from livros l 
        inner join editoras e ON e.id = l.id_editora
where l.lancamento < CURRENT_DATE
order by l.preco DESC, e.id ASC, l.titulo ASC

--C
SELECT a.nome, year(a.data_nasc) as ano, month(a.data_nasc) as mes, day(a.data_nasc) as dia
from livros l 
		inner join autores_livros al on al.id_livro = l.id
        inner join autores a on a.matricula = al.matricula
where l.lancamento > CURRENT_DATE and l.lancamento is null
order by a.nome ASC

--D
SELECT a.nome as autor, l.titulo as titulo_do_livro
from livros l 
		inner join autores_livros al 
			on al.id_livro = l.id
        inner join autores a 
			on a.matricula= al.matricula

where l.data_lancamento < CURRENT_DATE and l.data_lancamento is not null
order by a.nome ASC

--E
SELECT e.id, e.nome
from  livros l 
		inner join autores_livros al on al.id_livro = l.id
        inner join autores a 
			on a.matricula = al.matricula
        inner join editoras e 
			ON e.id = l.id_editora
where l.lancamento < CURRENT_DATE and a.nome like '%ana da silva%'


--F
select l.titulo,e.nome
from livros l,  
		inner join editoras e
			on e.id=l.id_editora
where l.preco < 50

--G
SELECT a.nome,a.cpf, l.titulo, max(l.preco) as maximo
from  livros l 
		inner join autores_livros al on al.livro_id = l.id
        inner join autores a on a.matricula = al.matricula
group by a.nome, l.titulo
having maximo > 50
CREATE DATABASE mariadb
	
CREATE TABLE Cidades(
	codcid int primary key auto_increment,
    nome varchar(100) not null,
    uf char(2) not null
);

CREATE TABLE Produtos(
	codprod int primary key auto_increment,
    descricao varchar(200),
    preco decimal(12,2) not null,
    nomeCategoria varchar(20) not null,
    descricaoCategoria varchar(50) not null
);

CREATE TABLE Filial(
	codFilial int primary key auto_increment,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    codCidade int not null,
    constraint cidade_fk_filial
    foreign key(codCidade) references Cidades(codcid)
		on delete restrict
        on update cascade
);

CREATE TABLE Empregados(
	codEmpregado int primary key auto_increment,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    ct int not null,
    rg varchar(15) not null unique,
    cpf char(11) not null unique,
    salario decimal(12,2) not null,
    codCidade int not null,
    codFilial int not null,
    constraint cidade_fk_empregados
    foreign key(codCidade) references Cidades(codcid)
		on delete restrict
        on update cascade,
	constraint filial_fk_empregados
	foreign key(codFilial) references Filial(codFilial)
		on delete restrict
        on update cascade
);

CREATE TABLE Vendas(
    codVenda int primary key auto_increment, 
	codProduto int not null,
    codFilial int not null,
    constraint produto_fk_vende
    foreign key(codProduto) references Produtos(codprod)
		on delete restrict
        on update cascade,
	constraint filial_fk_vende
    foreign key(codFilial) references Filial(codFilial) 
		on delete restrict 
        on update cascade
);

INSERT INTO Cidades(nome,uf)
VALUES
	('Rio Grande do Sul', 'RS'),
    ('São Paulo', 'SP'),
    ('Minas Gerais', 'MG'),
    ('Mato Grosso do Sul', 'MS'),
    ('Espírito Santo', 'ES')

INSERT INTO Produtos(preco,nomeCategoria,descricaoCategoria)
VALUES 
	(1.200, 'Colchões', 'Colchões ultra macios com molas'),
    (1.000, 'Computadores', 'Computadores de última geração'),
    (1.500, 'Tapetes', 'Pele do último mamute brasileiro'),
    (2.000, 'Ventiladores', 'Turbina de avião acoplada'),
    (2.200, 'Celulares', 'Celulares com 4GB Ram')

INSERT INTO Filial(nome, endereco,codCidade)
VALUES
('f1','Rua Jaguatirica, 575',1),
('f2','Rua Leopoldina, 465',2),
('f3','Rua Paulo Teixeira, 425',3),
('f4','Rua Ulbra, 135',4),
('f5','Rua Leão Marinho, 405',5) 

INSERT INTO Empregados(nome,endereco,ct,rg,cpf,salario,codCidade,codFilial)
VALUES
	('José','Rua Carlos Alves',39,21342456787,12345678912,2000,5,1),
    ('Carlos','Rua Josefina Santos',23,21546456757,12445798912,3000,4,2),
    ('João','Rua Vargas',32,21342856967,12352678912,5000,3,3),
    ('Ricardo','Rua Condado',13,21342146767,12325678912,3400,2,4),
    ('Raul','Rua Maria Luiza',34,1342566707,12895678912,2500,1,5)

INSERT INTO Vende(codProduto,codFilial)
VALUES 
	(1,5),
    (2,4),
    (3,3),
    (4,2),
    (5,1)
--3.
--B
SELECT MAX(preco) AS maior_preco
FROM Produtos
--C
SELECT AVG(preco) AS media_preco
FROM Produtos
--D
SELECT p.nomeCategoria
FROM Vende v
	INNER JOIN Filial f
		ON v.codFilial = f.codFilial
	INNER JOIN Produtos p
		ON p.codprod = v.codProduto
Where f.nome = 'f3'
--E
SELECT e.nome, e.rg
FROM Cidades c
	INNER JOIN Empregados e
		ON e.codCidade = c.codcid
WHERE c.nome = 'Rio Grande do Sul' AND e.salario > 500



--EXERCÍCIO 04

CREATE TABLE Cidades(
	codCidade int primary key auto_increment,
    nome varchar(100) not null, 
    uf char(2) not null
);

CREATE TABLE Categorias(
	codCategoria int primary key auto_increment,
    nome varchar(100) not null,
    descricao varchar(200)
);

CREATE TABLE Autores(
	codAutor int primary key auto_increment,
    nome varchar(100) not null,
    codCidade int not null,
    constraint cidade_fk_autor
    foreign key(codCidade) references Cidades(codCidade)
		on delete restrict
        on update cascade
);

CREATE TABLE Clientes(
	codCliente int primary key auto_increment,
    nome varchar(100) not null,
    endereco varchar(150) not null,
    codCidade int not null,
    constraint cidade_fk_cliente 
    foreign key(codCidade) references Cidades(codCidade)
		on delete restrict
        on update cascade
);

CREATE TABLE Livros(
	codLivro int primary key auto_increment,
    titulo varchar(100) not null,
    numero_folhas int not null,
    editora varchar(50) not null,
    valor decimal(12,2) not null,
    codAutor int not null,
    codCategoria int not null,
    constraint autor_fk_livro
    foreign key(codAutor) references Autor(codAutor)
		on delete restrict
        on update cascade,
	constraint categoria_fk_livro
    foreign key(codCategoria) references Categorias(codCategoria)
		on delete cascade 
        on update cascade
);

CREATE TABLE Vendas(
	codVenda int primary key auto_increment,
    quantidade int not null,
    data_venda date not null,
    codCliente int not null,
    codLivro int not null,
    constraint cliente_fk_venda
    foreign key(codCliente) references Clientes(codCliente)
		on delete restrict
		on update cascade,
	foreign key(codLivro) references Livro(codLivro)
		on delete restrict
        on update cascade
);

INSERT INTO Categorias(nome,descricao)
VALUES 
		('Back-end','As melhores práticas para desenvolvimento back-end'),
        ('Banco de Dados','Banco cheio de dados'),
        ('Front-end','Desenvolvimento prático com Wordpress'),
        ('Habilidades Práticas do Agile Software','As melhores metodologias para desenvolvimento ágil de softwares'),
        ('Metodologias Waterfall','Seguindo metodologias Go Horse')

INSERT INTO Cidades(nome,uf)
VALUES 
	('Rio Grande do Sul','RS'),
    ('Rio de Janeiro','RJ'),
	('São Paulo','SP'),
    ('Minas Gerias','MG'),
    ('Mato Grosso do Sul','MS')


 INSERT INTO Autores(nome,codCidade)
 VALUES
		('José', 5),
        ('João', 4),
        ('Josefino', 3),
        ('Marcos', 2),
        ('Tula', 1)

INSERT INTO Clientes(nome,endereco,codCidade)
VALUES
		('Roberta','Rua Paulo teixeira, 593',5),
        ('Everton','Rua Maria teixeira, 643',4),
        ('Carlos','Rua José teixeira, 233',3),
		('Jairo','Rua Ricardo teixeira, 323',2),
        ('Jonathas','Rua Paulinho teixeira, 213',1)

INSERT INTO Livro(titulo,numero_folhas,editora,valor,codAutor,codCategoria)
VALUES
		('Código Sujo',450,'Go Horse',1800,1,5),
        ('Código Limpo',780,'Alta Books',800,4,4),
        ('Resolvendo o Front-end',200,'Brasil verde',300,2,3),
        ('Banco de dados powerful',140,'Alta Luke',200,3,2),
        ('Resolvendo o Back-end',470,'Alta Bank',400,5,1)

INSERT INTO Vendas(quantidade,data_venda,codCliente,codLivro)
VALUES
		(4,'2022-01-19',5,1),
        (4,'2022-02-13',4,2),
        (5,'2020-09-25',3,3),
        (6,'2021-08-23',2,4),
        (9,'2023-04-12',1,5)
      
--5-A
SELECT count(v.codVenda) AS total_de_vendas
FROM Vendas v

--B
SELECT l.titulo,l.valor, c.nome AS nome_categoria
FROM Livros l
INNER JOIN Categorias c
	ON c.codCategoria = l.codCategoria
WHERE c.nome = 'Banco de Dados'

--C


--D
SELECT c.nome,l.titulo, v.quantidade 
FROM Vendas v
INNER JOIN Livros l
	ON l.codLivro = v.codLivro
INNER JOIN Clientes c
	ON c.codCliente = v.codCliente
ORDER BY c.nome

--E

SELECT l.codLivro, l.titulo, a.nome
FROM Vendas v, Livros l
INNER JOIN Autores a
	ON a.codAutor = l.codLivro
where v.data_venda >= '2021-03-01' and v.data_venda <= '2021-03-31'

--F
SELECT SUM(v.quantidade), l.titulo, a.nome
FROM Vendas v
INNER JOIN Livros l
	ON l.codLivro = v.codLivro
INNER JOIN Autores a
	ON a.codAutor = l.codAutor
WHERE v.data_venda LIKE '20%-01-%' and v.data_venda LIKE '20%-01-%'
GROUP BY(l.codLivro)
LIMIT 5

--G

SELECT DISTINCT c.nome, l.titulo
FROM Vendas v
INNER JOIN Clientes c
	ON c.codCliente = v.codCliente
INNER JOIN Livro l
	ON l.codLivro = v.codLivro
WHERE l.titulo = 'Banco de dados powerful'
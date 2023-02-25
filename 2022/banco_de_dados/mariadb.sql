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

CREATE TABLE Vende(
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
	('José','Rua Carlos Alves',39,21342456787,12345678912,2.000,5,1),
    ('Carlos','Rua Josefina Santos',23,21546456757,12445798912,3.000,4,2),
    ('João','Rua Vargas',32,21342856967,12352678912,5.000,3,3),
    ('Ricardo','Rua Condado',13,21342146767,12325678912,3.400,2,4),
    ('Raul','Rua Maria Luiza',34,1342566707,12895678912,2.500,1,5)

INSERT INTO Vende(codProduto,codFilial)
VALUES 
	(1,5),
    (2,4),
    (3,3),
    (4,2),
    (5,1)
--3
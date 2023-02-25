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

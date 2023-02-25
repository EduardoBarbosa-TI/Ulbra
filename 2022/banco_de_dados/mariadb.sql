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
    rg varchar(15) not null,
    cpf char(11) not null,
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
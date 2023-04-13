create table obras(
  cod_obra int primary key auto_increment,
  endereco varchar(100) not null,
  orcamento decimal(12,2) not null,
  
)

create table funcionarios(
	  cod_funcionario int primary key auto_increment,
    nome varchar(100) not null,
    salario decimal(12,2) not null,
    chave_pix varchar(20) not null,
    cod_obra int not null,
    constraint obras_fk_funcionarios 
    foreign key(cod_obra) references obras(cod_obra)
		on delete restrict
        on update cascade
);

create table salario(
  cod_salario int primary key auto_increment,
  valor decimal(12,2) not null
);

create table salario_funcionarios(
  cod_salario_funcionario int primary key auto_increment,
  cod_funcionario int not null,
  cod_salario int not null,
  constraint salario_funcionarios_fk_funcionarios
  foreign key(cod_funcionario) references funcionarios(cod_funcionario)
    on delete restrict
    on update cascade,
  constraint salario_funcionario_fk_funcionarios
  foreign key(cod_salario) references salarios(cod_salario)
    on delete restrict
    on update cascade
);



--MODELAGEM CONCEITUAL:::
--BR MODELO : https://app.brmodeloweb.com/#!/conceptual/641f468f7c7a923fda73aa6c

create table obras(
  cod_obra int primary key auto_increment,
  endereco varchar(50) not null,
  orcamento decimal(12,2) not null,
  data_inicio date not null,
  data_conclusao date
);

create table equipes_terceirizadas(
  cod_equipe int primary key auto_increment,
  nome_equipe varchar(30) not null,
  qtd_integrantes_equipe int not null
);

create table funcionarios(
	  cod_funcionario int primary key auto_increment,
    nome varchar(100) not null,
    data_nascimento date not null,
    salario_semanal decimal(12,2) not null,
    cargo_atual varchar(20) not null,
    chave_pix varchar(50) not null,
    cod_obra int not null,
    constraint obras_fk_funcionarios 
    foreign key(cod_obra) references obras(cod_obra)
		  on delete restrict
      on update cascade
);

create table pagamentos_funcionarios(
  cod_pagamento int primary key auto_increment,
  valor_vale decimal(12,2) not null,
  data_pagamento_vale date not null,
  valor_pagamento decimal(12,2) not null,
  data_pagamento_salario date not null,
  cod_funcionario int not null,
  constraint pagamentos_fk_funcionarios
  foreign key(cod_funcionario) references funcionarios(cod_funcionario)
    on delete restrict
    on update cascade
);

create table saques_orcamentos(
  cod_saque int primary key auto_increment,
  valor decimal(12,2) not null,
  data_saque date not null,
  cod_obra int not null,
  constraint obras_fk_saques_orcamentos
  foreign key(cod_obra) references obras(cod_obra)
    on delete restrict
    on update cascade  
);

create table obras_equipes_terceirizadas(
  cod_obra_equipe_terceirizada int primary key auto_increment,
  data_entrada date not null,
  data_saida date,
  valor_acertado decimal(12,2) not null,
  cod_obra int not null,
  cod_equipe int not null,
  constraint obras_fk_obras_equipes_terceirizadas
  foreign key(cod_obra) references obras(cod_obra)
    on delete restrict
    on update cascade,
  constraint equipes_terceirizadas_fk_obras_equipes_terceirizadas
  foreign key(cod_equipe) references equipes_terceirizadas(cod_equipe)
    on delete restrict
    on update cascade 
);

create table pagamentos_equipes(
  cod_pagamento_equipe int primary key auto_increment,
  valor decimal(12,2) not null,
  data_pagamento date not null,
  cod_equipe int not null,
  constraint equipes_terceirizadas_fk_pagamento_equipes
  foreign key(cod_equipe) references equipes_terceirizadas(cod_equipe)
    on delete restrict
    on update cascade
);

--Inserção de dados

insert into vales_salarios(valor,data_pagamento_vale, cod_funcionario)
VALUES
  (20.00,'2023-04-02',1),
  (200.00,'2023-04-02',9),
  (150.00,'2023-04-02',8),
  (50.00,'2023-04-02',2),
  (80.00,'2023-04-02',6),
  (150.00,'2023-04-02',4)

INSERT INTO pagamentos_funcionarios (valor, data_pagamento, cod_funcionario) VALUES
  (1500.00, '2023-04-07', 1),
  (1300.00, '2023-04-07', 2),
  (1400.00, '2023-04-07', 3),
  (1600.00, '2023-04-07', 4),
  (1800.00, '2023-04-07', 5),
  (1200.00, '2023-04-07', 6),
  (1700.00, '2023-04-07', 7),
  (1500.00, '2023-04-07', 8),
  (1350.00, '2023-04-07', 9),
  (1450.00, '2023-04-07', 10),
  (1550.00, '2023-04-07', 11);
  
INSERT INTO pagamentos_equipes (valor, data_pagamento, cod_equipe) VALUES
  (3500.00, '2023-05-05', 1),
  (3100.00, '2023-05-26', 2),
  (4200.00, '2023-06-09', 3),
  (3600.00, '2023-06-16', 4),
  (3900.00, '2023-07-07', 5),
  (4000.00, '2023-07-14', 6),
  (3500.00, '2023-07-21', 1),
  (3100.00, '2023-08-04', 2),
  (4200.00, '2023-08-11', 3),
  (3600.00, '2023-08-18', 4),
  (3900.00, '2023-09-01', 5),
  (4000.00, '2023-09-08', 6),
  (3500.00, '2023-09-15', 1),
  (3100.00, '2023-09-22', 2),
  (4200.00, '2023-10-06', 3),
  (3600.00, '2023-10-13', 4),
  (3900.00, '2023-11-03', 5),
  (4000.00, '2023-11-10', 6);
  

INSERT INTO obras_equipes_terceirizadas (data_entrada, data_saida, valor_acertado, cod_obra, cod_equipe) VALUESb
  ('2023-05-01', '2023-05-30', 12500.00, 1, 1),
  ('2023-05-01', '2023-05-30', 11400.00, 2, 2),
  ('2023-06-01', '2023-06-30', 15500.00, 3, 3),
  ('2023-06-01', '2023-06-30', 13400.00, 4, 4),
  ('2023-07-01', '2023-07-30', 12600.00, 5, 5),
  ('2023-07-01', '2023-07-30', 13600.00, 6, 6);






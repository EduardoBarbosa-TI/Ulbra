--MODELAGEM CONCEITUAL:::
--BR MODELO : https://app.brmodeloweb.com/#!/conceptual/641f468f7c7a923fda73aa6c

create table obras(
  cod_obra int primary key auto_increment,
  endereco varchar(50) not null,
  valor_orcamento decimal(12,2) not null,
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

create table vales_salarios(
  cod_vale int primary key auto_increment,
  valor_vale decimal(12,2) not null,
  data_pagamento_vale date(12,2) not null
);

create table pagamentos_funcionarios(
  cod_pagamento int primary key auto_increment,
  valor_pagamento decimal(12,2),
  data_pagamento_salario date,
  dias_faltados int,
  cod_vale int not null,
  cod_funcionario int not null,
  constraint pagamentos_funcionarios_fk_funcionarios
  foreign key(cod_funcionario) references funcionarios(cod_funcionario)
    on delete restrict
    on update cascade,
  constraint pagamentos_funcionarios_fk_vales_salarios
  foreign key(cod_vale) references vales_salarios(cod_vale)
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

INSERT INTO obras (endereco, data_inicio, orcamento)
VALUES 
('Rua A, 123', '2022-01-01', 100000.00),
('Rua B, 456', '2022-02-01', 150000.00),
('Rua C, 789', '2022-03-01', 120000.00);


INSERT INTO funcionarios(nome, data_nascimento, salario_semanal, cargo_atual, chave_pix, cod_obra)
VALUES
('João Silva', '1990-01-01', 1200.00, 'Pedreiro', 'joao.silva@exemplo.com', 1),
('Marildo Santos', '1995-02-15', 1100.00, 'Pedreiro', 'marildo@exemplo.com', 1),
('Carlos Rodrigues', '1985-03-25', 600.00, 'Servente', 'carlos.rodrigues@exemplo.com', 1),
('Amanda Souza', '1992-04-30', 1150.00, 'Pedreiro', 'amanda.souza@exemplo.com', 1),
('Roberto Almeida', '1991-05-10', 1300.00, 'Pedreiro', 'roberto.almeida@exemplo.com', 1),
('Juliano Costa', '1993-06-20', 1200.00, 'Colocador', 'juliano.costa@exemplo.com', 1),
('Rafael Oliveira', '1994-07-05', 1275.00, 'Colocador', 'rafael.oliveira@exemplo.com', 1),
('Gustavo Pereira', '1990-08-15', 500.00, 'Servente', 'gustavo.pereira@exemplo.com', 2),
('Fernando Gomes', '1989-09-30', 600.00, 'Servente', 'fernando.gomes@exemplo.com', 2),
('Ricardo Silva', '1992-10-10', 600.00, 'Servente', 'ricardo.silva@exemplo.com', 2),
('Larildo Santos', '1991-11-20', 650.00, 'Servente', 'larildo.santos@exemplo.com', 2),
('Jéssica Almeida', '1995-12-05', 700.00, 'Servente', 'jessica.almeida@exemplo.com', 2),
('Fábio Costa', '1993-01-15', 650.00, 'Servente', 'fabio.costa@exemplo.com', 2),
('Pedro Oliveira', '1988-02-28', 600.00, 'Servente', 'pedro.oliveira@exemplo.com', 3),
('Diego Pereira', '1987-03-10', 1500.00, 'Colocador', 'diego.pereira@exemplo.com', 3),
('Renato Gomes', '1990-04-20', 1300.00, 'Colocador', 'renato.gomes@exemplo.com', 3),
('Marcelo Souza', '1992-05-05', 550.00, 'Servente', 'marcelo.souza@exemplo.com', 3),
('Bruno Rodrigues', '1989-06-15', 550.00, 'Serevente', 'bruno.rodrigues@exemplo.com', 3);

INSERT INTO equipes_terceirizadas (nome_equipe, qtd_integrantes_equipe) VALUES
('Equipe 1', 10),
('Equipe 2', 5),
('Equipe 3', 8),
('Equipe 4', 12),
('Equipe 5', 6);

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
  (35000.00, '2023-05-05', 1),
  (31000.00, '2023-05-26', 2),
  (42000.00, '2023-06-09', 3),
  (36000.00, '2023-06-16', 4),
  (39000.00, '2023-07-07', 5),
  (40000.00, '2023-07-14', 2),
  (35000.00, '2023-07-21', 1),
  (31000.00, '2023-08-04', 2),
  (42000.00, '2023-08-11', 3),
  (36000.00, '2023-08-18', 4),
  (39000.00, '2023-09-01', 5),
  (40000.00, '2023-09-08', 3),
  (35000.00, '2023-09-15', 1),
  (31000.00, '2023-09-22', 2),
  (42000.00, '2023-10-06', 3),
  (36000.00, '2023-10-13', 4),
  (39000.00, '2023-11-03', 5),
  (40000.00, '2023-11-10', 3);
  

INSERT INTO obras_equipes_terceirizadas (data_entrada, data_saida, valor_acertado, cod_obra, cod_equipe) VALUES
  ('2023-05-01', '2023-05-30', 12500.00, 1, 1),
  ('2023-05-01', '2023-05-30', 11400.00, 2, 2),
  ('2023-06-01', '2023-06-30', 15500.00, 3, 3),
  ('2023-06-01', '2023-06-30', 13400.00, 1, 4),
  ('2023-07-01', '2023-07-30', 12600.00, 2, 5);

insert into pagamentos_funcionarios(valor_vale, data_pagamento_vale, cod_funcionario)
values 
		(30.00,'2023-04-17',55),
    (150.00,'2023-04-17',56),
    (100.00,'2023-04-17',57),
    (20.00,'2023-04-17',58),
    (150.00,'2023-04-18',59),
    (100.00,'2023-04-17',60),
    (50.00,'2023-04-18',61)





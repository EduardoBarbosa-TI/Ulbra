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
  cod_funcionario int not null,
  constarint vales_salarios_fk_funcionarios
  foreign key(cod_funcionario) references funcionarios(cod_funcionario)
    on delete restrict
    on update cascade
);

create table pagamentos_funcionarios(
  cod_pagamento int primary key auto_increment,
  valor_pagamento decimal(12,2),
  data_pagamento_salario date,
  dias_faltados int,
  cod_vale int unique,
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
  data_pagamento_equipe date not null,
  cod_equipe int not null,
  cod_obra int not null,
  constraint equipes_terceirizadas_fk_pagamento_equipes
  foreign key(cod_equipe) references equipes_terceirizadas(cod_equipe)
    on delete restrict
    on update cascade,
  constraint obras_fk_pagamentos_equipes
  foreign key(cod_obra) references obras(cod_obra)
    on delete restrict
    on update cascade
);

--Inserção de dados

INSERT INTO obras (endereco, data_inicio, valor_orcamento)
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

INSERT INTO vales_salarios(valor_vale,data_pagamento_vale, cod_funcionario)
VALUES 
  (100,'2023-04-20',2),
  (50,'2023-04-20',4),
  (20,'2023-04-20',8),
  (120,'2023-04-20',3),
  (150,'2023-04-20',6),
  (200,'2023-04-20',5)

INSERT INTO pagamentos_funcionarios (valor_pagamento, data_pagamento,dias_faltados, cod_funcionario, cod_vale) VALUES
  (1500.00, '2023-04-07', 1,1),
  (1300.00, '2023-04-07', 2,2),
  (1600.00, '2023-04-07', 1,2),
  (1800.00, '2023-04-07', 2,4),
  (1200.00, '2023-04-07', 1,5),
  (1700.00, '2023-04-07', 3),
  (1400.00, '2023-04-07', 2),
  (1500.00, '2023-04-07', 8),
  (1350.00, '2023-04-07', 9),
  (1450.00, '2023-04-07', 10),
  (1550.00, '2023-04-07', 11);
  
INSERT INTO pagamentos_equipes (valor, data_pagamento_equipe, cod_equipe, cod_obra)
VALUES
  (35000.00, '2023-05-05', 1,3),
  (31000.00, '2023-05-26', 2,2),
  (42000.00, '2023-06-09', 3,1),
  (36000.00, '2023-06-16', 4,1),
  (39000.00, '2023-07-07', 5,3),
  (40000.00, '2023-07-14', 2,3),
  (35000.00, '2023-07-21', 1,3),
  (31000.00, '2023-08-04', 2,2),
  (42000.00, '2023-08-11', 3,2),
  (36000.00, '2023-08-18', 4,3),
  (39000.00, '2023-09-01', 5,2),
  (40000.00, '2023-09-08', 3,3),
  (35000.00, '2023-09-15', 1,3),
  (31000.00, '2023-09-22', 2,2),
  (42000.00, '2023-10-06', 3,1),
  (36000.00, '2023-10-13', 4,1),
  (39000.00, '2023-11-03', 5,1),
  (40000.00, '2023-11-10', 3,1);
  

INSERT INTO obras_equipes_terceirizadas (data_entrada, data_saida, valor_acertado, cod_obra, cod_equipe) VALUES
  ('2023-05-01', '2023-05-30', 12500.00, 1, 1),
  ('2023-05-01', '2023-05-30', 11400.00, 2, 2),
  ('2023-06-01', '2023-06-30', 15500.00, 3, 3),
  ('2023-06-01', '2023-06-30', 13400.00, 1, 4),
  ('2023-07-01', '2023-07-30', 12600.00, 2, 5);


-----VIEWS-----
--Uma view que mostre qual o valor acertado restante com as equipes terceirizadas e o valor já retirado pela equipe e sua data de saida.
create view valor_restante_equipes
as
select pe.cod_pagamento_equipe,o.cod_obra,et.cod_equipe,SUM(pe.valor) as total_valor_pago_para_equipe, oet.valor_acertado,oet.data_saida
from equipes_terceirizadas et
join obras_equipes_terceirizadas oet
	on oet.cod_equipe = et.cod_equipe
join pagamentos_equipes pe
	on pe.cod_equipe = et.cod_equipe
join obras o
	on o.cod_obra = pe.cod_obra
group by pe.cod_obra, pe.cod_equipe
order by pe.cod_pagamento_equipe;


select cod_obra,cod_equipe,SUM(valor_acertado - total_valor_pago_para_equipe) as valor_restante
from valor_restante_equipes
where data_saida > current_date 
group by cod_obra, cod_equipe

--Uma view para mostrar a quantidade total de pessoas em cada obra, levando em consideração os funcionários que trabalham e as equipes terceirizadas.
create view qtd_de_pessoas_por_obra
as
select o.cod_obra, SUM(DISTINCT et.qtd_integrantes_equipe) as qtd_equipe, count(f.cod_funcionario) as qtd_funcionarios, o.data_inicio as data_inicio_obra,o.data_conclusao as data_conclusao_obra
from funcionarios f
join obras o
  on o.cod_obra = f.cod_obra
join obras_equipes_terceirizadas oet
  on oet.cod_obra = o.cod_obra
join equipes_terceirizadas et
  on et.cod_equipe = oet.cod_equipe
group by(o.cod_obra);

select SUM(qtd_equipe + qtd_funcionarios) as qtd_pesssoas 
from qtd_de_pessoas_por_obra 
where data_conclusao_obra is null
group by(cod_obra)

--Uma view que gere o total de gastos com funcionários e equipes por obra, e as datas de inicio e conclusão. Para utilizar essa view com a intenção de saber o valor restante do orçamento.
create view total_de_gastos_por_obra
as
select o.cod_obra,o.valor_orcamento, SUM(pf.valor_pagamento + pe.valor) as total_gastos_por_obra, o.endereco, o.data_inicio, o.data_conclusao
from funcionarios f
join pagamentos_funcionarios pf
  on pf.cod_funcionario = f.cod_funcionario
join obras o
  on f.cod_obra = o.cod_obra
join pagamentos_equipes pe
  on pe.cod_obra = o.cod_obra 
group by(o.cod_obra);

select cod_obra,SUM(valor_orcamento - total_gastos_por_obra) as valor_restante_por_obra
from total_de_gastos_por_obra
where data_conclusao is null
group by(cod_obra)


--Inserir pagamento de funcionário verificando se o funcionário realizou vales do salário ou faltou algum dia de serviço, caso seja verdadeiro desconte do salario atual e efetue o pagamento. Sabendo que cada dia corresponde a 20%.

DELIMITER $$
CREATE PROCEDURE inserindo_pagamentos_funcionarios(
IN input_cod_funcionario INT,
IN input_dias_faltados INT
)
BEGIN
    DECLARE v_valor_do_vale DECIMAL(12,2);
    DECLARE v_valor_do_pagamento DECIMAL(12,2);
	  DECLARE v_cod_vale int;
    
	
	SELECT vs.valor_vale, vs.cod_vale
	INTO v_valor_do_vale, v_cod_vale
	FROM funcionarios f
	JOIN vales_salarios vs 
    ON vs.cod_funcionario = f.cod_funcionario
	WHERE vs.cod_funcionario = input_cod_funcionario
		AND vs.data_pagamento_vale = (
      SELECT MAX(data_pagamento_vale) 
      FROM vales_salarios 
      WHERE cod_funcionario = input_cod_funcionario
    )
		AND timestampdiff(WEEK, vs.data_pagamento_vale, CURRENT_DATE) <= 1;

	
  IF input_dias_faltados > 0 THEN
    SELECT f.salario_semanal - (f.salario_semanal * (0.20 * input_dias_faltados)) INTO v_valor_do_pagamento
	  FROM funcionarios f
	  WHERE f.cod_funcionario = input_cod_funcionario;
  ELSE
    SELECT f.salario_semanal INTO v_valor_do_pagamento
    FROM funcionarios f
    WHERE f.cod_funcionario = input_cod_funcionario;
  END IF;
  
  INSERT INTO pagamentos_funcionarios(valor_pagamento,data_pagamento_salario,dias_faltados,cod_vale,cod_funcionario)
  VALUES
      (v_valor_do_pagamento,CURRENT_DATE,input_dias_faltados,v_cod_vale,input_cod_funcionario);
       
END $$
DELIMITER ;

CALL inserindo_pagamentos_funcionarios(35,null);
  
-- Visto que todo ano finaliza uma obra e começa outra, precisamos realizar a alteração da data de conclusão dessa obra finalizada e alterar os funcionários da obra finalizada para a obra que está começando, sendo que a obra que está começando ja deve estar cadastrada.

delimiter $$
create procedure alteracao_de_obras(
  IN input_cod_obra int,
  IN input_data_de_conclusao date
)
beign
  declare v_cod_obra_iniciada int;

  update obras 
  set data_conclusao = input_data_de_conclusao
  where cod_obra = input_cod_obra

  select o.cod_obra into v_cod_obra_iniciada
  from obras o
  left join funcionarios f
    on f.cod_obra = o.cod_obra
  where f.cod_funcionario is null

  update funcionarios 
  set cod_obra = v_cod_obra_iniciada
  where cod_obra = input_cod_obra
end $$

delimiter ;



--Criar uma stored procedure que calcule os valores necessários para pagar as equipes e funcionários e insira esse valor na tabela saques_orcamento.

delimiter $$
create procedure inserindo_valores_em_saques_orcamentos(
  IN input_cod_obra int,
  IN input_pedido_valor_equipe decimal(12,2)
)
begin
  declare v_valor_funcionarios decimal(12,2)
 

select SUM(f.salario_semanal) into v_valor_funcionarios
from funcionarios f 
join obras o
	on o.cod_obra =  f.cod_obra
where f.cod_obra = input_cod_obra;

insert into saques_orcamentos(cod_obra,valor,data_saque)
values
      (input_cod_obra,v_valor_funcionarios + input_pedido_valor_equipe,current_date);

end $$ 
delimiter ;


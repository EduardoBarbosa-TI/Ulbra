--Transction
SET autocommit=0;
SET SQL_SAFE_UPDATES = 0;

START TRANSACTION;

insert into setores (nome) values ('devops');
insert into funcionarios (nome, salario, id_setor)
	values ('Anita',0,(select max(id) from setores));

commit 


--Atividades
--01
CREATE TABLE pessoas (
  num_pessoa INT NOT NULL,
  nome_email VARCHAR(100) NOT NULL,
  PRIMARY KEY (num_pessoa)''
);

INSERT INTO pessoas
(num_pessoa, nome_email)
VALUES
(78360, 'rst.marcondes@smail.com'),
(78361, 'jcc.meirelles@jmail.com'),
(78362, 'mjk.amadeus@imail.com');

--02
SET autocommit=0;

START TRANSACTION;

  INSERT INTO pessoas
  (num_pessoa, nome_email)
  VALUES
  (78360, 'rst.marcondes@smail.com'),
  (78361, 'jcc.meirelles@jmail.com'),
  (78362, 'mjk.amadeus@imail.com');

commit


--03
CREATE TABLE pessoas_fisicas (
  num_pessoa_pf INT NOT NULL,
  nom_pessoa VARCHAR(100) NOT NULL,
  num_CPF VARCHAR(11) NOT NULL,
  num_documento_identidade VARCHAR(20) NOT NULL,
  nom_orgao_emissor_doc_ident VARCHAR(50) NOT NULL,
  data_nascimento DATE NOT NULL,
  idt_sexo CHAR(1) NOT NULL,
  cod_estado_civil INT NOT NULL,
  PRIMARY KEY (num_pessoa_pf)
);

INSERT INTO pessoas_fisicas
(num_pessoa_pf, nom_pessoa, num_CPF, num_documento_identidade, nom_orgao_emissor_doc_ident, dat_nascimento, idt_sexo, cod_estado_civil)
VALUES
(78360, 'Roberto Marcondes', '99911122233', '19999888', 'SSP', '1988-03-15', 'M', 1),
(78361, 'Julio Meirellies', '99811233134', '18888999', 'SSP', '1975-02-17', 'M', 1),
(78362, 'Maria Rita Amadeu', '99711333235', '17777888', 'SSP', '1980-12-23', 'F', 1);

--04

START TRANSACTION;

  INSERT INTO pessoas_fisicas
  (num_pessoa_pf, nom_pessoa, num_CPF, num_documento_identidade, nom_orgao_emissor_doc_ident, dat_nascimento, idt_sexo, cod_estado_civil)
  VALUES
  (78360, 'Roberto Marcondes', '99911122233', '19999888', 'SSP', '1988-03-15', 'M', 1),
  (78361, 'Julio Meirellies', '99811233134', '18888999', 'SSP', '1975-02-17', 'M', 1),
  (78362, 'Maria Rita Amadeu', '99711333235', '17777888', 'SSP', '1980-12-23', 'F', 1);

commit

--05 
START TRANSACTION;

  UPDATE pessoas_fisicas set nom_pessoa = "Júlio Meirelles",cod_estado_civil = 2 where num_pessoa_pf = 78361

--06 
SELECT * FROM pessoas_fisicas;

--07
ROLLBACK

--08
SELECT * FROM pessoas_fisicas;

--09
--O comando de update não persistiu. Quando setamos o autocommit para zero, se responsabilizamos pelo controle de transações e então realizamos um comando DML dentro de uma transação e não comitamos, com isso não gravamos quaisquer dados dentro do disco rígido e sim apenas na memória, com o rollback descartamos esse dados da memória.

--10
START TRANSACTION;
  UPDATE pessoas_fisicas set nom_pessoa = "Júlio Meirelles",cod_estado_civil = 2 where num_pessoa_pf = 78361
COMMIT

--11
START TRANSACTION;
  DELETE FROM PESSOA_FISICA where num_pessoa_pf = 78362

--12
ROLLBACK

--13
START TRANSACTION;
    UPDATE pessoas_fisicas SET dat_nascimento = "1998/01/13" where num_pessoa_pf =  78362;

--14
UPDATE pessoas_fisicas SET num_CPF = '13321142' where num_pessoa_pf = 78362;

--15
ROLLBACK

--16
START TRANSACTION;
  UPDATE PESSOA_FISICA SET dat_nascimento = "1998/01/13", num_CPF = '13321142' where num_pessoa_pf =  78362;
COMMIT

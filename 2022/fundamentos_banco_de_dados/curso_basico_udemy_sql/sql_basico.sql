--Comando básico em linguagem SQL (Struct Query Language)

--DDL - LINGUAGEM DE DEFINIÇÃO DE DADOS 
CREATE DATABASE 

CREATE TABLE ALUNO(
    id INT auto_increment PRIMARY KEY,
    NOME VARCHAR(255) NOT NULL,
    IDADE INT NOT NULL,
    ENDERECO VARCHAR(255) NOT NULL
);

ALTER TABLE 

DROP TABLE --Utilizamos para eliminar uma tabela inteira.

--DML - LINGUAGEM DE MODIFICAÇÃO DE DADOS 

DELETE TABLE --Utilizamos para eliminar dados de uma tabela. 

INSERT ALUNO(NOME, IDADE, ENDERECO)
VALUES("EDUARDO","20","RUA JAGUATIRICA")

UPDATE ALUNOS SET NOME="EDUARDO BARBOSA"
WHERE ID = 3

--DQL - LINGUAGEM DE CONSULTA DE DADOS 


SELECT NOME FROM ALUNO

--Podemos utilizar combinações com a cláusula WHERE, além de operadores lógicos.
BETWEEN	
LIKE	
IN

SELECT * FROM ALUNO 
WHERE CustomerName LIKE 'a%';



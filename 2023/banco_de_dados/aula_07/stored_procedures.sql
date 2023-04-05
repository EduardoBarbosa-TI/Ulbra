--Escreva uma SP que receba, como parâmetro, o CPF de um autor e retorne a quantidade de livros escrito pelo mesmo.

create table autores(
 cod_autor int primary key auto_increment,
 nome varchar(100) not null,
 cpf char(11) not null
);

 create table livros(
	cod_livro int primary key auto_increment,
    titulo varchar(25) not null,
	valor decimal(12,2) not null
 );
 
 create table autores_livros(
 cod_autores_livros int primary key auto_increment,
 cod_autor int not null,
 cod_livro int not null,
 constraint autor_fk_autores_livros
 foreign key(cod_autor) references autores(cod_autor)
	on delete restrict
    on update cascade,
constraint livros_fk_autores_livros 
foreign key(cod_livro) references livros(cod_livro)
	on delete restrict
    on  update cascade
 );


DELIMITER $$
CREATE PROCEDURE qtd_livros_autores(IN cpf char(11))
BEGIN
    SELECT  a.nome,COUNT(l.cod_livro) AS qtd_livros
    FROM autores_livros al
    JOIN autores a ON a.cod_autor = al.cod_autor
    JOIN livros l ON l.cod_livro = al.cod_livro
    WHERE a.cpf = cpf
    GROUP BY(a.nome);
END $$
DELIMITER ;


--Crie uma SP que receba, como parâmetro, a data de publicação de um livro e seu código. O procedimento deve atualizar a tabela de livros, especificando a data de lançamento para o livro em questão.

--Em algumas situações, SPs são utilizados para a manutenção da segurança do banco de dados. Nestes casos, realizamos inclusões, alterações e exclusões de dados, através de SPs. Crie SPs que recebem os parâmetros adequados e realizam as seguintes operações:

--a) Inserir uma linha na tabela de livros

--b) Excluir uma linha da tabela de livros

--c) Atualizar valores na tabela de livros

--Crie uma SP que aumente ou diminua o valor dos preços dos livros de uma editora específica. O aumento pode ser em percentual ou em valor.
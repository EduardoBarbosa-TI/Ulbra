--Escreva uma SP que receba, como parâmetro, o CPF de um autor e retorne a quantidade de livros escrito pelo mesmo.

create table autores(
 cod_autor int primary key auto_increment,
 nome varchar(100) not null,
 cpf char(11) not null
);

 create table livros(
	cod_livro int primary key auto_increment,
    titulo varchar(25) not null,
    data_publicacao date,
	valor decimal(12,2) not null,
    cod_editora int not null,
    constraint editora_fk_livros
    foreign key(cod_editora) references editoras(cod_editora)
        on delete restrict
        on update cascade 
 );
 
 create table autores_livros(
    cod_autores_livros int primary key auto_increment,
    cod_autor int not null,
    cod_livro int not null,
    constraint autor_fk_autores_livros
    foreign key(cod_autor) references autores(cod_autor)
        on delete cascade
        on update cascade,
    constraint livros_fk_autores_livros 
    foreign key(cod_livro) references livros(cod_livro)
        on delete cascade
        on  update cascade
 );

create table editoras(
    cod_editora int primary key auto_increment,
    nome varchar(100) not null
)

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

call qtd_livros_autores('12345678911')


--Crie uma SP que receba, como parâmetro, a data de publicação de um livro e seu código. O procedimento deve atualizar a tabela de livros, especificando a data de lançamento para o livro em questão.

DELIMITER $$
CREATE PROCEDURE inclusao_data_lancamento(IN data_publicacao date, IN cod_livro int)
BEGIN
    UPDATE livros l
       SET l.data_publicacao = data_publicacao
    WHERE l.cod_livro = cod_livro;
END $$
DELIMITER ;

call inclusao_data_lancamento("2014-05-25", 3)

--Em algumas situações, SPs são utilizados para a manutenção da segurança do banco de dados. Nestes casos, realizamos inclusões, alterações e exclusões de dados, através de SPs. Crie SPs que recebem os parâmetros adequados e realizam as seguintes operações:

DELIMITER $$
CREATE PROCEDURE crud_livroos(IN operacao varchar(8),IN cod_livro_input INT,IN titulo varchar(25),IN data_publicacao date,IN valor DECIMAL(12,2))
BEGIN
    IF operacao = 'create' THEN
        INSERT INTO livros(titulo,data_publicacao,valor)
    values
            (titulo,data_publicacao,valor);
    ELSEIF operacao = 'read' THEN
        SELECT * FROM livros;
    ELSEIF operacao = 'update' THEN
        UPDATE livros l 
            SET l.titulo = titulo,
                l.data_publicacao = data_publicacao,
                l.valor = valor   
        WHERE l.cod_livro = cod_livro_input;
    ELSEIF operacao = 'delete' THEN
        DELETE FROM livros  WHERE cod_livro = cod_livro_input;
	END IF;
END $$
DELIMITER ;

call crud_livros('create',null,"Submarino Voador","2023-07-23",45.70);

call crud_livros('read', null,null,null,null);

call crud_livros('update',7,"Código Limpo","2023-02-21",50.70);

call crud_livros("delete",7,null,null,null);

--a) Inserir uma linha na tabela de livros
DELIMITER $$
CREATE PROCEDURE insert_register_livro(IN titulo varchar(50),IN data_publicacao date,IN valor decimal(12,2))
BEGIN
INSERT INTO livros(titulo,data_publicacao,valor)
values
		(titulo,data_publicacao,valor);
END $$
DELIMITER ;

call insert_register_livro("A volta dos que não foram","2011-03-23",68.99);

--b) Excluir uma linha da tabela de livros

DELIMITER $$
CREATE PROCEDURE delete_register_livro(IN cod_livro_input INT)
BEGIN
	DELETE FROM livros WHERE cod_livro = cod_livro_input;
END $$
DELIMITER ;

call delete_register_livro(3)

--c) Atualizar valores na tabela de livros

DELIMITER $$
CREATE PROCEDURE update_register_livro(IN cod_livro INT,IN titulo VARCHAR(50), IN data_publicacao DATE, IN valor DECIMAL(12,2))
BEGIN
    UPDATE livros l 
        SET l.titulo = titulo,
            l.data_publicacao = data_publicacao,
            l.valor = valor
    WHERE l.cod_livro = cod_livro;
END $$
DELIMITER ;

call update_register_livro(1,"a volta dos que não foram","2023-04-22",60.50)



--Crie uma SP que aumente ou diminua o valor dos preços dos livros de uma editora específica. O aumento pode ser em percentual ou em valor.

DELIMITER $$
CREATE PROCEDURE alteration_values(IN operacao varchar(10),IN editora int,IN valor decimal(12,2))
BEGIN
	if operacao = 'diminuir' then
		update livros l set l.valor = l.valor - valor
		where cod_editora = editora;
	elseif operacao = 'aumentar' then
		update livros l set l.valor = l.valor + valor
		where cod_editora = editora; 
	end if;
END $$
DELIMITER ;



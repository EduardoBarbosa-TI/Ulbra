create table pessoas(
    cod_pessoa int primary key auto_increment,
    nome varchar(100) not null,
    sexo varchar(20) not null,
    data_nascimento date not null

);

--Crie uma Store Procedure onde sejam possíveis passar como parâmetro as informações para Nome, Sexo e Data_Nascimento. Esta Stored Procedure deverá consultar no banco de dados o último ID gerado na tabela de Pessoas, incrementar este ID e inserir um registro nesta tabela com os dados enviados por parâmetro.


delimiter $$
create procedure procedure_pessoas(IN input_nome varchar(100) , IN input_sexo varchar(20), IN input_data_nascimento date)
begin
    declare v_cod_pessoa int;
    select max(cod_pessoa) into v_cod_pessoa from pessoas;
    set v_cod_pessoa = v_cod_pessoa + 1;
    insert into pessoas(cod_pessoa,nome, sexo, data_nascimento) values (v_cod_pessoa,input_nome,input_sexo,input_data_nascimento);
end $
delimiter ;

call procedure_pessoas("Paulao","Masculino","1998-03-18");

--Crie uma Stored Procedure que mostre quantos Homens e quantas Mulheres têm cadastrados.
delimiter $$
create procedure qtd_pessoas_por_sexo
begin
    select p.sexo,count(p.cod_pessoa) as qtd_pessoas
    from pessoas p
    group by(p.sexo)
end $$
delimiter ;

call qtd_pessoas_por_sexo();

--Crie uma Stored Procedure que mostre quantos Homens são menores e maiores de idade, e quantas Mulheres são maiores e menores de idade

delimiter $$
create procedure qtd_pessoas_maiores_e_menores_idade_por_sexo()
begin
    select SUM(WHEN (DATEDIFF(year,p.data_nascimento, current_date) >= 18 and p.sexo = "Masculino" ))
end $$
delimiter ;

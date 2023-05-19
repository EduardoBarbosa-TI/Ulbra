create table departamentos(
    cod_departamento int primary key auto_increment,
    nome_departamento varchar(100) not null
);

create table empregados(
    cod_empregado int primary key auto_increment,
    nome_empregado varchar(100) not null,
    salario decimal(12,2) not null,
    cod_departamento int not null,
    constraint empregados_fk_departamentos
    foreign key(cod_departamento) references departamentos(cod_departamento)
        on delete restrict
        on update cascade
);

insert into departamentos(nome_departamento)
values
		("Limpeza"),
        ("Cozinha"),
        ("Saguão");

insert into empregados(nome_empregado,salario,cod_departamento)
values
        ("Eduardo", 2000.00,1),
        ("Carlos Eduardo", 2000.00,2),
        ("Eduarda", 2000.00,1),
        ("Jonhatas", 6000.00,1),
        ("Pedro", 8000.00,1),
        ("José", 2000.00,1),
        ("Maria", 7000.00,3),
        ("Paula", 2000.00,3),
        ("Jorge", 4000.00,3),
        ("Paulo", 2000.00,2),
        ("Ricardo", 5000.00,3);



--Na linguagem SQL, o comando mais simples para recuperar os códigos dos departamentos cuja média salarial seja maior que 2000 é:
SELECT cod_departamento
FROM empregados
GROUP BY cod_departamento
HAVING AVG (salario) > 2000

--Questão 02
create table table1(
    vall_01 int not null,
    vall_02 int not null
);

insert into table1(vall_01, vall_02)
values 
        (5,3),
        (7,16),
        (1,4),
        (4,7),
        (1,1),
        (9,2),
        (8,9),
        (1,8),
        (1,10),
        (2,15);


select vall_01 as val
from table1
where vall_02 between 6 and 10
group by vall_01;

--Crie uma View que retorne as corridas por clientes, veículos, administradores e funcionários.
create view view_corridas
as
select *
from clientes cl
join corridas cr
    on cr.cod_cliente = cl.cod_cliente
join veiculos v
    on v.cod_veiculo = cr.cod_veiculo
join administradores a
    on a.cod_administrador = v.cod_administrador
join pessoas p
    on p.cod_pessoa = a.cod_pessoa
join funcionarios f
    on f.cod_pessoa = p.cod_pessoa


--Faça um SQL que totalize através da View quantas corridas foram feitas por administradora e qual a km média para o mês de julho de 2015.
select cod_cliente, nome_cliente,cod_veiculo, marca_veiculo,cod_administrador, nome_administrador,cod_funcionario, nome_funcionario,count(cod_corrida) as total_corrida_administradores, avg(km) as media_km
from view_corridas v
where data_corrida between '2015-07-01' and '2015-07-31'
group by cod_administrador;


--Faça um TRIGGER para armazenar em uma tabela chamada FluxoCaixa (idCaixa, mes, saldo). Esta tabela será alimentada quando houver lançamentos de inclusão ou exclusão de Despesas. A tabela FluxoCaixa vai ter acumulado os pagamentos por mês. Abaixo exemplo da visualização da tabela FluxoCaixa.
delimiter $$
create trigger tr_inserir_quando before insert on despesas 
begin
    declare v_cod_caixa int;

    select cod_caixa
    set v_cod_caixa
    from fluxoCaixa
    WHERE TO_CHAR(new.data_despesa,'MM/YYYY') = TO_CHAR(data_fluxo,'MM/YYYY');

    if v_cod_caixa <> null
        update fluxoCaixa set saldo = saldo + new.valor
        where cod_caixa = v_cod_caixa
    else
        insert into fluxoCaixa(mes,saldo)
        values
                (new.data_despesa,new.valor);
    end if;
        
end $$
delimiter ;


delimiter $$
create trigger tr_inserir_quando before delete on despesas 
begin
declare v_data_despesa date;

    set v_data_despesa = old.data_despesa;


    update fluxoCaixa set saldo = saldo - old.valor
    where mes = v_data_despesa;


    
end $$
delimiter ;

--Crie uma Stored Procedure que faça a inclusão ou a exclusão na tabela FluxoCaixa e refatore a trigger da questão anterior para utilizar essa stored procedure


delimiter $$
create procedure procedure_inclusao_exclusao_fluxo(
    IN input_mes date;
    IN input_cod_caixa;
    IN input_saldo decimal;
    IN input_operacao varchar(10);
)
begin
    if input_operacao = "Incluir"
        insert into fluxoCaixa(mes,saldo)
        values
        (input_mes,input_saldo)
    else 
        delete from fluxoCaixa where cod_caixa = input_cod_caixa;
  end if;
end;

delimiter ;


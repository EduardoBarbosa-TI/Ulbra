create table status_orcamentos(
    cod_status int primary key,
    nome varchar(15) not null
);

create table orcamentos(
    cod_orcamento int primary key auto_increment,
    data_orcamento date not null,
    cod_status int not null,
    constraint status_orcamentos_fk_orcamentos
    foreign key(cod_status) references status_orcamentos(cod_status)
        on delete restrict
        on update cascade
);

create table produtos(
    cod_produto int primary key auto_increment,
    nome varchar(100) not null,
    valor decimal(12,2) not null,
    saldo int not null
);

create table orcamentos_produtos(
    cod_orcamento_produtos int primary key auto_increment,
    valor_unit decimal(12,2) not null,
    quantidade int not null,
    cod_produto int not null,
    cod_orcamento int not null,
    constraint produtos_fk_orcamentos_produtos
    foreign key(cod_produto) references produtos(cod_produto)
        on delete restrict
        on update cascade,
    constraint orcamentos_fk_orcamentos_produtos
    foreign key(cod_orcamento) references orcamentos(cod_orcamento)
        on delete restrict
        on update cascade
);

insert into status_orcamentos(cod_status,nome)
values
		(1,'Em orcamento'),
        (2,'Vendido'),
        (3,'Cancelado')

insert into orcamentos(data_orcamento,cod_status)
values
		('2014-02-05',2),
        ('2014-12-05',1),
        ('2014-03-09',3),
        ('2014-01-23',2),
        ('2014-07-15',1),
        ('2014-10-25',3)

insert into produtos(nome,valor,saldo)
values
		('Computador',1200,10),
        ('Mouse',300,20),
        ('Mouse pad',100,20),
        ('Gabinete',90,10),
        ('Teclado',250,30),
        ('Monitor',1320,12);

insert into orcamentos_produtos(valor_unit,quantidade,cod_produto,cod_orcamento)
values
		(1200,3,1,6),
        (300,1,2,5),
        (100,2,3,4),
        (90,1,4,3),
        (250,2,5,2),
        (1320,3,6,1)


--VIEW
create view view_orcamento_produtos
as 
select  o.cod_orcamento as cod_orcamento,
        o.data_orcamento as data_orcamento,
        p.cod_produto as cod_produto 
        p.nome as nome_produto,
        p.valor as valor_produto,
        p.saldo as saldo_estoque_produto,
        op.cod_orcamento_produtos as cod_orcamento_produtos
from produtos p
inner join orcamentos_produtos op
    on  p.cod_produto = op.cod_produto
inner join orcamentos o 


--Lista de orçamentos por produto

--Valor total de produtos orçados por período

--Produtos que tem “Computador” no nome e que tem quantidade em estoque.

--Os 10 produtos mais orçados no mês de setembro de 2014 e que ainda tem saldo em estoque. Somente os produtos com o valor acima de R$ 500.00.


--Faça uma consulta utilizando a view para acrescentar 20% nos produtos que o saldo em estoque é menor ou igual a 5.


--Delete todos os produtos que não foram orçados.

--Explique quando utilizar o GROUP BY, de um exemplo sql.
--Devemos utilizar o Group by quando necessitamos agrupar elementos e principalmente quando utilizamos funções de agregações, no sql abaixo se não utilizarmos o group by vamos contar todos os alunos de todas as turmas sem realizar o agrupamento por turma. Assim ficará difícil saber qual turma terá mais alunos se não realizei o agrupamento de turmas. 
select count(a.cod_aluno) as qtd_alunos_por_turma
from aluno a
join turma t
    on t.cod_aluno = a.cod_aluno
group by(t.cod_turma)


--Explique quando utilizar o HAVING, de um exemplo sql.
-- O having é o where do group by, devemos utilizar ele somente depois do group by. Para entender o motivo de não utilizar o where em vez do having, devemos ter o conhecimento da ordem em que as cláusulas são executadas. Ao chegar na clásula where o agrupamento ainda não foi realizado e ainda não temos a informação da quantidade de alunos por turma, portanto não teremos como selecionar somente as turmas com menos de 20 alunos com a cláusula where.
select count(a.cod_aluno) as qtd_alunos_por_turma
from aluno a
join turma t
    on t.cod_aluno = a.cod_aluno
group by(t.cod_turma) 
having qtd_alunos_por_turma <= 20

--Explique quando utilizar o UNION, de um exemplo sql.
--UNION é um operador SQL utilizado para combinar o resultado de duas ou mais consultas SELECT em uma única tabela virtual que contém todos os registros retornados pelas consultas individuais. É importante destacar que o UNION remove automaticamente quaisquer linhas duplicadas entre as tabelas combinadas.

SELECT *
FROM tabela1
UNION
SELECT *
FROM tabela2;

--Explique quando utilizar o LEFT JOIN, de um exemplo sql.
--A LEFT JOIN palavra-chave retorna todos os registros da tabela à esquerda (produtos) e os registros correspondentes da tabela à direita (orcamentos_produtos). O resultado é 0 registros do lado direito, se não houver correspondência.
select p.cod_produto 
from produtos p
left join orcamentos_produtos op
	on op.cod_produto = p.cod_produto

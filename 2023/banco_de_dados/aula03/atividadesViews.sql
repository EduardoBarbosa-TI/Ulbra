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


--Lista de orçamentos por produto
create view lista_orcamentos_produtos
as
select o.cod_orcamento,o.data_orcamento,so.nome
from orcamentos o 
join orcamentos_produtos op
	on op.cod_orcamento = o.cod_orcamento
join produtos p 
	on p.cod_produto = op.cod_produto
join status_orcamentos so
	on so.cod_status = o.cod_status
group by(p.nome)

--Valor total de produtos orçados por período
create view valor_total_produtos_periodos
as
select SUM(op.quantidade*op.valor_unit) as total_valor_produtos, o.data_orcamento
from orcamentos o 
join orcamentos_produtos op
	on op.cod_orcamento = o.cod_orcamento
join produtos p
	on p.cod_produto = op.cod_produto
group by(o.data_orcamento)

--Produtos que tem “Computador” no nome e que tem quantidade em estoque.
create view nome_produto_qtd_estoque
as
select p.cod_produto,p.nome,p.valor,p.saldo - (SUM(op.quantidade)) as quantidade_atual_estoque
from produtos p 
join orcamentos_produtos op
	on p.cod_produto = op.cod_produto
join orcamentos o
	on o.cod_orcamento = op.cod_orcamento
where p.nome = 'Computador' 
group by(p.nome)
having quantidade_atual_estoque > 0

--Os 10 produtos mais orçados no mês de setembro de 2014 e que ainda tem saldo em estoque. Somente os produtos com o valor acima de R$ 500.00.

create view produtos_mais_orcados_mes
as
select p.nome, p.valor,(p.saldo - (SUM(op.quantidade))) as quantidade_atual_estoque, count(op.cod_produto) as qtd_orcamentos
from produtos p 
join orcamentos_produtos op
	on p.cod_produto = op.cod_produto
join orcamentos o
	on o.cod_orcamento = op.cod_orcamento
where p.valor > 500 and o.data_orcamento >= '2014-09-01' and o.data_orcamento <= '2014-09-30'
group by (op.cod_produto)
having quantidade_atual_estoque > 0
order by(qtd_orcamentos)  Desc
limit 10


--Faça uma consulta utilizando a view para acrescentar 20% nos produtos que o saldo em estoque é menor ou igual a 5.
SELECT *,SUM(pmom.valor*1.20) as valor_mais_20 
FROM produtos_mais_orcados_mes pmom
where pmom.quantidade_atual_estoque >= 5

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

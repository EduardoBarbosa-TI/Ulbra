--Crie uma visão sobre uma tabela única incluindo todos os seus dados. Depois faça uma inserção de dados na visão. Verifique o que acontece com a tabela base.

create view view_clients
as
select * from clientes

insert into view_client(nome,endereco)
values
		('Eduardo','Rua Lonita')

        --Adicionou uma nova túpla na tabela base normalmente 


--Crie uma visão que inclui mais de uma tabela. Faça uma inclusão na visão. Verifique o que acontece.

create view view_total_compras_pedidos_clientes
AS
select c.nome,count(c.nome) as qtd_pedidos, SUM(p.quantidade * valor) as valor_total
from clientes c
join pedidos p
	on p.cod_cliente = c.cod_cliente
group by(c.nome)

insert into view_total_compras_pedidos_clientes(nome,qtd_pedidos,valor_total)
values
		('Peixe Maria Luiza',3,130)

        --Error Code: 1471. The target table view_total_compras_pedidos_clientes of the INSERT is not insertable-into



-- mostrar todos os produtos que foram pedidos nes de out/2022
categorias(id, nome)
clientes(id, nome)
pedidos(id, data, id_cliente)
produtos(id, descricao, valor_unit, id_categoria)
pedidos_itens(id, id_pedido, id_produto, qtd, val_unit)

Select  pd.id, pd.descricao, pi.valor_unit, pi.qtd
from    pedidos p, produtos pd, pedidos_itens pi
where   p.id = pi.id_pedido and pd.id = pi.id_produto and
        p.data >= '2022-10-01' and '2022-10-31'

order by pd.descricao ASC

-- conta prim ms SQL, quantos produtos eu tenho cadastrado por categoria
nome_categoria  QuantosProdutos
maletas         7
garrafas        19
medicamentos    101


select  c.nome, count(p.id)
from    categorias c, produtos p
where   c.id = p.id_categoria
group by c.nome

-- me mostra A categoria qeu tem mais produtos cadastros
select  c.nome, count(p.id) as quantos
from    categorias c, produtos p
where   c.id = p.id_categoria
group by c.nome
order by quantos desc
limit 1


-- me mostra quantos produtos tenho por categoria e considere pf. 
-- somente os produtos que custam acima de 100.

select  c.nome, count(p.id) as quantos
from    categorias c, produtos p
where   c.id = p.id_categoria and p.valor_unit >100 
group by c.nome
having count(p.id)>=50


-- resul
nome_categoria  QuantosProdutos
medicamentos    101
embalagens      349

-- qual é a média de preço de produto por categoria???

select  c.nome, avg(p.valor_unit) as media_preco
from    categorias c, produtos p
where   c.id = p.id_categoria
group by c.nome

nome_categoria  media_preco
maletas         230
garrafas        7.9
medicamentos    210.33
embalagens      9.99

-- ah mas eu quero ver somente as categorias que a média é >=200
select  c.nome, avg(p.valor_unit) as media_preco
from    categorias c, produtos p
where   c.id = p.id_categoria
group by c.nome
having media_preco>=200

-- ah, ms dba.. me mostra somente a categoria que tem a maior média de preco.
select  c.nome, avg(p.valor_unit) as media_preco
from    categorias c, produtos p
where   c.id = p.id_categoria
group by c.nome
having media_preco>=200
order by media_preco desc
limit 1


-- mesma consulta usando JOIN
-- ah, ms dba.. me mostra somente a categoria que tem a maior média de preco.
select      c.nome, avg(p.valor_unit) as media_preco
from        categorias c 
                INNER JOIN produtos p 
                    ON c.id = p.id_categoria 
group by    c.nome


categorias(id, nome)
clientes(id, nome)
pedidos(id, data, id_cliente)
produtos(id, descricao, valor_unit, id_categoria)
pedidos_itens(id, id_pedido, id_produto, qtd, val_unit)
-- ME MOSTRA todos os produtos que foram pedidos, 
-- a qtd, o valor_unit e a soma de cada item

select  pd.id as codigo, pd.descricao as nome_prod, 
        pi.valor_unit as valor_unit_ped,
        pi.qtd,
        pi.qtd * pi.valor_unit as valor_total_item
from    produtos pd 
            inner join pedidos_itens pi 
                ON pi.id_produto = pd.id



codigo  nome_prod   valor_unit_ped  qtd     valor_total_item


-- ME MOSTRA todos os produtos que foram pedidos, 
-- a qtd, o valor_unit e a soma de cada item, mostra o nome da categoria

select  pd.id as codigo, pd.descricao as nome_prod, 
        pi.valor_unit as valor_unit_ped,
        pi.qtd,
        pi.qtd * pi.valor_unit as valor_total_item,
        c.nome as categoria
from    produtos pd 
            inner join pedidos_itens pi 
                ON pi.id_produto = pd.id
            inner join categorias c
                ON c.id = pd.id_categoria

codigo  nome_prod   valor_unit_ped  qtd     valor_total_item    categoria 




-- ME MOSTRA todos os produtos que foram pedidos, 
-- a qtd, o valor_unit e a soma de cada item, mostra o nome da categoria e também
-- quer saber o nome do cliente que pediu cada produto que será listado

select  pd.id as codigo, pd.descricao as nome_prod, 
        pi.valor_unit as valor_unit_ped,
        pi.qtd,
        pi.qtd * pi.valor_unit as valor_total_item,
        c.nome as categoria, cli.nome as nome_do_cliente_que_pediu
from    produtos pd 
            inner join pedidos_itens pi 
                ON pi.id_produto = pd.id
            inner join categorias c
                ON c.id = pd.id_categoria
            inner join pedidos p
                ON p.id = pi.id_pedido
            inner join clientes cli
                ON cli.id = p.id_cliente


codigo  nome_prod   valor_unit_ped  qtd     valor_total_item    categoria  nome_do_cliente_que_pediu
/*Liste todos os produtos cadastrados e ordene por ordem alfabética de descrição.*/

SELECT descricao 
FROM produtos
ORDER BY descricao DESC

/*Lista os produtos que foram pedidos e o nome do fornecedor de cada pedido.*/

SELECT pi.id_produto, pi.id_pedido, p.id_fornecedor, f.name
FROM pedidos_itens as pi, pedidos as p, fornecores as f


/*Mostre os produtos que já foram pedidos e o nome da categoria a que ele pertence.*/

SELECT pi.id_produto, pi.id_pedido, pr.id_categoria, c.nome
FROM pedidos_itens as pi, pedidos as p, produtos as pr, categorias as c

/*Mostre o nome do fornecedor, a data do último pedido e a descrição do produto que ele pediu.*/



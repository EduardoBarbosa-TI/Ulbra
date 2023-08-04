//Vídeo explicação - https://www.loom.com/share/0b646b9e146a470b9c670fe80e51a553
//Modelagaem noSQL - https://www.figma.com/file/RsaGFOE9zKQRzxP9mqeL3U/Untitled?type=whiteboard&node-id=0-1&t=qlZVfsQiBrDzTpbg-0
//Comandos básicos de criação e inserção
db.createCollection("clientes")
db.clients.insertOne({
  "nome": "Eduardo Barbosa",
  "endereco": [
    {
      "rua": "Paulo Jose Veranoz,852",
      "cidade": "Xangri-lá"
    }
  ],
  "telefone": "5551954234446"
})


db.createCollection("pedidos")
db.pedidos.insertOne({
  "bebidas": [
    {
      "refrigerantes": [{
        "marca": "coca-cola",
        "tamanho": "2L",
        "preco": 12.00
      }]
    }
  ],
  "pizzas": [
    {
      "tamanho": "Média",
      "borda": "Chocolate",
      "sabores": [
        { "nome": "Portuguesa" },
        { "nome": "Calabresa" },
        { "nome": "4 queijos" },
        { "nome": "Filé e fritas" }
      ],
      "preco_pizza": 60.00
    }
  ],
  "userId": "649cfcb8bfe6c3a47605161a",
  "createdAt": "2023-06-29",
  "precoTotal": 72.00
})

//Adicionando mais um refrigerante no pedido e alterando preço total do pedido
db.pedidos.updateOne(
  { userId: "649cfcb8bfe6c3a47605161a" },
  {
    $push: { "bebidas.0.refrigerantes": { marca: "sprite", tamanho: "1L", preco: 10.00 } },
    $inc: { preco_total: 10.00 }
  }
)
//Excluindo pedido de refrigerante
db.pedidos.updateOne(
  { userId: "649cfcb8bfe6c3a47605161a", "bebidas.refrigerantes.marca": "coca-cola" },
  {
    $pull: { "bebidas.$[].refrigerantes": { marca: "coca-cola" } },
    $inc: { preco_total: -10.00 }
  }
)

//Excluindo pedido
db.pedidos.deleteOne({ userId: "649cfcb8bfe6c3a47605161a" })

//Consultas
db.clients.find({"address.street": "Paulo Jose Veranoz,852"})
db.pedidos.find({ "userId": "649cfcb8bfe6c3a47605161a" })
db.pedidos.find()
db.clients.find()

//Agregate com join
db.pedidos.aggregate([
  {
    $lookup: {
      from: "clients",
      localField: "id",
      foreignField: "userId",
      as: "usuario"
    }
  }
])

//Agregate com group by
db.pedidos.aggregate([
  {
    $group: {
      _id: "$userId",
      totalPedidos: { $sum: 1 },
      totalPreco: { $sum: "$precoTotal" }
    }
  }
])

//Index
//Para um melhor desempenho nas consultas entre diversos pedidos gerei um index para selecionar apenas os pedidos de determinado cliente através do index. 
db.pedidos.createIndex({ userId: 1 }, { name: "userId_index" })
db.pedidos.find({ userId: "649cfcb8bfe6c3a47605161a" }).hint({ userId: 1 })
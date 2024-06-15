import { Client } from "./client/Client"

export class Request {
    private numberOrder: String
    private status: String
    private quantity: Number
    private client: Client

    constructor(numberOrder: String, status: String,quantity: Number, client: Client){
        this.numberOrder = numberOrder
        this.status = status
        this.quantity = quantity
        this.client = client
    }

    public async get(){
        const request = {
            numberOrder: this.numberOrder,
            status: this.status,
            quantity: this.quantity,
            client: this.client
        } 

        return request
    }

    public async save(numberOrder: String, status: String, quantity: Number, client: Client){
        const request = new Request(numberOrder, status, quantity, client);

        return request
    }

    public async update(numberOrder: String, status: String,quantity: Number, client: Client){
        this.numberOrder = numberOrder
        this.status = status
        this.quantity = quantity
        this.client = client

        const produto = {
            numberOrder: this.numberOrder,
            status: this.status,
            quantity: this.quantity,
            client: this.client
        } 

        return produto
    }

    public async delete(){
        this.numberOrder = ''
        this.status = 'Cancelado'
        this.quantity = 0

        return "Pedido excluído com sucesso!"
    }
}
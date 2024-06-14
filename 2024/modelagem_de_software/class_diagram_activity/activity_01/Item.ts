import { Product } from "./Product"
import { Request } from "./Request"


export class Item{
    private value: Number
    private product: Product
    private request: Request
    
    constructor(value: Number, product: Product, request: Request){
        this.value = value
        this.product = product
        this.request = request
    }

    public async get(){
        const item = {
            value: this.value,
            product: this.product,
            request: this.request
        } 

        return item
    }

    public async save(value: Number, product: Product, request: Request){
        const item = new Item(value, product, request);

        return item
    }

    public async update(value: Number, product: Product, request: Request){
        this.value = value
        this.product = product
        this.request = request

        const item = {
            value: this.value,
            product: this.product,
            request: this.request
        } 

        return item
    }

    public async delete(){
        this.value = 0

        return "Item excluído com sucesso!"
    }
}
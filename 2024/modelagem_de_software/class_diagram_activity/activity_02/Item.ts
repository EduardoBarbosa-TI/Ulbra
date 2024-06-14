import { Budget } from "./Budget"
import { Product } from "./Product"

export class Item{
    private value: Number
    private quantity: Number
    private product: Product
    private budget: Budget
    
    constructor(value: Number, quantity: Number, product: Product, budget: Budget){
        this.value = value
        this.quantity = quantity
        this.product = product
        this.budget = budget
    }

    public async save(value: Number, quantity: Number,product: Product, budget: Budget){
        const client = new Item(value, quantity,product, budget);

        return client
    }

    public async update(value: Number, quantity: Number,product: Product, budget: Budget){
        this.value = value
        this.product = product
        this.budget = budget
        this.quantity = quantity

        const item = {
            value: this.value,
            quantity: this.quantity,
            product: this.product,
            budget: this.budget
        } 

        return item
    }

    public async delete(){
        this.value = 0
        this.quantity = 0

        return "Item excluído com sucesso!"
    }
}
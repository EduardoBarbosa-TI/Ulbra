export class Product{
    private name: String
    private value: Number
    private quantity: Number
    private description: String
    
    constructor(name: String, value: Number, quantity: Number, description: String){
        this.name = name
        this.value = value
        this.quantity = quantity
        this.description = description
    }
    
    public async save(name: String, value: Number, quantity: Number, description: String){
        const product = new Product(name, value, quantity, description);

        return product
    }

    public async update(name: String, value: Number, quantity: Number, description: String){
        this.name = name
        this.value = value
        this.quantity = quantity,
        this.description = description 

        const product = {
            name: this.name,
            value: this.value,
            quantity: this.quantity,
            description: this.description
        } 

        return product
    }

    public async delete(){
        this.name = ''
        this.value = 0
        this.quantity = 0
        this.description = ''

        return "Produto excluído com sucesso!"
    }
}
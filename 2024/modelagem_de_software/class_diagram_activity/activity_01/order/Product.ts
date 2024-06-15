export class Product{
    private name: String
    private value: Number
    
    constructor(name: String, value: Number){
        this.name = name
        this.value = value
    }

    public async get(){
        const product = {
            name: this.name,
            value: this.value
        } 

        return product
    }

    public async save(name: String, value: Number){
        const product = new Product(name, value);

        return product
    }

    public async update(name: String, value: Number){
        this.name = name
        this.value = value

        const product = {
            name: this.name,
            value: this.value
        } 

        return product
    }

    public async delete(){
        this.name = ''
        this.value = 0

        return "Produto excluído com sucesso!"
    }
}
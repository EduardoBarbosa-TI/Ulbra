export class Client {
    private name: String 
    private numberTable: String
    private numberPhone: String

    constructor(name: String, numberTable: String, numberPhone: String){
        this.name = name
        this.numberTable = numberTable
        this.numberPhone = numberPhone
    }

    public async get(){
        const client = {
            name: this.name,
            numberTable: this.numberTable,
            numberPhone: this.numberPhone
        } 

        return client
    }

    public async save(name: String, numberTable: String, numberPhone: String){
        const client = new Client(name, numberTable, numberPhone);

        return client
    }

    public async update(name: String, numberTable: String, numberPhone: String){
        this.name = name
        this.numberTable = numberTable
        this.numberPhone = numberPhone

        const client = {
            name: this.name,
            numberTable: this.numberTable,
            numberPhone: this.numberPhone
        } 

        return client
    }

    public async delete(){
        this.name = ''
        this.numberTable = ''
        this.numberPhone = ''

        return "Cliente excluído com sucesso!"
    }
}
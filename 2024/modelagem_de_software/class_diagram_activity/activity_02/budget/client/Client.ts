import { Address } from "./Address"

export class Client {
    private name: String 
    private cpf: String
    private numberPhone: String
    private address: Address

    constructor(name: String, cpf: String, numberPhone: String, address: Address){
        this.name = name
        this.cpf = cpf
        this.numberPhone = numberPhone
        this.address = address
    }

    public async save(name: String, cpf: String, numberPhone: String, address: Address){
        const client = new Client(name, cpf, numberPhone, address);

        return client
    }

    public async update(name: String, cpf: String, numberPhone: String, address: Address){
        this.name = name
        this.cpf = cpf
        this.numberPhone = numberPhone
        this.address = address

        const client = {
            name: this.name,
            cpf: this.cpf,
            numberPhone: this.numberPhone,
            address: this.address
        } 

        return client
    }

    public async delete(){
        this.name = ''
        this.cpf = ''
        this.numberPhone = ''

        return "Cliente excluído com sucesso!"
    }
}
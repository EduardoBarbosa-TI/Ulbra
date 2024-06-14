import { Request } from "./Request"

export class Payment{
    private description: String
    private amout: Number
    private typePayment: String
    private request: Request

    constructor(description: String, amount: Number, typePayment: String, request: Request){
        this.description = description
        this.amout = amount
        this.typePayment = typePayment
        this.request = request
    }

    public async get(){
        const payment = {
            description: this.description,
            amount: this.amout,
            typePagament: this.typePayment,
            request: this.request
        } 

        return payment
    }

    public async save(description: String, amount: Number, typePayment: String, request: Request){
        const payment = new Payment(description, amount, typePayment, request);

        return payment
    }

    public async update(description: String, amount: Number, typePayment: String, request: Request){
        this.description = description
        this.amout = amount
        this.typePayment = typePayment
        this.request = request

        const payment = {
             description: this.description,
            amount: this.amout,
            typePagament: this.typePayment,
            request: this.request
        } 

        return payment
    }

    public async delete(){
        this.description = ''
        this.amout = 0
        this.typePayment = ''

        return "Pagamento excluído com sucesso!"
    }
} 
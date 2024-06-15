import { Budget } from "../budget/Budget"

export class Payment{
    private description: String
    private amout: Number
    private typePayment: String
    private budget: Budget

    constructor(description: String, amount: Number, typePayment: String, budget: Budget){
        this.description = description
        this.amout = amount
        this.typePayment = typePayment
        this.budget = budget
    }

    public async save(description: String, amount: Number, typePayment: String, budget: Budget){
        const payment = new Payment(description, amount, typePayment, budget);

        return payment
    }

    public async update(description: String, amount: Number, typePayment: String, budget: Budget){
        this.description = description
        this.amout = amount
        this.typePayment = typePayment
        this.budget = budget

        const payment = {
             description: this.description,
            amount: this.amout,
            typePagament: this.typePayment,
            budget: this.budget
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
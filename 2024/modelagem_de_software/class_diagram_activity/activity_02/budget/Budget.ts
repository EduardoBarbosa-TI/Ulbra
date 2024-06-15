import { Car } from "./client/Car"
import { Mechanic } from "./employees/Mechanic"

export class Budget {
    private description: String
    private technicalDescription: String
    private value: Number
    private status: String
    private car: Car
    private mechanic: Mechanic
    
    constructor(description: String, technicalDescription: String, value: Number, status: String, car: Car, mechanic: Mechanic){
        this.description = description
        this.technicalDescription = technicalDescription
        this.value = value
        this.status = status
        this.car = car
        this.mechanic = mechanic
    }

    public async save(description: String, technicalDescription: String,value: Number, status: String,car: Car, mechanic: Mechanic){
        const budget = new Budget(description,technicalDescription,value,status,car,mechanic);

        return budget
    }

    public async update(description: String, technicalDescription: String, value: Number, status: String,car: Car, mechanic: Mechanic){
        this.description = description
        this.technicalDescription = technicalDescription
        this.value = value
        this.car = car
        this.mechanic = mechanic
        this.status = status

        const budget = {
            description: this.description,
            technicalDescription: this.technicalDescription,
            value: this.value,
            status: this.status,
            car: this.car,
            mechanic: this.mechanic
        } 

        return budget
    }

    public async delete(){
        this.description = ''
        this.technicalDescription = ''
        this.value = 0
        this.status = ''

        return "Orçamento excluído com sucesso!"
    }
}
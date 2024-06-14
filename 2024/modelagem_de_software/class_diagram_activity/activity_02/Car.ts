import { Client } from "./Client"

export class Car {
    private model: String
    private plate: String
    private client: Client
    
    constructor(model: String, plate: String, client: Client){
        this.model = model
        this.plate = plate
        this.client = client
    }

    public async save(model: String, plate: String,client: Client){
        const car = new Car(model, plate,client);

        return car
    }

    public async update(model: String, plate: String,client: Client){
        this.model = model
        this.client = client
        this.plate = plate

        const car = {
            model: this.model,
            plate: this.plate,
            client: this.client
        } 

        return car
    }

    public async delete(){
        this.model = ''
        this.plate = ''

        return "Carro excluído com sucesso!"
    }
}
export class Address {
    private patio: String
    private neighborhood: String
    private city: String
    
    constructor(patio: String, neighborhood: String, city: String){
        this.patio = patio
        this.neighborhood = neighborhood
        this.city = city
    }

    public async save(patio: String,neighborhood: String, city: String){
        const address = new Address(patio,neighborhood, city);

        return address
    }

    public async update(patio: String,neighborhood: String, city: String){
        this.neighborhood = neighborhood
        this.city = city
        this.patio = patio

        const address = {
            patio: this.patio,
            neighborhood: this.neighborhood,
            city: this.city
        } 

        return address
    }

    public async delete(){
        this.patio = ''
        this.city = ''
        this.neighborhood = ''

        return "Endereço excluído com sucesso!"
    }
}
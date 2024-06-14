export class Mechanic {
    private name: String
    private evaluation: Number

    constructor(name: String, evaluation: Number){
        this.name = name
        this.evaluation = evaluation
    }

    public async save(name: String, evaluation: Number){
        const mechanic = new Mechanic(name, evaluation);

        return mechanic
    }

    public async update(name: String, evaluation: Number){
        this.name = name
        this.evaluation = evaluation

        const mechanic = {
            name: this.name,
            evaluation: this.evaluation,
        } 

        return mechanic
    }

    public async delete(){
        this.name = ''
        this.evaluation = 0

        return "Mecânico excluído com sucesso!"
    }
}
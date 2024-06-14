import { Address } from "./Address";
import { Budget } from "./Budget";
import { Car } from "./Car";
import { Client } from "./Client";
import { Item } from "./Item";
import { Mechanic } from "./Mechanic";
import { Payment } from "./Payment";
import { Product } from "./Product";

export class System{
    public async system(){
        const product = new Product("Cabeçote Uno 97", 30.90,10, "Raizon");

        const address = new Address("Apartamento 01", "Rua dos ventres","Portugual");

        const client = new Client("Eduardo","553.451.252-45","51980617496",address);

        const car  = new Car("Sandero","A6G7-8D2",client);

        const mechanic = new Mechanic("Jorge",5);

        const budget = new Budget("Carro ao girar a chave não liga apenas barulho","Motor de arranque",5000,'Em andamento',car, mechanic);

        const item = new Item(540.90, 1,product, budget);

        const payment = new Payment("Cobertura de chocolate, 3 Bananas e 3 cerejas", 61.90, 'Cartão de crédito',budget)
    }
}
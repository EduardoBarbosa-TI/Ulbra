import { Client } from "./Client";
import { Item } from "./Item";
import { Payment } from "./Payment";
import { Product } from "./Product";
import { Request } from "./Request";


export class System{
    public async system(){
        const product = new Product("Banana Split", 30.90);

        const client = new Client("Eduardo","#3435","51980617496");

        const request = new Request("#549560",'Em andamento',2, client);

        const item = new Item(61.90, product, request);

        const payment = new Payment("Cobertura de chocolate, 3 Bananas e 3 cerejas", 61.90, 'Cartão de crédito',request)
    }
}
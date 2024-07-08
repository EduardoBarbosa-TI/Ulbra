/*
    Estamos com uma aplicação web que precisa interagir com um banco de dados para realizar operações de leitura e escrita de dados.
    Precisamos garantir que haja apenas uma conexão com o banco de dados em toda a aplicação, para evitar múltiplas conexões simultâneas que poderiam causar problemas de performance, consumo excessivo de recursos e possíveis conflitos de estado.
*/

class Database {
    private static instance: Database;
    private connection: string;

    private constructor(){
        this.connection = "Postgres"
    }

    public static getInstance(): Database {
        if(!Database.instance) {
            Database.instance = new Database();
        }
        return Database.instance
    }

    public getConnection(): string {
        return this.connection;
    }

    public query(sql: string): void {
        console.log("Executing query");
    }
}

const database01 = Database.getInstance();
const database02 = Database.getInstance();

database01.query("SELECT * FROM users");
database02.query("INSERT INTO products (name, price) VALUES ('Produto A', 99.99)");

console.log(database01.getConnection); // Postgres
console.log(database02.getConnection); // Postgres

console.log(database01 === database02) // True


/*


*/
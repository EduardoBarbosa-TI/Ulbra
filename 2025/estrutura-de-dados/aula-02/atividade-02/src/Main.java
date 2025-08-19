//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria(5);

        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);
        Livro l2 = new Livro("1984", "George Orwell", 328);
        Livro l3 = new Livro("Dom Casmurro", "Machado de Assis", 256);

        livraria.inserirLivro(l1);
        livraria.inserirLivro(l2);
        livraria.inserirLivro(l3);

        System.out.println("\n--- Lista completa de livros ---");
        livraria.listarLivros();

        System.out.println("\n--- Reservando livros ---");
        l2.reservar();
        l2.reservar();

        System.out.println("\n--- Lista de disponíveis ---");
        livraria.listarDisponiveis();

        System.out.println("\n--- Devolvendo livro ---");
        l2.devolver();
        l2.devolver();

        System.out.println("\n--- Lista de disponíveis após devolução ---");
        livraria.listarDisponiveis();
    }
}
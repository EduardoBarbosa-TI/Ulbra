public class Main {
    public static void main(String[] args) {

        System.out.println("=== Lista Encadeada ===");
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.adicionarNoInicio("A");
        lista.adicionarNoFim("B");
        lista.adicionarNaPosicao(1, "C");
        lista.exibir();

        lista.removerPorValor("B");
        lista.exibir();

        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("\n=== Pilha ===");
        Pilha<Integer> pilha = new Pilha<>();
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.exibir();
        System.out.println("Desempilhado: " + pilha.desempilhar());
        pilha.exibir();

        System.out.println("\n=== Fila ===");
        Fila<Integer> fila = new Fila<>();
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.exibir();
        System.out.println("Desenfileirado: " + fila.desenfileirar());
        fila.exibir();
    }
}

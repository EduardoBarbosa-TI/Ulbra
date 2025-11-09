public class Fila<T> {
    private No<T> inicio;
    private No<T> fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    public void enfileirar(T valor) {
        No<T> novo = new No<>(valor);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    public T desenfileirar() {
        if (estaVazia()) throw new RuntimeException("Fila vazia.");
        T valor = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) fim = null;
        return valor;
    }

    public T frente() {
        if (estaVazia()) throw new RuntimeException("Fila vazia.");
        return inicio.dado;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void exibir() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " <- ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}

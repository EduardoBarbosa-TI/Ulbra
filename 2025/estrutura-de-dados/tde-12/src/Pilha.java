public class Pilha<T> {
    private No<T> topo;

    public Pilha() {
        this.topo = null;
    }

    public void empilhar(T valor) {
        No<T> novo = new No<>(valor);
        novo.proximo = topo;
        topo = novo;
    }

    public T desempilhar() {
        if (estaVazia()) throw new RuntimeException("Pilha vazia.");
        T valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

    public T topo() {
        if (estaVazia()) throw new RuntimeException("Pilha vazia.");
        return topo.dado;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void exibir() {
        No<T> atual = topo;
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }
}

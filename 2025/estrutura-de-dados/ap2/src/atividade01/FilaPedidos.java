package atividade01;

public class FilaPedidos {
    private No inicio;
    private No fim;

    public boolean isEmpty() {
        return inicio == null;
    }

    public void enqueue(Pedido pedido) {
        No novo = new No(pedido);
        if (isEmpty()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    public Pedido dequeue() {
        if (isEmpty()) return null;
        Pedido p = inicio.pedido;
        inicio = inicio.proximo;
        if (inicio == null) fim = null;
        return p;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Nenhum pedido pendente.");
            return;
        }
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }
}

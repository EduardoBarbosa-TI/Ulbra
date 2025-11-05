package atividade01;

public class PilhaCancelados {
    private No topo;

    public boolean isEmpty() {
        return topo == null;
    }

    public void push(Pedido pedido) {
        No novo = new No(pedido);
        novo.proximo = topo;
        topo = novo;
    }

    public Pedido pop() {
        if (isEmpty()) return null;
        Pedido p = topo.pedido;
        topo = topo.proximo;
        return p;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Nenhum pedido cancelado.");
            return;
        }
        No atual = topo;
        while (atual != null) {
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }
}

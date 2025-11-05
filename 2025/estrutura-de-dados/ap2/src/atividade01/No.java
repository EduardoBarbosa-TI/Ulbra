package atividade01;

public class No {
    Pedido pedido;
    No proximo;

    public No(Pedido pedido) {
        this.pedido = pedido;
        this.proximo = null;
    }
}

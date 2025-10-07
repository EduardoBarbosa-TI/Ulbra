package filaatendimento;

public class Fila {
    private Cliente[] elementos;
    private int tamanho;

    public Fila(int capacidade) { elementos = new Cliente[capacidade]; tamanho = 0; }
    public boolean estaVazia() { return tamanho == 0; }
    public boolean estaCheia() { return tamanho == elementos.length; }

    public boolean enfileirar(Cliente cliente) {
        if (!estaCheia()) { elementos[tamanho++] = cliente; return true; }
        return false;
    }

    public Cliente desenfileirar() {
        if (!estaVazia()) {
            Cliente cliente = elementos[0];
            for (int i = 0; i < tamanho - 1; i++) elementos[i] = elementos[i + 1];
            tamanho--;
            return cliente;
        }
        return null;
    }
}

package filacircular;

public class FilaCircular {
    private int[] elementos;
    private int inicio, fim, tamanho;

    public FilaCircular(int capacidade) { elementos = new int[capacidade]; inicio = 0; fim = -1; tamanho = 0; }
    public boolean estaVazia() { return tamanho == 0; }
    public boolean estaCheia() { return tamanho == elementos.length; }

    public boolean enfileirar(int valor) {
        if (!estaCheia()) { fim = (fim + 1) % elementos.length; elementos[fim] = valor; tamanho++; return true; }
        return false;
    }

    public Integer desenfileirar() {
        if (!estaVazia()) { int valor = elementos[inicio]; inicio = (inicio + 1) % elementos.length; tamanho--; return valor; }
        return null;
    }

    public Integer espiar() { return estaVazia() ? null : elementos[inicio]; }
}

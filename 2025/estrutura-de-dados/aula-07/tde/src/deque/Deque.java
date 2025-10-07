package deque;

public class Deque {
    private int[] elementos;
    private int inicio, fim, tamanho;

    public Deque(int capacidade) { elementos = new int[capacidade]; inicio = 0; fim = -1; tamanho = 0; }
    public boolean estaVazio() { return tamanho == 0; }
    public boolean estaCheio() { return tamanho == elementos.length; }

    public void inserirNoInicio(int valor) { if (!estaCheio()) { inicio = (inicio - 1 + elementos.length) % elementos.length; elementos[inicio] = valor; tamanho++; } }
    public void inserirNoFim(int valor) { if (!estaCheio()) { fim = (fim + 1) % elementos.length; elementos[fim] = valor; tamanho++; } }
    public Integer removerDoInicio() { if (!estaVazio()) { int valor = elementos[inicio]; inicio = (inicio + 1) % elementos.length; tamanho--; return valor; } return null; }
    public Integer removerDoFim() { if (!estaVazio()) { int valor = elementos[fim]; fim = (fim - 1 + elementos.length) % elementos.length; tamanho--; return valor; } return null; }
    public Integer consultarInicio() { return estaVazio() ? null : elementos[inicio]; }
    public Integer consultarFim() { return estaVazio() ? null : elementos[fim]; }
    public int tamanho() { return tamanho; }
    public void limpar() { inicio = 0; fim = -1; tamanho = 0; }
}

package filaprioridade;

public class FilaPrioridade {
    private ElementoPrioridade[] elementos;
    private int tamanho;

    public FilaPrioridade(int capacidade) { elementos = new ElementoPrioridade[capacidade]; tamanho = 0; }
    public boolean estaVazia() { return tamanho == 0; }
    public boolean estaCheia() { return tamanho == elementos.length; }

    public void enfileirar(ElementoPrioridade novo) {
        if (estaCheia()) return;
        int i;
        for (i = tamanho - 1; i >= 0; i--) {
            if (novo.getPrioridade() > elementos[i].getPrioridade()) elementos[i + 1] = elementos[i];
            else break;
        }
        elementos[i + 1] = novo;
        tamanho++;
    }

    public ElementoPrioridade desenfileirar() {
        if (!estaVazia()) return elementos[--tamanho];
        return null;
    }
}

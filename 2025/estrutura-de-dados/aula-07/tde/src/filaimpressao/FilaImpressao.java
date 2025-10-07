package filaimpressao;

public class FilaImpressao {
    private Documento[] elementos;
    private int tamanho;

    public FilaImpressao(int capacidade) { elementos = new Documento[capacidade]; tamanho = 0; }
    public boolean estaVazia() { return tamanho == 0; }
    public boolean estaCheia() { return tamanho == elementos.length; }

    public boolean enfileirar(Documento doc) {
        if (!estaCheia()) { elementos[tamanho++] = doc; return true; }
        return false;
    }

    public Documento desenfileirar() {
        if (!estaVazia()) {
            Documento doc = elementos[0];
            for (int i = 0; i < tamanho - 1; i++) elementos[i] = elementos[i + 1];
            tamanho--;
            return doc;
        }
        return null;
    }

    public Documento proximo() { return estaVazia() ? null : elementos[0]; }
}

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(String elemento) {
        if (tamanho == elementos.length) {
            aumentarCapacidade();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void adicionar(int posicao, String elemento) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida");
        }
        if (tamanho == elementos.length) {
            aumentarCapacidade();
        }
        for (int i = tamanho; i > posicao; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    public String obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida");
        }
        return elementos[posicao];
    }

    public void alterar(int posicao, String novoValor) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida");
        }
        elementos[posicao] = novoValor;
    }

    private void aumentarCapacidade() {
        String[] novosElementos = new String[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novosElementos[i] = elementos[i];
        }
        elementos = novosElementos;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida");
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
    }

    public boolean remover(String valor) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(valor)) {
                remover(i);
                return true;
            }
        }
        return false;
    }

    public boolean contem(String valor) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(valor)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean vazio() {
        return tamanho == 0;
    }

    public void limpar() {
        elementos = new String[elementos.length];
        tamanho = 0;
    }

    @Override
    public String toString() {
        if (tamanho == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
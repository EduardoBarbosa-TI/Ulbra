public class Matriz {
    private int[][] elementos;
    private int linhas;
    private int colunas;
    private int elementosInseridos = 0;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementos = new int[linhas][colunas];
    }

    public void inserir(int valor) {
        if (elementosInseridos >= linhas * colunas) {
            System.out.println("A matriz já está cheia!");
        }
        int linha = elementosInseridos / colunas;
        int coluna = elementosInseridos % colunas;
        elementos[linha][coluna] = valor;
        elementosInseridos++;
    }

    public int maiorElemento() {
        int maior = elementos[0][0];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (elementos[i][j] > maior) {
                    maior = elementos[i][j];
                }
            }
        }
        return maior;
    }

    public int menorElemento() {
        int menor = elementos[0][0];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (elementos[i][j] < menor) {
                    menor = elementos[i][j];
                }
            }
        }
        return menor;
    }

    public double media() {
        int soma = somaTotal();
        return (double) soma / (linhas * colunas);
    }

    public int somaTotal() {
        int soma = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma += elementos[i][j];
            }
        }
        return soma;
    }

    public int contarOcorrencias(int valor) {
        int contador = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (elementos[i][j] == valor) {
                    contador++;
                }
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < linhas; i++) {
            sb.append("[ ");
            for (int j = 0; j < colunas; j++) {
                sb.append(elementos[i][j]).append(" ");
            }
            sb.append("]\n");
        }
        return sb.toString();
    }
}

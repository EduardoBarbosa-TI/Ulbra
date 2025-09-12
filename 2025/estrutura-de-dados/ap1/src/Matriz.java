import java.util.Random;
import java.util.Scanner;

public class Matriz {
    private int[][] elementos;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        if (linhas <= 0 || colunas <= 0) {
            throw new IllegalArgumentException("Dimensões da matriz devem ser maiores que zero.");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementos = new int[linhas][colunas];
    }

    public void preencherManual() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha a matriz manualmente:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                elementos[i][j] = scanner.nextInt();
            }
        }
    }

    public void preencherAutomatico(int limiteMin, int limiteMax) {
        Random random = new Random();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                elementos[i][j] = random.nextInt(limiteMax - limiteMin + 1) + limiteMin;
            }
        }
    }

    public void removerElemento(int linha, int coluna) {
        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            System.out.println("Posição inválida!");
            return;
        }
        elementos[linha][coluna] = 0;
    }

    public void exibirMatriz() {
        System.out.println("Matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(elementos[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            // Particiona o vetor e retorna o índice do pivô
            int indicePivo = particionar(vetor, inicio, fim);
            // Ordena a sublista à esquerda do pivô
            quickSort(vetor, inicio, indicePivo - 1);
            //Ordena a sublista à direita do pivô
            quickSort(vetor, indicePivo + 1, fim);
        }
    }

    private static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim]; // Escolhe o último elemento como pivô
        int i = (inicio - 1); // Índice do menor elemento

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) { // Se o elemento atual é menor ou igual ao pivô
                i++;
                // Troca vetor[i] e vetor[j]
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        // Troca vetor[i+1] com o pivô (vetor[fim])
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1; // Retorna o índice do pivô
    }

    public void ordenarPorLinhas(boolean usarQuickSort) {
        for (int i = 0; i < linhas; i++) {
            if (usarQuickSort) {
                quickSort(elementos[i], 0, colunas - 1);
            } else {
                bubbleSort(elementos[i]);
            }
        }
    }

    public void ordenarPorColunas(boolean usarQuickSort) {
        for (int j = 0; j < colunas; j++) {
            int[] coluna = new int[linhas];
            for (int i = 0; i < linhas; i++) {
                coluna[i] = elementos[i][j];
            }

            if (usarQuickSort) {
                quickSort(coluna, 0, linhas - 1);
            } else {
                bubbleSort(coluna);
            }

            for (int i = 0; i < linhas; i++) {
                elementos[i][j] = coluna[i];
            }
        }
    }

    public void ordenarMatrizCompleta(boolean usarQuickSort) {
        int[] vetor = new int[linhas * colunas];
        int k = 0;

        // Achatar a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                vetor[k++] = elementos[i][j];
            }
        }

        // Ordenar o vetor
        if (usarQuickSort) {
            quickSort(vetor, 0, vetor.length - 1);
        } else {
            bubbleSort(vetor);
        }

        // Reconstruir a matriz
        k = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                elementos[i][j] = vetor[k++];
            }
        }
    }

    public int getElemento(int linha, int coluna) {
        return elementos[linha][coluna];
    }

    public void setElemento(int linha, int coluna, int valor) {
        elementos[linha][coluna] = valor;
    }
}


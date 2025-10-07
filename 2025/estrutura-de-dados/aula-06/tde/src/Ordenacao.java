public class Ordenacao {

    public static class ResultadoOrdenacao {
        public String algoritmo;
        public int iteracoes;
        public int trocas;
        public double tempoSegundos;

        public ResultadoOrdenacao(String algoritmo, int iteracoes, int trocas, double tempoSegundos) {
            this.algoritmo = algoritmo;
            this.iteracoes = iteracoes;
            this.trocas = trocas;
            this.tempoSegundos = tempoSegundos;
        }

        @Override
        public String toString() {
            return String.format("%s -> Iterações: %d | Trocas: %d | Tempo: %.6f s",
                    algoritmo, iteracoes, trocas, tempoSegundos);
        }
    }

    public static ResultadoOrdenacao bubbleSort(int[] vetor) {
        int n = vetor.length;
        int iteracoes = 0, trocas = 0;
        double inicio = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                iteracoes++;
                if (vetor[j] > vetor[j + 1]) {
                    trocas++;
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        double tempo = (System.nanoTime() - inicio) / 1_000_000_000.0;
        return new ResultadoOrdenacao("Bubble Sort", iteracoes, trocas, tempo);
    }

    public static ResultadoOrdenacao selectionSort(int[] vetor) {
        int n = vetor.length;
        int iteracoes = 0, trocas = 0;
        double inicio = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                iteracoes++;
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
            if (min != i) {
                trocas++;
                int temp = vetor[min];
                vetor[min] = vetor[i];
                vetor[i] = temp;
            }
        }

        double tempo = (System.nanoTime() - inicio) / 1_000_000_000.0;
        return new ResultadoOrdenacao("Selection Sort", iteracoes, trocas, tempo);
    }

    public static ResultadoOrdenacao insertionSort(int[] vetor) {
        int iteracoes = 0, trocas = 0;
        double inicio = System.nanoTime();

        for (int i = 1; i < vetor.length; i++) {
            int valor = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > valor) {
                iteracoes++;
                vetor[j + 1] = vetor[j];
                trocas++;
                j--;
            }
            vetor[j + 1] = valor;
        }

        double tempo = (System.nanoTime() - inicio) / 1_000_000_000.0;
        return new ResultadoOrdenacao("Insertion Sort", iteracoes, trocas, tempo);
    }

    public static ResultadoOrdenacao mergeSort(int[] vetor) {
        double inicio = System.nanoTime();
        Contador contador = new Contador();
        mergeSortRec(vetor, 0, vetor.length - 1, contador);
        double tempo = (System.nanoTime() - inicio) / 1_000_000_000.0;
        return new ResultadoOrdenacao("Merge Sort", contador.iteracoes, contador.trocas, tempo);
    }

    private static void mergeSortRec(int[] vetor, int inicio, int fim, Contador contador) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortRec(vetor, inicio, meio, contador);
            mergeSortRec(vetor, meio + 1, fim, contador);
            merge(vetor, inicio, meio, fim, contador);
        }
    }

    private static void merge(int[] vetor, int inicio, int meio, int fim, Contador contador) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;
        int[] esquerda = new int[n1];
        int[] direita = new int[n2];
        for (int i = 0; i < n1; i++) esquerda[i] = vetor[inicio + i];
        for (int j = 0; j < n2; j++) direita[j] = vetor[meio + 1 + j];

        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            contador.iteracoes++;
            if (esquerda[i] <= direita[j]) {
                vetor[k++] = esquerda[i++];
            } else {
                vetor[k++] = direita[j++];
                contador.trocas++;
            }
        }
        while (i < n1) vetor[k++] = esquerda[i++];
        while (j < n2) vetor[k++] = direita[j++];
    }

    public static ResultadoOrdenacao quickSort(int[] vetor) {
        double inicio = System.nanoTime();
        Contador contador = new Contador();
        quickSortRec(vetor, 0, vetor.length - 1, contador);
        double tempo = (System.nanoTime() - inicio) / 1_000_000_000.0;
        return new ResultadoOrdenacao("Quick Sort", contador.iteracoes, contador.trocas, tempo);
    }

    private static void quickSortRec(int[] vetor, int inicio, int fim, Contador contador) {
        if (inicio < fim) {
            int indicePivo = particionar(vetor, inicio, fim, contador);
            quickSortRec(vetor, inicio, indicePivo - 1, contador);
            quickSortRec(vetor, indicePivo + 1, fim, contador);
        }
    }

    private static int particionar(int[] vetor, int inicio, int fim, Contador contador) {
        int pivo = vetor[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            contador.iteracoes++;
            if (vetor[j] <= pivo) {
                i++;
                contador.trocas++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;
        contador.trocas++;
        return i + 1;
    }

    private static class Contador {
        int iteracoes = 0;
        int trocas = 0;
    }
}

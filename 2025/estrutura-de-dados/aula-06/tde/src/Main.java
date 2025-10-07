import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tamanhos = {100, 10_000, 100_000};

        for (int tamanho : tamanhos) {
            System.out.println("\n==== Tamanho: " + tamanho + " elementos ====");

            int[] crescente = gerarArrayCrescente(tamanho);
            int[] decrescente = gerarArrayDecrescente(tamanho);
            int[] aleatorio = gerarArrayAleatorio(tamanho);

            testarTodos("Crescente", crescente);
            testarTodos("Decrescente", decrescente);
            testarTodos("Aleatório", aleatorio);
        }
    }

    private static void testarTodos(String tipo, int[] base) {
        System.out.println("\n--- Cenário: " + tipo + " ---");
        System.out.println(Ordenacao.bubbleSort(base.clone()));
        System.out.println(Ordenacao.selectionSort(base.clone()));
        System.out.println(Ordenacao.insertionSort(base.clone()));
        System.out.println(Ordenacao.mergeSort(base.clone()));
        System.out.println(Ordenacao.quickSort(base.clone()));
    }

    private static int[] gerarArrayCrescente(int tamanho) {
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) v[i] = i;
        return v;
    }

    private static int[] gerarArrayDecrescente(int tamanho) {
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) v[i] = tamanho - i;
        return v;
    }

    private static int[] gerarArrayAleatorio(int tamanho) {
        Random r = new Random();
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) v[i] = r.nextInt(tamanho * 10);
        return v;
    }
}

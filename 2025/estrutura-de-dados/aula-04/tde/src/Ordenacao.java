public class Ordenacao {

    public static void bubbleSort(int[] vetor){
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++){
            for(int j = 0; j < n -i -1; j++){
                if(vetor[j] > vetor[j + 1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortTexto(String[] vetor){
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++){
            for(int j = 0; j < n -i -1; j++){
                if(vetor[j].compareTo(vetor[j + 1]) > 0){
                    String temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] vetor){
        int n = vetor.length;

        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(vetor[j] < vetor[min]){
                    min = j;
                }
            }
            int temp = vetor[min];
            vetor[min] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void insertionSort(int[] vetor){
        int n = vetor.length;
        for(int i = 1; i < n; i++){

            int valor = vetor[i];
            int j = i - 1;

            while(j >= 0 && vetor[j] > valor){
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = valor;

        }

    }

}
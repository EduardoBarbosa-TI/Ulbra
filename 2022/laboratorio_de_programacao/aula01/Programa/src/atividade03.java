/*Imprima os 15 primeiros números da série de Fibonacci. A série de Fibonacci é tem os
seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro e segundo
elementos valem 1, e daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado
ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
*/
    public class atividade03 {
    static int fibo(int n) {
        int numeroFibonacci = 0;
        int numeroAntecessor = 0;

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                numeroFibonacci = 1;
                numeroAntecessor = 0;
            } else {
                numeroFibonacci += numeroAntecessor;
                numeroAntecessor = numeroFibonacci - numeroAntecessor;
            }

        }

        return numeroFibonacci;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + atividade03.fibo(i) + "\t");
        }

    }
}
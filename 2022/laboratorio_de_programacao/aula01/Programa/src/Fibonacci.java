/*Imprima os 15 primeiros números da série de Fibonacci. A série de Fibonacci é tem os
seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro e segundo
elementos valem 1, e daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado
ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
*/
public class  Fibonacci{
    static long fibo(int n) {
        int F = 0;
        int atual = 0;

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                F = 1;
                atual = 0;
            } else {
                F += atual;
                atual = F - atual;
            }

        }

        return F;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }

    }
}
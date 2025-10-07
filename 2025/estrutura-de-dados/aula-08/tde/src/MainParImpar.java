import java.util.Scanner;

public class MainParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha par = new Pilha(10);
        Pilha impar = new Pilha(10);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            int num = sc.nextInt();

            if (num > 0) {
                if (num % 2 == 0) par.empilhar(String.valueOf(num));
                else impar.empilhar(String.valueOf(num));
            } else if (num == 0) {
                System.out.println("Número zero! Desempilhando de cada pilha...");
                if (!par.estaVazia()) System.out.println("Par desempilhado: " + par.desempilhar());
                else System.out.println("Pilha de pares vazia!");
                if (!impar.estaVazia()) System.out.println("Ímpar desempilhado: " + impar.desempilhar());
                else System.out.println("Pilha de ímpares vazia!");
            }
        }

        System.out.println("\nDesempilhando pilha de pares:");
        while (!par.estaVazia()) System.out.println(par.desempilhar());

        System.out.println("\nDesempilhando pilha de ímpares:");
        while (!impar.estaVazia()) System.out.println(impar.desempilhar());

        sc.close();
    }
}

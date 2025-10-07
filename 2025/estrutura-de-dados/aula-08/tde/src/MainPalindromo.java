import java.util.Scanner;

public class MainPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra ou sequência: ");
        String texto = sc.nextLine().toUpperCase(); // ignora maiúsculas/minúsculas

        Pilha pilha = new Pilha(texto.length());
        for (int i = 0; i < texto.length(); i++) pilha.empilhar(String.valueOf(texto.charAt(i)));

        boolean palindromo = true;
        for (int i = 0; i < texto.length(); i++) {
            if (!texto.substring(i, i+1).equals(pilha.desempilhar())) {
                palindromo = false;
                break;
            }
        }

        System.out.println("A sequência é palíndromo? " + (palindromo ? "Sim" : "Não"));
        sc.close();
    }
}

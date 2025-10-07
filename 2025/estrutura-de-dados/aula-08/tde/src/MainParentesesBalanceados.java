import java.util.Scanner;

public class MainParentesesBalanceados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a expressão: ");
        String expr = sc.nextLine();

        Pilha pilha = new Pilha(expr.length());
        boolean balanceado = true;

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '(') pilha.empilhar("(");
            else if (c == ')') {
                if (pilha.estaVazia()) {
                    balanceado = false;
                    break;
                } else pilha.desempilhar();
            }
        }

        if (!pilha.estaVazia()) balanceado = false;
        System.out.println("A expressão está " + (balanceado ? "balanceada" : "não balanceada"));

        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int totalSomas = 0;
        int totalSubtracoes = 0;
        int totalMultiplicacoes = 0;
        int totalDivisoes = 0;
        int totalOperacoes = 0;

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nDigite o primeiro número:");
            int numero1 = scan.nextInt();

            System.out.println("Digite o segundo número:");
            int numero2 = scan.nextInt();

            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Opção: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + calc.somar(numero1, numero2));
                    totalSomas++;
                    break;
                case 2:
                    System.out.println("Resultado: " + calc.subtrair(numero1, numero2));
                    totalSubtracoes++;
                    break;
                case 3:
                    System.out.println("Resultado: " + calc.multiplicar(numero1, numero2));
                    totalMultiplicacoes++;
                    break;
                case 4:
                    System.out.println("Resultado: " + calc.dividir(numero1, numero2));
                    totalDivisoes++;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue; // volta ao início sem contar como operação
            }

            totalOperacoes++;

            System.out.print("\nDeseja realizar outra operação? (s/n): ");
            String resposta = scan.next();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        // Exibe o resumo
        System.out.println("\nResumo das operações:");
        System.out.println("Somas realizadas: " + totalSomas);
        System.out.println("Subtrações realizadas: " + totalSubtracoes);
        System.out.println("Multiplicações realizadas: " + totalMultiplicacoes);
        System.out.println("Divisões realizadas: " + totalDivisoes);
        System.out.println("Total geral de operações: " + totalOperacoes);
    }
}

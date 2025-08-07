import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calculadora calc1 = new Calculadora();


        int numero1 = 10;
        int numero2 = 8;
        int totalSomas = 0;
        System.out.println("Escolha uma opção: \n 1-Somar \n 2-Subtrair ...");
        int opcao = scan.nextInt();

        switch (opcao){
            case 1:
                System.out.println("A soma dos número é " + calc1.somar(numero1, numero2));
                totalSomas++;
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

}

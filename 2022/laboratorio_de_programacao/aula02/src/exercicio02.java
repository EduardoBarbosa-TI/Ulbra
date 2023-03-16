import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        int number;
        int numberPrimo;
        int soma = 0;
        Scanner ler = new Scanner(System.in);

        try{
            System.out.printf("Informe um número inteiro positivo:\n");
            number = ler.nextInt();

            if(number > 0){
                for(int i = 2; i < number; i ++){
                    if(number % i == 1){
                         System.out.println("O número " + number + " é primo");
                         return;
                    }else{
                        System.out.println("O número " + number + " não é primo");
                        return;
                    }
                }
            }else{
                System.out.println("Digite um número inteiro positivo !");

            }
        } catch( Exception e){
            System.out.println("Digite um número inteiro positivo !");
        }
    }
}
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        int number;
        int numberPrimo;

        Scanner ler = new Scanner(System.in);

        try{
            System.out.printf("Informe um número inteiro positivo:\n");
            number = ler.nextInt();

            if(number > 0){
               for(int cont = 1; cont <= number; cont++)
                   if(cont % 2 == 1){
                       System.out.println(cont + " é ímpar ");
                   }
            }else{
                System.out.println("Digite um número inteiro positivo !");
            }
        } catch( Exception e){
            System.out.println("Digite um número inteiro positivo !");
        }
    }
}
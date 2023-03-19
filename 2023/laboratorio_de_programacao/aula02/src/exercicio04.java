import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        int number;
        int numberPrimo;

        Scanner ler = new Scanner(System.in);

        try{
            System.out.printf("Informe um número inteiro positivo:\n");
            number = ler.nextInt();
            int cont = 1;

            if(number > 0){
               while(cont != number) {
                   cont ++;
                   if(cont % 2 == 0){
                       System.out.println(cont + " é par");
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
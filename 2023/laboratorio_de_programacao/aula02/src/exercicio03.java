import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        int number;
        int numberPrimo;

        Scanner ler = new Scanner(System.in);

        try{
            System.out.printf("Informe um número inteiro positivo:\n");
            number = ler.nextInt();

            if(number > 0){
                for(int i = 0; i <= 10; i++){
                    System.out.println(number + " x " + i + " = " + number*i);
                }
            }else{
                System.out.println("Digite um número inteiro positivo !");
            }
        } catch( Exception e){
            System.out.println("Digite um número inteiro positivo !");
        }
    }
}
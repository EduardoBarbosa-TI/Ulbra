import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        int number;
        int soma = 0;
        Scanner ler = new Scanner(System.in);

        try{
            System.out.printf("Informe um número inteiro:\n");
            number = ler.nextInt();

            while(soma < number){
                for(int i = 0; i < number; i++ ) {
                    soma += i;
                }
            }
            System.out.println(soma);

        } catch( Exception e){
            System.out.println("Digite um número inteiro !");
        }
    }
}
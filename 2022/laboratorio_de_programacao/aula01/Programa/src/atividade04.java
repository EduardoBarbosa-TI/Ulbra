/*Escreva um programa que imprime na saída os valores assumidos por x. Esta variável x deve
iniciar com algum valor escolhido por você. Se x for par, x deve receber o valor dele mesmo
somado com 5. Já se x for ímpar, x deve receber o valor dele multiplicado por 2. O programa
termina assim que x for maior que 1000.
Por exemplo, para x = 10, a saída deve ser: 15, 30, 35, 70, 75, 150, 155, 310, 315, 630, 635,
1270.
Crie este programa primeiro usando a estrutura de controle if-else e depois usando a
estrutura de controle switch.
*/
public class atividade04 {
    public static void main(String[] args) {

        for(int number = 10; number < 1000;){
            if(number%2 == 0){
                number += 5;
                System.out.println(number);
            }else{
                number *= 2;
                System.out.println(number);
            }
        }



    }
}
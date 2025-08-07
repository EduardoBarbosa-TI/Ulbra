import java.util.Scanner;

public class Calculadora {
    public int somar(int num1, int num2){
        return num1 + num2;
    }
    public int somar(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public int subtrair(int num1, int num2){
        return num1 - num2;
    }
    public int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    public double dividir(int num1, int num2){
        if(num2 == 0){
            System.out.println("Impossível divisão por zero.");
            return 0.0;
        }else{
            return (double) num1 / num2;
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Fracao fracao1 = new Fracao(2, 3);
        Fracao fracao2 = new Fracao(4, 5);
        Fracao resultado = fracao1.multiplicacao_fracoes(fracao2);
        System.out.println(fracao1 + " * " + fracao2 + " = " + resultado);
    }
}
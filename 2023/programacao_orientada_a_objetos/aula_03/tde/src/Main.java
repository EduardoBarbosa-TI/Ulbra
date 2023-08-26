import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Soma
        System.out.println("Soma");
        IOperador operadorSoma = new Soma();
        ArrayList<Double> listaDoubleSoma = new ArrayList();

        listaDoubleSoma.add(5.0);
        listaDoubleSoma.add(10.0);
        listaDoubleSoma.add(15.0);
        listaDoubleSoma.add(20.0);
        CalculadoraBase calcSoma= new CalculadoraBase();
        calcSoma.calcular(operadorSoma,listaDoubleSoma);
        System.out.println(calcSoma.getResult());
        //Multiplicação
        System.out.println("Multiplicação");
        IOperador operadorMultiplicacao = new Multiplicacao();
        ArrayList<Double> listaDoubleMultiplicacao = new ArrayList();

        listaDoubleMultiplicacao.add(5.0);
        listaDoubleMultiplicacao.add(10.0);
        listaDoubleMultiplicacao.add(15.0);
        listaDoubleMultiplicacao.add(20.0);
        CalculadoraBase calcMultiplicacao = new CalculadoraBase();
        calcMultiplicacao.calcular(operadorMultiplicacao,listaDoubleMultiplicacao);
        System.out.println(calcMultiplicacao.getResult());
        //Subtração
        System.out.println("Subtração");
        IOperador operadorSubtracao = new Subtracao();
        ArrayList<Double> listaDoubleSubtracao = new ArrayList();

        listaDoubleSubtracao.add(20.0);
        listaDoubleSubtracao.add(5.0);
        listaDoubleSubtracao.add(5.0);
        listaDoubleSubtracao.add(2.0);
        CalculadoraBase calcSubtracao = new CalculadoraBase();
        calcSubtracao.calcular(operadorSubtracao,listaDoubleSubtracao);
        System.out.println(calcSubtracao.getResult());
        //Divisão
        System.out.println("Divisão");
        IOperador operadorDivisao = new Divisao();
        ArrayList<Double> listaDoubleDivisao = new ArrayList();

        listaDoubleDivisao.add(20.0);
        listaDoubleDivisao.add(5.0);
        listaDoubleDivisao.add(5.0);
        listaDoubleDivisao.add(2.0);
        CalculadoraBase calcDivisao = new CalculadoraBase();
        calcDivisao.calcular(operadorDivisao,listaDoubleDivisao);
        System.out.println(calcSubtracao.getResult());

    }
}
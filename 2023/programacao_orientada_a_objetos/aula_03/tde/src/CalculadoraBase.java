import java.util.ArrayList;

public class CalculadoraBase extends Calculadora{
    @Override
    void calcular(IOperador operador, ArrayList<Double> lista) {
        setResult(operador.calcular(lista));
    }
}

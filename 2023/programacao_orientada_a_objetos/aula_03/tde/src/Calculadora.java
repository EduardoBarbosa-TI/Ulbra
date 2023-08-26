import java.util.ArrayList;
abstract class Calculadora {
    private double result;
    abstract void calcular(IOperador operador, ArrayList<Double> lista);
    public double getResult() {return result;}
    public void setResult(double result) {
        this.result = result;
    }
}

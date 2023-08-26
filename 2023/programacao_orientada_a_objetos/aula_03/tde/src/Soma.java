import java.util.ArrayList;

public class Soma implements IOperador{
    @Override
    public double calcular(ArrayList<Double> lista) {
        double result = 0.0;

        for(int i = 0; i < lista.size(); i++){
            result += lista.get(i);
        }

        return result;
    }
}

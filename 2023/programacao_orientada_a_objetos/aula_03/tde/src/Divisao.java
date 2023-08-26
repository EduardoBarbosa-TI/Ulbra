import java.util.ArrayList;

public class Divisao implements  IOperador{
    @Override
    public double calcular(ArrayList<Double> lista) {
        double result = lista.get(0);

        for(int i = 1; i < lista.size(); i++){
            if(lista.get(i) > result && i == 1) {
                return 0;
            } else if(lista.get(i) > result) {
                return result;
            }

            result /= lista.get(i);
        }

        return result;
    }
}

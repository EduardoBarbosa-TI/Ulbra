import static java.lang.Math.PI;

public class Circunferencia {
    int raio;

    public void setRaio(int raio){
        this.raio = raio;
    }

    public double calcularArea(){
        double areaCalculada = (PI * (this.raio*this.raio));
        return areaCalculada;
    }

}

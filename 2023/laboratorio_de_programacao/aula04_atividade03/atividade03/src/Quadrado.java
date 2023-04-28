import static java.lang.Math.pow;

public class Quadrado {
    int lados;
    public void setLados(int lados){
        this.lados = lados;
    }


    public double calularArea(){
        double areaCalculada = this.lados*lados;
        return areaCalculada;
    }

}

public class Trapezio {
    int baseMaior  = 4;
    int h = 3;
    int baseMenor = 6;

    public void basemenor_H_baseMenor(int baseMaior, int h, int baseMenor){
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.h = h;
    }


    public double calcularArea(){
        double areaCalculada = ((this.baseMaior + this.baseMenor)*this.h)/2;
        return areaCalculada;
    }

}

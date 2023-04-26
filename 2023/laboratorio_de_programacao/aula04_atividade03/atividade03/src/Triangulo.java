public class Triangulo {
    int base;
    int h;

    public void setBase_H(int base, int h) {
        this.base = base;
        this.h = h;
    }
    public double calcularArea(){
        double areaCalculada = (this.base*this.h)/2;
        return areaCalculada;
    }


}

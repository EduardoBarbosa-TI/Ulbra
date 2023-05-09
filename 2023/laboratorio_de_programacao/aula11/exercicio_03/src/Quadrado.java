public class Quadrado extends FiguraGeometrica {
    int lado;
    int areaCalculada;
    int perimetroCalculado;

    public void setLados(int lado) {
        this.lado = lado;
    }
    public int getLados() {
        return lado;
    }


    @Override
    public void calcularArea(){

        areaCalculada = lado*lado;

        System.out.println("Área calculada: " + areaCalculada);

    }

    public int calcularPerimetro(){
        perimetroCalculado = lado * 4;
        return perimetroCalculado;
    }
}

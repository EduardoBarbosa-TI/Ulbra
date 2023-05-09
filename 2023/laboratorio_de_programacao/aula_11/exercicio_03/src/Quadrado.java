public class Quadrado extends FiguraGeometrica {
    int lado;

    public void setLados(int lado) {
        this.lado = lado;
    }
    public int getLados() {
        return lado;
    }
    @Override
    public void calcularArea(){
        int areaCalculada = lado*lado;
        System.out.println("Área calculada: " + areaCalculada);
    }
    @Override
    public void calcularPerimetro(){
       int perimetroCalculado = lado * 4;
       System.out.println("Perímetro calculado: " + perimetroCalculado);
    }

}

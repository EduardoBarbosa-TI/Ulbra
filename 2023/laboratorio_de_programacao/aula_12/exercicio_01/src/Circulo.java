public class Circulo extends FormaGeometrica {
    final double PI = 3.14159;
    double raio;
    double area;
    double perimetro;
    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public void calcularArea() {
        area = PI * (raio * raio);
        System.out.println("A área do círculo é: " + area);
    }
    @Override
    public void calcularPerimetro() {
        perimetro = 2 * PI * raio;
        System.out.println("O perímertro do círculo é: " + perimetro);
    }


}

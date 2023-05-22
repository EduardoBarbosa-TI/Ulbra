public class Retangulo extends FormaGeometrica {
    double base;
    double altura;
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        double area;
        area = altura * base;

        System.out.println("A área do retângulo é: " + area);
    }
    @Override
    public void calcularPerimetro() {
       double perimetro;
       perimetro = 2 * (base + altura);

       System.out.println("O perímetro do retângulo é: " + perimetro);
    }
}

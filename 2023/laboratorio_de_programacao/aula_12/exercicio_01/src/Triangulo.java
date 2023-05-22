public class Triangulo extends FormaGeometrica {
    double base;
    double altura;
    double lado1;
    double lado2;
    double lado3;

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        double area;
        area = (base * altura ) / 2;
        System.out.println("A área do triângulo é: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("O perímetro do triângulo é: " + perimetro);
    }
}

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(3.5);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        System.out.println("  ");

        Retangulo retangulo = new Retangulo(3.5,6.7);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        System.out.println("   ");

        Triangulo triangulo = new Triangulo(3.5,6.3);
        triangulo.calcularArea();
        triangulo.setLado1(3);
        triangulo.setLado2(3);
        triangulo.setLado3(5);
        triangulo.calcularPerimetro();
    }
}
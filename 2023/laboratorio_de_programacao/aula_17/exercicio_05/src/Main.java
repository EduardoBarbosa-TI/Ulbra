public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        System.out.println(" ");

        Circulo circulo = new Circulo();
        circulo.calcularArea();
        circulo.calcularPerimetro();

        System.out.println(" ");

        Triangulo triangulo =  new Triangulo();
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
    }
}
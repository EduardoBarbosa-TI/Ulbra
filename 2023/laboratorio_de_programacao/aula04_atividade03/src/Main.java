public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Circunferencia circunferencia = new Circunferencia();
        Trapezio trapezio = new Trapezio();

        System.out.println(quadrado.calularArea());
        System.out.println(triangulo.calcularArea());
        System.out.println(circunferencia.calcularArea());
        System.out.println(trapezio.calcularArea());
    }
}
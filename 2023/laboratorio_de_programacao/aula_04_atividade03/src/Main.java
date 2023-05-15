public class Main {
    public static void main(String[] args) {

        Quadrado quadrado01 = new Quadrado();
        quadrado01.setLados(5);
        System.out.println(quadrado01.calularArea());

        Quadrado quadrado02 = new Quadrado();
        quadrado02.setLados(10);
        System.out.println(quadrado02.calularArea());


        Triangulo triangulo01 = new Triangulo();
        triangulo01.setBase_H(2,4);
        System.out.println(triangulo01.calcularArea());

        Triangulo triangulo02 = new Triangulo();
        triangulo02.setBase_H(2,4);
        System.out.println(triangulo02.calcularArea());


        Circunferencia circunferencia01 = new Circunferencia();
        circunferencia01.setRaio(5);
        System.out.println(circunferencia01.calcularArea());

        Circunferencia circunferencia02 = new Circunferencia();
        circunferencia02.setRaio(15);
        System.out.println(circunferencia02.calcularArea());


        Trapezio trapezio01 = new Trapezio();
        trapezio01.basemenor_H_baseMenor(2,3,4);
        System.out.println(trapezio01.calcularArea());

        Trapezio trapezio02 = new Trapezio();
        trapezio02.basemenor_H_baseMenor(2,3,4);
        System.out.println(trapezio02.calcularArea());

    }
}
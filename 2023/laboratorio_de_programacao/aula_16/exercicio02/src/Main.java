public class Main {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.0, 6.5, 10.0};
        double sumNotas = 0;

        for (int i = 0; i < notas.length; i++) {
             sumNotas += notas[i];
        }

        System.out.println(sumNotas / notas.length);
    }
}
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.dormir();

        System.out.println(" ");

        Gato gato = new Gato();
        gato.comer();
        gato.dormir();

        System.out.println(" ");

        Elefante elefante = new Elefante();
        elefante.comer();
        elefante.dormir();
    }
}
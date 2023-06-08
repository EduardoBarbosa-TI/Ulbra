public class Main {
    public static void main(String[] args) {
        Aviao aviao  = new Aviao();
        aviao.decolar();
        aviao.voar();
        aviao.aterrar();

        System.out.println(" ");

        Passaro passaro =  new Passaro();
        passaro.decolar();
        passaro.voar();
        passaro.aterrar();

        System.out.println(" ");

        Superman superman  =  new Superman();
        superman.decolar();
        superman.voar();
        superman.aterrar();
    }
}
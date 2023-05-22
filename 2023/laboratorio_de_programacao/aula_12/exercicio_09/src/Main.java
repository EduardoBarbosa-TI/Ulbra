public class Main {
    public static void main(String[] args) {
        Caminhao caminhao =  new Caminhao();
        caminhao.carregar();
        caminhao.descarregar();
        System.out.println(" ");

        Trem trem = new Trem();
        trem.carregar();
        trem.descarregar();
        System.out.println(" ");

        Navio navio =  new Navio();
        navio.carregar();
        navio.descarregar();
    }
}
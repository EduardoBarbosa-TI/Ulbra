public class Main {
    public static void main(String[] args) {
        Atacante atacante = new Atacante();
        atacante.atacar();
        atacante.defender();
        System.out.println(" ");

        MeioCampo meioCampo =  new MeioCampo();
        meioCampo.atacar();
        meioCampo.defender();
        System.out.println(" ");

        Goleiro goleiro = new Goleiro();
        goleiro.atacar();
        goleiro.defender();
    }
}
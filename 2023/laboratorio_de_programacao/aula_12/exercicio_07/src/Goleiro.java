public class Goleiro extends Jogador{
    @Override
    public void atacar() {
        System.out.println("Goleiro atacando o time adversário");
    }
    @Override
    public void defender() {
        System.out.println("Goleiro defendendo o seu time");
    }
}

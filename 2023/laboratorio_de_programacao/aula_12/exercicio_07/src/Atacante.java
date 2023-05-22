public class Atacante extends Jogador{
    @Override
    public void atacar() {
        System.out.println("Atacante atacando o time adversário");
    }

    @Override
    public void defender() {
        System.out.println("Atacante defendendo o seu time");
    }
}

public class Atleta implements IAndador, ICorredor{
    @Override
    public void andar() {
        System.out.println("Andando como atleta...");
    }
    @Override
    public void corre() {
        System.out.println("Correndo como atleta...");
    }
}

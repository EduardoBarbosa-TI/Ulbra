public class Cachorro extends Animal{
    @Override
    public void comer() {
        System.out.println("Cachorro Comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Cachorro dormindo...");
    }

    @Override
    public void mover() {
        System.out.println("Cachorro se movendo...");
    }
}

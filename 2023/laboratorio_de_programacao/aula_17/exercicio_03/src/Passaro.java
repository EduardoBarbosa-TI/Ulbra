public class Passaro implements IVoador {
    @Override
    public void decolar() {
        System.out.println("Decolando como passáro...");
    }
    @Override
    public void voar() {
        System.out.println("Voando como passáro...");
    }
    @Override
    public void aterrar() {
        System.out.println("Aterrizando como passáro...");
    }
}

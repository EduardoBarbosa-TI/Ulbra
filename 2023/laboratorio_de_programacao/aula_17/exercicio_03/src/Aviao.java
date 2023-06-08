public class Aviao implements IVoador {
    @Override
    public void decolar() {
        System.out.println("Decolando como avião...");
    }
    @Override
    public void voar() {
        System.out.println("Voando como avião");
    }
    @Override
    public void aterrar() {
        System.out.println("Aterrizando como avião");
    }
}

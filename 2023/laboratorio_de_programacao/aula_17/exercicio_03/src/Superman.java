public class Superman implements IVoador {
    @Override
    public void decolar() {
        System.out.println("Decolando como superman...");
    }
    @Override
    public void voar() {
        System.out.println("Voando como superman...");
    }
    @Override
    public void aterrar() {
        System.out.println("Aterrrizando como superman...");
    }
}

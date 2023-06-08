public class Piano implements IMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando o piano...");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando o piano...");
    }
    @Override
    public void parar() {
        System.out.println("Parando o piano...");
    }
}

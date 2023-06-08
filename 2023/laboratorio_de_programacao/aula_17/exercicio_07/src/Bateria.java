public class Bateria implements IMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando a bateria...");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando a bateria...");
    }
    @Override
    public void parar() {
        System.out.println("Parando a bateria...");
    }
}

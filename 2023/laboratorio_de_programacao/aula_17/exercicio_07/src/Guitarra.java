public class Guitarra implements IMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando a guitarra...");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando a guitarra...");
    }
    @Override
    public void parar() {
        System.out.println("Parando a guitarra...");
    }
}

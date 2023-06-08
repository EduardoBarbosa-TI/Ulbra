public class Bateria implements ICarregavel,IDescarregavel{
    @Override
    public void cargaCarregavel() {
        System.out.println("Bateria carregada...");
    }

    @Override
    public void cargaDescarregavel() {
        System.out.println("Bateria descarregada...");
    }
}

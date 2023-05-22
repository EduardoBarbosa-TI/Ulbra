public class Caminhao extends Transporte{
    @Override
    public void carregar() {
        System.out.println("Caminhão carregado!");
    }

    @Override
    public void descarregar() {
        System.out.println("Caminhão descarregado!");
    }
}

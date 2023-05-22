public class Trem extends Transporte {
    @Override
    public void carregar() {
        System.out.println("Trem carregado!");
    }
    @Override
    public void descarregar() {
        System.out.println("Trem descarregado!");
    }
}

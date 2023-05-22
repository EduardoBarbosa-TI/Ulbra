public class ArquivoTexto extends Arquivo{
    @Override
    public void abrir() {
        System.out.println("Arquivo de texto aberto...");
    }
    @Override
    public void fechar() {
        System.out.println("Arquivo de texto fechado...");
    }
}

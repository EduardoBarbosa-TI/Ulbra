public class ArquivoImagem extends Arquivo {
    @Override
    public void abrir() {
        System.out.println("Arquivo de imagem aberto...");
    }

    @Override
    public void fechar() {
        System.out.println("Arquivo de imagem fechado...");
    }
}

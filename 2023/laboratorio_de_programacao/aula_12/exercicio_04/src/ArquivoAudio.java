public class ArquivoAudio extends Arquivo{
    @Override
    public void abrir() {
        System.out.println("Arquivo de audio aberto...");
    }

    @Override
    public void fechar() {
        System.out.println("Arquivo de audio fechado...");
    }
}

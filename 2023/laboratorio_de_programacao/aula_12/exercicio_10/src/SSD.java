public class SSD extends DispositivoArmazenamento{
    @Override
    public void lerDados() {
        System.out.println("Dados lidos com SSD");
    }

    @Override
    public void gravarDados() {
        System.out.println("Dados gravados no SSD");
    }
}

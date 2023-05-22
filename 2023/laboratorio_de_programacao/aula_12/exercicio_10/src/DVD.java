public class DVD extends DispositivoArmazenamento{
    @Override
    public void lerDados() {
        System.out.println("Dados lidos com DVD");
    }

    @Override
    public void gravarDados() {
        System.out.println("Dados gravados no DVD");
    }
}

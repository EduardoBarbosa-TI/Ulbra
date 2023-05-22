public class HD extends DispositivoArmazenamento{
    @Override
    public void lerDados() {
        System.out.println("Dados lidos com o HD");
    }

    @Override
    public void gravarDados() {
        System.out.println("Dados gravados no HD");
    }
}

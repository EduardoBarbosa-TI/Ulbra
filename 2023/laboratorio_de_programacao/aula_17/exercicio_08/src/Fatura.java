public class Fatura implements IPagavel{
    @Override
    public void pagar() {
        System.out.println("Fatura paga...");
    }
    @Override
    public void verificarPagamento() {
        System.out.println("Pagamento da fatura verificado...");
    }
}

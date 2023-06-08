public class Cheque implements IPagavel{
    @Override
    public void pagar() {
        System.out.println("Cheque pago...");
    }
    @Override
    public void verificarPagamento() {
        System.out.println("Pagamento de cheque verificado...");
    }
}

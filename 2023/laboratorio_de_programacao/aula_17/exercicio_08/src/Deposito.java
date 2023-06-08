public class Deposito implements IPagavel{
    @Override
    public void pagar() {
        System.out.println("Deposito pago...");
    }
    @Override
    public void verificarPagamento() {
        System.out.println("Pagamento do deposito verificado...");
    }
}



public class Dinheiro extends Pagamento{
    private double valor;


    @Override
    public void realizarPagamento(double valor) {
        this.valor =valor;
        System.out.println("Pagamento de R$" + valor + " realizado com dinheiro ");
    }

    @Override
    public void emitirRecibo() {
        System.out.println("**Mercado Dois Irmãos**");
        super.dataAtual();
        System.out.println("Valor da compra: R$" + valor);
        System.out.println("Forma de pagamento: Dinheiro");
    }
}

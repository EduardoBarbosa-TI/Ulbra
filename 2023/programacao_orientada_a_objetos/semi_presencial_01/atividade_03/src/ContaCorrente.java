public class ContaCorrente extends Conta implements IJurosDeTransferencia {
    private double taxaTransferencia = 6.00;
    private double taxaSaque = 3.00;
    private double taxaDeposito = 2.50;
    @Override
    public void depositar(double valor) {
        super.depositar(valor - taxaDeposito);
    }
    @Override
    public void sacar(double valor) {
        super.sacar(valor + taxaSaque);
    }
    public void transferencia(double valor,Conta conta) {
        super.sacar(valor + taxaSaque);
        conta.depositar(valor);
    }
}

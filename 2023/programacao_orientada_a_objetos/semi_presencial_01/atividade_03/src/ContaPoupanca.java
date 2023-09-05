public class ContaPoupanca extends Conta implements IJurosDeTransferencia {
    private double taxaSaque = 4.0;
    private double taxaTransferencia = 4.0;
    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }
    @Override
    public void sacar(double valor) {
        super.sacar(valor + taxaSaque);
    }
    public void transferencia(double valor, Conta contaDestino) {
        super.sacar(valor + taxaTransferencia);
        contaDestino.depositar(valor);
    }
}


public class ContaSalario extends Conta{
    private double taxaSaque = 4.0;
    private double taxaDeposito = 3.2;
    @Override
    public void depositar(double valor) {
        super.depositar(valor - taxaDeposito);
    }
    @Override
    public void sacar(double valor) {
        super.sacar(valor  + taxaSaque);
    }
}

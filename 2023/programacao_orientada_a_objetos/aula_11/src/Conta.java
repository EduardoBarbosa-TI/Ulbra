public class Conta {
    private int numeroDaconta;
    private int saldo;
    public void setNumeroDaconta(int agencia) {
        this.numeroDaconta = agencia;
    }
    public int getNumeroDaconta() {
        return numeroDaconta;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void consultarSaldo(){
        System.out.println("Saldo da conta: R$" + this.saldo);
    }
}

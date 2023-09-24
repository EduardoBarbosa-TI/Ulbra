import java.util.Date;

public class Conta {
    private int numeroDaConta;
    private double saldo;
    private Cliente cliente;
    public Conta(Cliente cliente){
        this.cliente = cliente;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void deposita(double valor){
        this.saldo += valor;
    }
    public void transfere(Conta conta,Double valor){
        this.saldo -= valor;
        conta.deposita(valor);
    }
    public double consultaSaldo(){
        return this.saldo;
    }
}

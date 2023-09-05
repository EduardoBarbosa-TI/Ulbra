import java.text.DecimalFormat;
abstract class Conta {
    private double saldo;
    public void depositar(double valor){
        if(valor > 0) this.saldo += valor;
        else System.out.println("Não é permitido valores negativos");
    };
    public void sacar(double valor){
        if(valor < saldo) this.saldo -= valor;
        else System.out.println("Saldo insuficiente para saque");
    };
    public String extrato(){
        DecimalFormat formatted = new DecimalFormat("#,###.00");
        return "R$" + formatted.format(this.saldo);
    };
}

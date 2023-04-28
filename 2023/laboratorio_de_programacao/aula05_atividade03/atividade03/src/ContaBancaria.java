public class ContaBancaria {
    String numeroConta;
    double saldo;
    Pessoa titular;

    public void depositar(double valor){
        this.saldo = valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public double getSaldo(){
       return this.saldo;
    }



}

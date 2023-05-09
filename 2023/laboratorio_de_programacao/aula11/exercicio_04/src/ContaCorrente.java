public class ContaCorrente extends Conta {
    int limite;

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public void exibirDados(){
        System.out.println("Dados da conta *" + numero + "*: ");
        System.out.println("Limite disponível: " + limite);
        System.out.println("Saldo disponível: " + saldo);
    }
}

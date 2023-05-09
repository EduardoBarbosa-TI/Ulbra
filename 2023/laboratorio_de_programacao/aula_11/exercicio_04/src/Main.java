public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumero(12234);
        contaCorrente.setSaldo(2000);
        contaCorrente.setLimite(5000);

        contaCorrente.exibirDados();
    }
}
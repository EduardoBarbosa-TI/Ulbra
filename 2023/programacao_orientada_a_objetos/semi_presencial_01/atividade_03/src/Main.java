public class Main {
    public static void main(String[] args) {
        ContaCorrente contaDoRicardo = new ContaCorrente();
        contaDoRicardo.depositar(5000);
        contaDoRicardo.sacar(200);
        System.out.println("Conta do Ricardo " + contaDoRicardo.extrato());

        ContaSalario contaDoJose = new ContaSalario();
        contaDoJose.depositar(5000);
        contaDoJose.sacar(200);
        System.out.println("Conta do José " + contaDoJose.extrato());

        contaDoRicardo.transferencia(200,contaDoJose);

        System.out.println("Conta do Ricardo " + contaDoRicardo.extrato());
        System.out.println("Conta do José " + contaDoJose.extrato());

    }
}
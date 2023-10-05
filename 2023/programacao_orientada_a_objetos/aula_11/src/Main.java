public class Main {
    public static void main(String[] args) {
        Conta contaDoJose = new Conta();
        contaDoJose.setNumeroDaconta(124234);
        contaDoJose.depositar(500.00);
        contaDoJose.consultarSaldo();

        Banco banco = new Banco("Safari");
        banco.criarConta(contaDoJose);
        banco.listarContas();
    }
}
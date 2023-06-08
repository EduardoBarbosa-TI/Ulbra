public class Main {
    public static void main(String[] args) {

        Cheque cheque = new Cheque();
        cheque.pagar();
        cheque.verificarPagamento();

        System.out.println(" ");

        Fatura fatura = new Fatura();
        fatura.pagar();
        fatura.verificarPagamento();

        System.out.println(" ");

        Deposito deposito = new Deposito();
        deposito.pagar();
        deposito.verificarPagamento();
    }
}
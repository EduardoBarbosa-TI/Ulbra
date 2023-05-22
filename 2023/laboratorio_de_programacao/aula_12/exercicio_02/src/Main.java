public class Main {
    public static void main(String[] args) {

        CartaoCredito cartaoCredito = new CartaoCredito();
        cartaoCredito.realizarPagamento(300);
        System.out.println(" ");
        cartaoCredito.emitirRecibo();
        System.out.println(" ");
        CartaoDebito cartaoDebito = new CartaoDebito();
        cartaoDebito.realizarPagamento(500);
        System.out.println(" ");
        cartaoDebito.emitirRecibo();
        System.out.println(" ");
        Dinheiro dinheiro =  new Dinheiro();
        dinheiro.realizarPagamento(200);
        System.out.println(" ");
        dinheiro.emitirRecibo();
    }
}
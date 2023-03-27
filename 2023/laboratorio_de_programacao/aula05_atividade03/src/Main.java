public class Main {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria();
        conta01.depositar(200);
        conta01.sacar(100);
        System.out.println(conta01.getSaldo());
    }
}
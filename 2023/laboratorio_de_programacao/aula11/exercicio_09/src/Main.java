public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Eduardo");
        cliente.setEndereco("Rua Jaguatirica,864");
        cliente.setNumCartao(1353646723);

        cliente.exibirDados();
    }
}
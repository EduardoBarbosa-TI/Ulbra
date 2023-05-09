public class Main {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setCargo("Desenvolvedor");
        funcionario01.setNome("Eduardo");
        funcionario01.setIdade(22);

        funcionario01.exibirDados();
    }
}
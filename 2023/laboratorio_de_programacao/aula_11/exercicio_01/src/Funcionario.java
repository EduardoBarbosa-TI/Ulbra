public class Funcionario extends Pessoa {
    String cargo;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void exibirDados(){
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Idade funcionário: " + idade);
        System.out.println("Cargo atual: " + cargo);
    }
}

public class Vendedor extends Funcionario {
    @Override
    public void calcularSalario() {
        System.out.println("Salário do vendedor calculado com sucesso!");
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Tarefa realizada pelo vendedor!");
    }
}

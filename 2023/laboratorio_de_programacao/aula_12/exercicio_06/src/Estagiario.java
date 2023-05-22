public class Estagiario extends Funcionario{
    @Override
    public void calcularSalario() {
        System.out.println("Salário do estagiário calculado com sucesso!");
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Tarefa realizada pelo estagiário!");
    }
}

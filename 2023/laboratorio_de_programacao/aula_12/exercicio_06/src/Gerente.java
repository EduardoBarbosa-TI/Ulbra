public class Gerente extends Funcionario{
    @Override
    public void calcularSalario() {
        System.out.println("Salário do gerente calculado com sucesso!");
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Tarefa realizada pelo gerente!");
    }
}

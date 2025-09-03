import java.util.Scanner;

class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Salário: R$ " + salario;
    }
}
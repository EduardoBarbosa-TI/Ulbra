import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Atividade 01
        int[] numeros = {5, 8, 7, 33, 1, 0, 22};

        String[] nomes = {"Morango", "Abacaxi", "Maçã", "Banana"};

        //OrdenacaoFuncionarios.bubbleSort(numeros);
        //System.out.println(Arrays.toString(numeros));

        Ordenacao.bubbleSortTexto(nomes);
        System.out.println(Arrays.toString(nomes));

        String nome = "Azul";
        String nome2 = "Amarelo";

        System.out.println(nome.compareTo(nome2));


        if (nome.compareTo(nome2) > 0){
            System.out.println("A é menor");
        }


        //------------------------------------------//
        //Atividade 02


        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[5];

        // Cadastro de 5 funcionários
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            String nomeFuncionario = sc.nextLine();
            System.out.print("Digite o salário de " + nomeFuncionario + ": ");
            double salario = sc.nextDouble();
            sc.nextLine(); // limpar buffer
            funcionarios[i] = new Funcionario(nomeFuncionario, salario);
        }

        System.out.println("\n--- Ordem Crescente de Salário ---");
        OrdenacaoFuncionarios.bubbleSortSalarioCrescente(funcionarios);
        OrdenacaoFuncionarios.imprimir(funcionarios);

        System.out.println("\n--- Ordem Decrescente de Salário ---");
        OrdenacaoFuncionarios.bubbleSortSalarioDecrescente(funcionarios);
        OrdenacaoFuncionarios.imprimir(funcionarios);

        System.out.println("\n--- Ordem Alfabética (Nome) ---");
        OrdenacaoFuncionarios.bubbleSortNome(funcionarios);
        OrdenacaoFuncionarios.imprimir(funcionarios);

        sc.close();
    }
}
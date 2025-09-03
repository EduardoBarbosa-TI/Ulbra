public class OrdenacaoFuncionarios {
    public static void bubbleSortSalarioCrescente(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (funcionarios[j].salario > funcionarios[j + 1].salario) {
                    Funcionario temp = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortSalarioDecrescente(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (funcionarios[j].salario < funcionarios[j + 1].salario) {
                    Funcionario temp = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortNome(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (funcionarios[j].nome.compareToIgnoreCase(funcionarios[j + 1].nome) > 0) {
                    Funcionario temp = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimir(Funcionario[] funcionarios) {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = null;
        boolean executando = true;

        while (executando) {
            System.out.println("\n===== MENU MATRIZ =====");
            System.out.println("1 - Criar matriz");
            System.out.println("2 - Preencher manualmente");
            System.out.println("3 - Preencher automaticamente");
            System.out.println("4 - Exibir matriz");
            System.out.println("5 - Remover elemento");
            System.out.println("6 - Ordenar matriz");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número de linhas: ");
                    int linhas = scanner.nextInt();
                    System.out.print("Digite o número de colunas: ");
                    int colunas = scanner.nextInt();
                    matriz = new Matriz(linhas, colunas);
                    System.out.println("Matriz criada com sucesso!");
                    break;

                case 2:
                    if (matriz != null) {
                        matriz.preencherManual();
                    } else {
                        System.out.println("Crie a matriz primeiro!");
                    }
                    break;

                case 3:
                    if (matriz != null) {
                        System.out.print("Digite o valor mínimo: ");
                        int min = scanner.nextInt();
                        System.out.print("Digite o valor máximo: ");
                        int max = scanner.nextInt();
                        matriz.preencherAutomatico(min, max);
                        System.out.println("Matriz preenchida automaticamente!");
                    } else {
                        System.out.println("Crie a matriz primeiro!");
                    }
                    break;

                case 4:
                    if (matriz != null) {
                        matriz.exibirMatriz();
                    } else {
                        System.out.println("Crie a matriz primeiro!");
                    }
                    break;

                case 5:
                    if (matriz != null) {
                        System.out.print("Digite a linha do elemento a remover: ");
                        int l = scanner.nextInt();
                        System.out.print("Digite a coluna do elemento a remover: ");
                        int c = scanner.nextInt();
                        matriz.removerElemento(l, c);
                        System.out.println("Elemento removido!");
                    } else {
                        System.out.println("Crie a matriz primeiro!");
                    }
                    break;

                case 6:
                    if (matriz != null) {
                        System.out.println("Escolha algoritmo: 1 - Bubble Sort | 2 - Quick Sort");
                        int alg = scanner.nextInt();
                        boolean usarQuick = (alg == 2);

                        System.out.println("Ordenar: 1 - Por linhas | 2 - Por colunas | 3 - Matriz completa");
                        int tipo = scanner.nextInt();

                        switch (tipo) {
                            case 1:
                                matriz.ordenarPorLinhas(usarQuick);
                                System.out.println("Matriz ordenada por linhas!");
                                break;
                            case 2:
                                matriz.ordenarPorColunas(usarQuick);
                                System.out.println("Matriz ordenada por colunas!");
                                break;
                            case 3:
                                matriz.ordenarMatrizCompleta(usarQuick);
                                System.out.println("Matriz ordenada como vetor completo!");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } else {
                        System.out.println("Crie a matriz primeiro!");
                    }
                    break;

                case 7:
                    executando = false;
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}

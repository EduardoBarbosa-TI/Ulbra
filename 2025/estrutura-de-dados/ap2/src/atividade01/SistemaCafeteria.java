package atividade01;

import java.util.Scanner;

public class SistemaCafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaPedidos fila = new FilaPedidos();
        PilhaCancelados pilha = new PilhaCancelados();
        int idCounter = 1;

        while (true) {
            System.out.println("\n=== SISTEMA DE PEDIDOS DA CAFETERIA ===");
            System.out.println("1. Adicionar novo pedido");
            System.out.println("2. Atender pedido");
            System.out.println("3. Cancelar pedido");
            System.out.println("4. Restaurar pedido cancelado");
            System.out.println("5. Imprimir pedidos pendentes");
            System.out.println("6. Imprimir pedidos cancelados");
            System.out.println("7. Sair");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // limpa buffer

            switch (opcao) {
                case 1:
                    System.out.print("Descrição do pedido: ");
                    String desc = sc.nextLine();
                    fila.enqueue(new Pedido(idCounter++, desc));
                    System.out.println("Pedido adicionado!");
                    break;
                case 2:
                    Pedido atendido = fila.dequeue();
                    if (atendido == null) System.out.println("Nenhum pedido pendente.");
                    else System.out.println("Pedido atendido: " + atendido);
                    break;
                case 3:
                    Pedido cancelado = fila.dequeue();
                    if (cancelado == null) System.out.println("Nenhum pedido para cancelar.");
                    else {
                        pilha.push(cancelado);
                        System.out.println("Pedido cancelado: " + cancelado);
                    }
                    break;
                case 4:
                    Pedido restaurado = pilha.pop();
                    if (restaurado == null) System.out.println("Nenhum pedido para restaurar.");
                    else {
                        fila.enqueue(restaurado);
                        System.out.println("Pedido restaurado: " + restaurado);
                    }
                    break;
                case 5:
                    fila.printQueue();
                    break;
                case 6:
                    pilha.printStack();
                    break;
                case 7:
                    System.out.println("Encerrando sistema...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

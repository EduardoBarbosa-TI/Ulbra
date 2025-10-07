package filaatendimento;

public class MainFilaBanco {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.enfileirar(new Cliente("Ana", 5));
        fila.enfileirar(new Cliente("Pedro", 3));
        fila.enfileirar(new Cliente("João", 8));

        int totalTempo = 0, totalClientes = 0;
        while (!fila.estaVazia()) {
            Cliente atendido = fila.desenfileirar();
            System.out.println("Atendendo: " + atendido);
            totalTempo += atendido.getTempoAtendimento();
            totalClientes++;
        }

        System.out.println("\nTotal de clientes atendidos: " + totalClientes);
        System.out.println("Tempo total gasto: " + totalTempo + " minutos");
    }
}


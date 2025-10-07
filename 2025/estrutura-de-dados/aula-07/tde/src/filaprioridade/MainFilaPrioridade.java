package filaprioridade;

public class MainFilaPrioridade {
    public static void main(String[] args) {
        FilaPrioridade fila = new FilaPrioridade(10);
        fila.enfileirar(new ElementoPrioridade("Emergência", 5));
        fila.enfileirar(new ElementoPrioridade("Consulta normal", 2));
        fila.enfileirar(new ElementoPrioridade("Atendimento urgente", 4));
        fila.enfileirar(new ElementoPrioridade("Check-up", 1));

        System.out.println("Atendimentos por prioridade:");
        while (!fila.estaVazia()) System.out.println("Atendendo: " + fila.desenfileirar());
    }
}

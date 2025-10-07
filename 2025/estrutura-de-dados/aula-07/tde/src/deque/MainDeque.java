package deque;

public class MainDeque {
    public static void main(String[] args) {
        Deque deque = new Deque(5);
        deque.inserirNoFim(10); deque.inserirNoFim(20); deque.inserirNoInicio(5); deque.inserirNoInicio(1);

        System.out.println("Início: " + deque.consultarInicio());
        System.out.println("Fim: " + deque.consultarFim());

        deque.removerDoInicio(); deque.removerDoFim();
        System.out.println("Novo início: " + deque.consultarInicio());
        System.out.println("Novo fim: " + deque.consultarFim());
    }
}

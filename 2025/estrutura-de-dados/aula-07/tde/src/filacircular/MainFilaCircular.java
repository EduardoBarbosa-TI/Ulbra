package filacircular;

public class MainFilaCircular {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular(5);
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        System.out.println("Espiando: " + fila.espiar());
        System.out.println("Desenfileirando: " + fila.desenfileirar());

        fila.enfileirar(40);
        fila.enfileirar(50);
        fila.enfileirar(60);

        while (!fila.estaVazia()) System.out.println("Saindo: " + fila.desenfileirar());
    }
}

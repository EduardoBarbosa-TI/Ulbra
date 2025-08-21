//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Testando Vetor
        Vetor vetor = new Vetor(3);
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D"); // aumenta capacidade
        vetor.alterar(2, "X");
        vetor.remover("B");

        System.out.println("Vetor: " + vetor);
        System.out.println("Contém A? " + vetor.contem("A"));
        System.out.println("Tamanho: " + vetor.tamanho());

        // Testando Matriz
        Matriz matriz = new Matriz(2, 3);
        matriz.inserir(5);
        matriz.inserir(7);
        matriz.inserir(2);
        matriz.inserir(7);
        matriz.inserir(9);
        matriz.inserir(1);

        System.out.println("\nMatriz:\n" + matriz);
        System.out.println("Maior elemento: " + matriz.maiorElemento());
        System.out.println("Menor elemento: " + matriz.menorElemento());
        System.out.println("Média: " + matriz.media());
        System.out.println("Soma total: " + matriz.somaTotal());
        System.out.println("Ocorrências de 7: " + matriz.contarOcorrencias(7));
    }
}
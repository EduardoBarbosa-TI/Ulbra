package filaimpressao;

public class MainFilaImpressao {
    public static void main(String[] args) {
        FilaImpressao fila = new FilaImpressao(5);
        fila.enfileirar(new Documento("TrabalhoJava", 10));
        fila.enfileirar(new Documento("Contrato", 5));
        fila.enfileirar(new Documento("RelatórioFinanceiro", 20));

        int totalPaginas = 0;
        Documento maior = null;
        int cont = 0;

        while (!fila.estaVazia()) {
            Documento doc = fila.desenfileirar();
            System.out.println("Imprimindo: " + doc);
            totalPaginas += doc.getPaginas();

            if (maior == null || doc.getPaginas() > maior.getPaginas()) maior = doc;
            cont++;
            if (cont % 2 == 0 && !fila.estaVazia()) System.out.println("Próximo documento: " + fila.proximo());
        }

        System.out.println("\nDocumento com mais páginas: " + maior);
        System.out.println("Total de páginas impressas: " + totalPaginas);
    }
}

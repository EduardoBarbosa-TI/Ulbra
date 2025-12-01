public class Tabuleiro {
    private NoCasa inicio;

    public void adicionarCasa(Casa casa) {
        NoCasa novo = new NoCasa(casa);

        if (inicio == null) {
            inicio = novo;
            novo.proximo = inicio;
        } else {
            NoCasa aux = inicio;
            while (aux.proximo != inicio) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
            novo.proximo = inicio;
        }
    }

    public NoCasa getInicio() {
        return inicio;
    }
}

public class ListaEncadeada<T> {
    private No<T> inicio;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public void adicionarNoInicio(T valor) {
        No<T> novo = new No<>(valor);
        novo.proximo = inicio;
        inicio = novo;
        tamanho++;
    }

    public void adicionarNoFim(T valor) {
        No<T> novo = new No<>(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    public void adicionarNaPosicao(int posicao, T valor) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        if (posicao == 0) {
            adicionarNoInicio(valor);
            return;
        }
        No<T> novo = new No<>(valor);
        No<T> atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }
        novo.proximo = atual.proximo;
        atual.proximo = novo;
        tamanho++;
    }

    public T removerDoInicio() {
        if (inicio == null) throw new RuntimeException("Lista vazia.");
        T valor = inicio.dado;
        inicio = inicio.proximo;
        tamanho--;
        return valor;
    }

    public T removerDoFim() {
        if (inicio == null) throw new RuntimeException("Lista vazia.");
        if (inicio.proximo == null) {
            T valor = inicio.dado;
            inicio = null;
            tamanho--;
            return valor;
        }
        No<T> atual = inicio;
        No<T> anterior = null;
        while (atual.proximo != null) {
            anterior = atual;
            atual = atual.proximo;
        }
        anterior.proximo = null;
        tamanho--;
        return atual.dado;
    }

    public T removerDaPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        if (posicao == 0) {
            return removerDoInicio();
        }
        No<T> atual = inicio;
        No<T> anterior = null;
        for (int i = 0; i < posicao; i++) {
            anterior = atual;
            atual = atual.proximo;
        }
        anterior.proximo = atual.proximo;
        tamanho--;
        return atual.dado;
    }

    public T removerPorValor(T elemento) {
        if (inicio == null) return null;

        if (inicio.dado.equals(elemento)) {
            T valor = inicio.dado;
            inicio = inicio.proximo;
            tamanho--;
            return valor;
        }

        No<T> atual = inicio;
        No<T> anterior = null;
        while (atual != null && !atual.dado.equals(elemento)) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null) return null; // Não encontrou

        anterior.proximo = atual.proximo;
        tamanho--;
        return atual.dado;
    }

    public T buscar(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        No<T> atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.dado;
    }

    public int buscarPosicao(T valor) {
        No<T> atual = inicio;
        int index = 0;
        while (atual != null) {
            if (atual.dado.equals(valor)) return index;
            atual = atual.proximo;
            index++;
        }
        return -1;
    }

    public void atualizar(int posicao, T novoValor) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        No<T> atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        atual.dado = novoValor;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void limpar() {
        inicio = null;
        tamanho = 0;
    }

    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}

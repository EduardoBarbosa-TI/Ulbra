public class ListaLigada<T> {
    private No<T> inicio;
    private int tamanho;

    public ListaLigada(){
        this.inicio = null;
        this.tamanho = 0;
    }

    public void inserirNoFim(T elemento){
        No<T> novoNo = new No<>(elemento);
        if (inicio == null){
            inicio = novoNo;
        }else{
            No<T> atual = inicio;
            while (atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
        tamanho ++;
    }

    public void exibir(){
        if(inicio == null){
            System.out.println("Lista Vazia");
        }else{
            No<T> atual = inicio;
            while(atual != null){
                System.out.println(atual.dado);
                atual = atual.proximo;
            }
        }
    }

    public void removerPorValor(T elemento){
        if (inicio == null){
            System.out.println("Lista Vazia.");
            return;
        }
        if (inicio.dado == elemento){
            inicio = inicio.proximo;
            tamanho--;
            return;
        }
        No<T> atual = inicio;
        No<T> anterior = null;

        while(atual != null && atual.dado != elemento){
            anterior = atual;
            atual = atual.proximo;
        }
        if(atual == null){
            System.out.println("Elemento não encontrado.");
            return;
        }
        anterior.proximo = atual.proximo;
        tamanho--;
    }
}
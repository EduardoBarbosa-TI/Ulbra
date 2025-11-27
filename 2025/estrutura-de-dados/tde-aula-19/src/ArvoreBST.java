public class ArvoreBST {

    private No raiz;

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }
        if (valor < atual.valor) {
            atual.esquerda = inserirRec(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRec(atual.direita, valor);
        }
        return atual;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(No atual, int valor) {
        if (atual == null) {
            return false;
        }
        if (valor == atual.valor) {
            return true;
        }
        if (valor < atual.valor) {
            return buscarRec(atual.esquerda, valor);
        }
        return buscarRec(atual.direita, valor);
    }

    public void remover(int valor) {
        raiz = removerRec(raiz, valor);
    }

    private No removerRec(No atual, int valor) {
        if (atual == null) return null;

        if (valor < atual.valor) {
            atual.esquerda = removerRec(atual.esquerda, valor);
        }
        else if (valor > atual.valor) {
            atual.direita = removerRec(atual.direita, valor);
        }
        else {
            // Nó sem filhos
            if (atual.esquerda == null && atual.direita == null) {
                return null;
            }
            // Nó com um único filho
            else if (atual.esquerda == null) {
                return atual.direita;
            }
            else if (atual.direita == null) {
                return atual.esquerda;
            }
            // Nó com dois filhos
            No sucessor = encontrarMin(atual.direita);
            atual.valor = sucessor.valor;
            atual.direita = removerRec(atual.direita, sucessor.valor);
        }

        return atual;
    }

    private No encontrarMin(No no) {
        while (no.esquerda != null) {
            no = no.esquerda;
        }
        return no;
    }

    public void imprimirEmOrdem() {
        imprimirEmOrdemRec(raiz);
        System.out.println();
    }

    private void imprimirEmOrdemRec(No atual) {
        if (atual != null) {
            imprimirEmOrdemRec(atual.esquerda);
            System.out.print(atual.valor + " ");
            imprimirEmOrdemRec(atual.direita);
        }
    }

    public void imprimirPreOrdem() {
        imprimirPreOrdemRec(raiz);
        System.out.println();
    }

    private void imprimirPreOrdemRec(No atual) {
        if (atual != null) {
            System.out.print(atual.valor + " ");
            imprimirPreOrdemRec(atual.esquerda);
            imprimirPreOrdemRec(atual.direita);
        }
    }

    public void imprimirPosOrdem() {
        imprimirPosOrdemRec(raiz);
        System.out.println();
    }

    private void imprimirPosOrdemRec(No atual) {
        if (atual != null) {
            imprimirPosOrdemRec(atual.esquerda);
            imprimirPosOrdemRec(atual.direita);
            System.out.print(atual.valor + " ");
        }
    }

    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(No atual) {
        if (atual == null) return -1;
        return 1 + Math.max(alturaRec(atual.esquerda), alturaRec(atual.direita));
    }

    public int contarNos() {
        return contarNosRec(raiz);
    }

    private int contarNosRec(No atual) {
        if (atual == null) return 0;
        return 1 + contarNosRec(atual.esquerda) + contarNosRec(atual.direita);
    }

    public int contarFolhas() {
        return contarFolhasRec(raiz);
    }

    private int contarFolhasRec(No atual) {
        if (atual == null) return 0;
        if (atual.esquerda == null && atual.direita == null) return 1;
        return contarFolhasRec(atual.esquerda) + contarFolhasRec(atual.direita);
    }

    public int profundidadeNo(int valor) {
        return profundidadeRec(raiz, valor, 0);
    }

    private int profundidadeRec(No atual, int valor, int profundidade) {
        if (atual == null) return -1;
        if (atual.valor == valor) return profundidade;

        return valor < atual.valor ?
                profundidadeRec(atual.esquerda, valor, profundidade + 1) :
                profundidadeRec(atual.direita, valor, profundidade + 1);
    }
}

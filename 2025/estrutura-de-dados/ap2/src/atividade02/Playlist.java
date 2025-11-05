package atividade02;

public class Playlist {
    private NoDuplo inicio;
    private NoDuplo fim;
    private NoDuplo atual;

    public void adicionarNoFim(Musica musica) {
        NoDuplo novo = new NoDuplo(musica);
        if (inicio == null) {
            inicio = fim = atual = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void listarMusicas() {
        if (inicio == null) {
            System.out.println("Playlist vazia!");
            return;
        }
        NoDuplo aux = inicio;
        while (aux != null) {
            System.out.println(aux.musica);
            aux = aux.proximo;
        }
    }

    public void tocarMusicaAtual() {
        if (atual == null) {
            System.out.println("Nenhuma música selecionada.");
            return;
        }
        System.out.println("🎵 Tocando agora: " + atual.musica);
    }

    public void proxima() {
        if (atual != null && atual.proximo != null) {
            atual = atual.proximo;
            tocarMusicaAtual();
        } else {
            System.out.println("Você chegou ao fim da playlist!");
        }
    }

    public void anterior() {
        if (atual != null && atual.anterior != null) {
            atual = atual.anterior;
            tocarMusicaAtual();
        } else {
            System.out.println("Você está no início da playlist!");
        }
    }
}

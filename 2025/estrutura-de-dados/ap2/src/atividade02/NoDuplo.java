package atividade02;

public class NoDuplo {
    Musica musica;
    NoDuplo anterior;
    NoDuplo proximo;

    public NoDuplo(Musica musica) {
        this.musica = musica;
        this.anterior = null;
        this.proximo = null;
    }
}


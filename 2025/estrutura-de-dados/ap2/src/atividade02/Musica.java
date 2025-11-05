package atividade02;

public class Musica {
    String titulo;
    String artista;
    String album;
    int duracao; // em segundos

    public Musica(String titulo, String artista, String album, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return String.format("%s - %s (%s) [%ds]", titulo, artista, album, duracao);
    }
}


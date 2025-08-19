public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Disponibilidade: " + (disponibilidade ? "Disponível" : "Reservado"));
        System.out.println();
    }

    public void reservar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Livro \"" + titulo + "\" reservado com sucesso.");
        } else {
            System.out.println("Livro \"" + titulo + "\" já está reservado.");
        }
    }

    public void devolver() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("Livro \"" + titulo + "\" devolvido com sucesso.");
        } else {
            System.out.println("Livro \"" + titulo + "\" já estava disponível.");
        }
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + numeroPaginas + " páginas) " +
                (disponibilidade ? "[Disponível]" : "[Reservado]");
    }
}

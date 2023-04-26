public class Livro {
    String titulo;
    String autor;
    double preco;
    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = 60.00;
    }
}

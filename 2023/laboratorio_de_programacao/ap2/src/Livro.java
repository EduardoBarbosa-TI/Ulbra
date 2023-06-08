public class Livro extends Produto {
    String autor;
    String dataPublicacao;
    String status;
    int codLivro;


    public void setTitulo(String titulo, int codLivro) {
        this.codLivro = codLivro;
        super.setTitulo(titulo);
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAutor() {
        return autor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String detalhesProduto() {
        String detalhes =
                super.detalhesProduto()  +
                        "\nCódigo: " + codLivro +
                "\nAutor: " + autor +
                        "\nData da publicação: " + dataPublicacao +
                        "\nDisponibilidade: " + status;
        return detalhes;
    }
}

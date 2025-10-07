package filaimpressao;

public class Documento {
    private String nome;
    private int paginas;

    public Documento(String nome, int paginas) { this.nome = nome; this.paginas = paginas; }
    public String getNome() { return nome; }
    public int getPaginas() { return paginas; }
    @Override public String toString() { return nome + " (" + paginas + " páginas)"; }
}

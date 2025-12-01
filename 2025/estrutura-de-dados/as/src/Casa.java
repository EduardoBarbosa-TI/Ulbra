public class Casa {
    protected String nome;
    protected TipoCasa tipo;

    public Casa(String nome, TipoCasa tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public TipoCasa getTipo() {
        return tipo;
    }
}

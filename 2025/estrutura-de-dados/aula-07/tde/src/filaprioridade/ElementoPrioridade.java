package filaprioridade;

public class ElementoPrioridade {
    private String nome; private int prioridade;
    public ElementoPrioridade(String nome, int prioridade) { this.nome = nome; this.prioridade = prioridade; }
    public String getNome() { return nome; }
    public int getPrioridade() { return prioridade; }
    @Override public String toString() { return nome + " (Prioridade " + prioridade + ")"; }
}

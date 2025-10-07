package filaatendimento;

public class Cliente {
    private String nome;
    private int tempoAtendimento;

    public Cliente(String nome, int tempoAtendimento) {
        this.nome = nome;
        this.tempoAtendimento = tempoAtendimento;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoAtendimento() {
        return tempoAtendimento;
    }

    @Override
    public String toString() {
        return nome + " - " + tempoAtendimento + " min";
    }
}

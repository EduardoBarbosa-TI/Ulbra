import java.util.ArrayList;

public class Jogador {
    private String nome;
    private double saldo;
    private NoCasa posicao;
    private ArrayList<Imovel> propriedades;

    public Jogador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.propriedades = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public NoCasa getPosicao() { return posicao; }
    public void setPosicao(NoCasa posicao) { this.posicao = posicao; }
    public ArrayList<Imovel> getPropriedades() { return propriedades; }

    public double patrimonioTotal() {
        double total = saldo;
        for (Imovel i : propriedades)
            total += i.getPreco();
        return total;
    }
}

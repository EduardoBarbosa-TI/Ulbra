public class Imovel extends Casa {
    private double preco;
    private double aluguel;
    private Jogador dono;

    public Imovel(String nome, double preco, double aluguel) {
        super(nome, TipoCasa.IMOVEL);
        this.preco = preco;
        this.aluguel = aluguel;
        this.dono = null;
    }

    public double getPreco() {
        return preco;
    }

    public double getAluguel() {
        return aluguel;
    }

    public Jogador getDono() {
        return dono;
    }

    public void setDono(Jogador dono) {
        this.dono = dono;
    }
}

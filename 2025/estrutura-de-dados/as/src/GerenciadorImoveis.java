import java.util.ArrayList;

public class GerenciadorImoveis {
    private ArrayList<Imovel> imoveis = new ArrayList<>();

    public void cadastrar(String nome, double preco, double aluguel) {
        if (imoveis.size() < 40)
            imoveis.add(new Imovel(nome, preco, aluguel));
    }

    public ArrayList<Imovel> listar() {
        return imoveis;
    }

    public int total() {
        return imoveis.size();
    }
}

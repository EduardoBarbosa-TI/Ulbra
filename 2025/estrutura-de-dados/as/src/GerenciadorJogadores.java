import java.util.ArrayList;

public class GerenciadorJogadores {
    private ArrayList<Jogador> jogadores = new ArrayList<>();

    public void cadastrar(String nome) {
        if (jogadores.size() < 6)
            jogadores.add(new Jogador(nome, Configuracao.saldoInicial));
    }

    public ArrayList<Jogador> listar() {
        return jogadores;
    }

    public void remover(int index) {
        jogadores.remove(index);
    }
}

import java.util.*;

public class Jogo {
    private Scanner sc = new Scanner(System.in);
    private GerenciadorJogadores gj = new GerenciadorJogadores();
    private GerenciadorImoveis gi = new GerenciadorImoveis();
    private Tabuleiro tabuleiro = new Tabuleiro();

    public void menuPrincipal() {
        int op;
        do {
            System.out.println("1-Gerenciar Jogadores");
            System.out.println("2-Gerenciar Imóveis");
            System.out.println("3-Configurações");
            System.out.println("4-Iniciar Jogo");
            System.out.println("0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1 -> menuJogadores();
                case 2 -> menuImoveis();
                case 3 -> menuConfiguracoes();
                case 4 -> iniciarJogo();
            }
        } while (op != 0);
    }

    private void iniciarJogo() {
        if (gj.listar().size() < 2 || gi.total() < 10) {
            System.out.println("ERRO: Mínimo de 2 jogadores e 10 imóveis!");
            return;
        }

        montarTabuleiro();
        for (Jogador j : gj.listar())
            j.setPosicao(tabuleiro.getInicio());

        jogar();
    }

    private void montarTabuleiro() {
        tabuleiro.adicionarCasa(new Casa("Início", TipoCasa.INICIO));
        for (Imovel i : gi.listar())
            tabuleiro.adicionarCasa(i);
        tabuleiro.adicionarCasa(new Casa("Imposto", TipoCasa.IMPOSTO));
        tabuleiro.adicionarCasa(new Casa("Restituição", TipoCasa.RESTITUICAO));
    }

    private void jogar() {
        Random r = new Random();

        for (int rodada = 1; rodada <= Configuracao.maxRodadas; rodada++) {
            for (Jogador j : gj.listar()) {

                int d1 = r.nextInt(6) + 1;
                int d2 = r.nextInt(6) + 1;
                int passos = d1 + d2;

                for (int i = 0; i < passos; i++) {
                    j.setPosicao(j.getPosicao().proximo);

                    if (j.getPosicao().casa.getTipo() == TipoCasa.INICIO) {
                        j.setSaldo(j.getSaldo() + Configuracao.salario);
                        System.out.println(j.getNome() + " recebeu salário!");
                    }
                }

                tratarCasa(j);
            }
        }

        mostrarVencedor();
    }

    private void tratarCasa(Jogador j) {
        Casa c = j.getPosicao().casa;

        if (c.getTipo() == TipoCasa.IMOVEL) {
            Imovel i = (Imovel) c;

            if (i.getDono() == null && j.getSaldo() >= i.getPreco()) {
                j.setSaldo(j.getSaldo() - i.getPreco());
                i.setDono(j);
                j.getPropriedades().add(i);
                System.out.println(j.getNome() + " comprou " + i.getNome());
            } else if (i.getDono() != null && i.getDono() != j) {
                j.setSaldo(j.getSaldo() - i.getAluguel());
                i.getDono().setSaldo(i.getDono().getSaldo() + i.getAluguel());
            }
        }

        if (c.getTipo() == TipoCasa.IMPOSTO) {
            double imposto = j.patrimonioTotal() * 0.05;
            j.setSaldo(j.getSaldo() - imposto);
        }

        if (c.getTipo() == TipoCasa.RESTITUICAO) {
            j.setSaldo(j.getSaldo() + Configuracao.salario * 0.10);
        }
    }

    private void mostrarVencedor() {
        Jogador vencedor = gj.listar().get(0);
        for (Jogador j : gj.listar())
            if (j.patrimonioTotal() > vencedor.patrimonioTotal())
                vencedor = j;

        System.out.println("VENCEDOR: " + vencedor.getNome());
    }

    private void menuJogadores() {
        int op;
        do {
            System.out.println("\n--- MENU DE JOGADORES ---");
            System.out.println("1 - Cadastrar Jogador");
            System.out.println("2 - Listar Jogadores");
            System.out.println("3 - Remover Jogador");
            System.out.println("0 - Voltar");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Nome do jogador: ");
                    String nome = sc.nextLine();
                    gj.cadastrar(nome);
                    System.out.println("Jogador cadastrado!");
                }

                case 2 -> {
                    System.out.println("\n--- JOGADORES ---");
                    int i = 1;
                    for (Jogador j : gj.listar()) {
                        System.out.println(i++ + " - " + j.getNome());
                    }
                }

                case 3 -> {
                    System.out.print("Informe o índice do jogador: ");
                    int idx = sc.nextInt() - 1;
                    gj.remover(idx);
                    System.out.println("Jogador removido!");
                }
            }

        } while (op != 0);
    }

    private void menuImoveis() {
        int op;
        do {
            System.out.println("\n--- MENU DE IMÓVEIS ---");
            System.out.println("1 - Cadastrar Imóvel");
            System.out.println("2 - Listar Imóveis");
            System.out.println("0 - Voltar");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    System.out.print("Aluguel: ");
                    double aluguel = sc.nextDouble();

                    gi.cadastrar(nome, preco, aluguel);
                    System.out.println("Imóvel cadastrado!");
                }

                case 2 -> {
                    System.out.println("\n--- IMÓVEIS CADASTRADOS ---");
                    int i = 1;
                    for (Imovel im : gi.listar()) {
                        System.out.println(i++ + " - " + im.getNome()
                                + " | Preço: R$ " + im.getPreco()
                                + " | Aluguel: R$ " + im.getAluguel());
                    }
                }
            }

        } while (op != 0);
    }

    private void menuConfiguracoes() {
        int op;
        do {
            System.out.println("\n--- CONFIGURAÇÕES ---");
            System.out.println("1 - Definir Saldo Inicial (Atual: " + Configuracao.saldoInicial + ")");
            System.out.println("2 - Definir Salário (Atual: " + Configuracao.salario + ")");
            System.out.println("3 - Definir Máx. Rodadas (Atual: " + Configuracao.maxRodadas + ")");
            System.out.println("0 - Voltar");

            op = sc.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.print("Novo saldo inicial: ");
                    Configuracao.saldoInicial = sc.nextDouble();
                }

                case 2 -> {
                    System.out.print("Novo salário por volta: ");
                    Configuracao.salario = sc.nextDouble();
                }

                case 3 -> {
                    System.out.print("Novo número máximo de rodadas: ");
                    Configuracao.maxRodadas = sc.nextInt();
                }
            }

        } while (op != 0);
    }

}

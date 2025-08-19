public class Livraria {
    private Livro[] livros;
    private int totalLivros;

    public Livraria(int capacidade) {
        livros = new Livro[capacidade];
        totalLivros = 0;
    }

    public void inserirLivro(Livro livro) {
        if (totalLivros < livros.length) {
            livros[totalLivros] = livro;
            totalLivros++;
            System.out.println("Livro \"" + livro.getTitulo() + "\" adicionado à livraria.");
        } else {
            System.out.println("Não é possível adicionar mais livros. Capacidade cheia!");
        }
    }

    public void listarLivros() {
        if (totalLivros == 0) {
            System.out.println("Nenhum livro cadastrado na livraria.");
        } else {
            System.out.println("Lista de livros cadastrados:");
            for (int i = 0; i < totalLivros; i++) {
                livros[i].exibirDetalhes();
            }
        }
    }

    public void listarDisponiveis() {
        boolean encontrou = false;
        System.out.println("Livros disponíveis para empréstimo:");
        for (int i = 0; i < totalLivros; i++) {
            if (livros[i].isDisponivel()) {
                livros[i].exibirDetalhes();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum livro disponível no momento.");
        }
    }
}

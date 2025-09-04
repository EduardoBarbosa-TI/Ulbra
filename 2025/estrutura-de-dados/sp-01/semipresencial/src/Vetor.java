public class Vetor {
    private Aluno[] alunos;
    private int tamanho;

    // Construtor
    public Vetor() {
        this.alunos = new Aluno[10];
        this.tamanho = 0;
    }

    // Aumentar capacidade (duplica sempre que cheio)
    private void aumentarCapacidade() {
        Aluno[] novoArray = new Aluno[alunos.length * 2];
        for (int i = 0; i < alunos.length; i++) {
            novoArray[i] = alunos[i];
        }
        alunos = novoArray;
    }

    // Inserir aluno no final
    public void inserir(Aluno aluno) {
        if (tamanho == alunos.length) {
            aumentarCapacidade();
        }
        alunos[tamanho] = aluno;
        tamanho++;
    }

    // Listar todos os alunos
    public void listar() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(alunos[i]);
        }
    }

    // Exibir maior nota
    public void maiorNota() {
        if (tamanho == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        Aluno maior = alunos[0];
        for (int i = 1; i < tamanho; i++) {
            if (alunos[i].getNota() > maior.getNota()) {
                maior = alunos[i];
            }
        }
        System.out.println("Maior nota: " + maior);
    }

    // Exibir menor nota
    public void menorNota() {
        if (tamanho == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        Aluno menor = alunos[0];
        for (int i = 1; i < tamanho; i++) {
            if (alunos[i].getNota() < menor.getNota()) {
                menor = alunos[i];
            }
        }
        System.out.println("Menor nota: " + menor);
    }

    // Calcular média da turma
    public void calcularMedia() {
        if (tamanho == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += alunos[i].getNota();
        }
        double media = soma / tamanho;
        System.out.println("Média da turma: " + media);
    }

    // Pesquisar aluno por nome
    public boolean pesquisar(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (alunos[i].getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    // Excluir aluno por nome
    public void excluir(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (alunos[i].getNome().equalsIgnoreCase(nome)) {
                // mover todos para a esquerda
                for (int j = i; j < tamanho - 1; j++) {
                    alunos[j] = alunos[j + 1];
                }
                alunos[tamanho - 1] = null;
                tamanho--;
                System.out.println("Aluno removido: " + nome);
                return;
            }
        }
        System.out.println("Aluno não encontrado: " + nome);
    }

    // Exibir quantidade de alunos
    public int quantidade() {
        return tamanho;
    }
}

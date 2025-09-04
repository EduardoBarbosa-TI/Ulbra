public class Main {
    public static void main(String[] args) {
        Vetor turma = new Vetor();

        turma.inserir(new Aluno("Eduardo", 8.5));
        turma.inserir(new Aluno("Maria", 6.7));
        turma.inserir(new Aluno("João", 9.3));

        System.out.println("Lista de alunos:");
        turma.listar();
        System.out.println("\n");
        turma.maiorNota();
        turma.menorNota();
        turma.calcularMedia();

        System.out.println("\nPesquisar 'João': " + turma.pesquisar("João"));
        System.out.println("Pesquisar 'Eduardo': " + turma.pesquisar("Eduardo") + "\n");

        turma.excluir("João");
        System.out.println("\n");
        turma.listar();

        System.out.println("Quantidade de alunos: " + turma.quantidade());

    }
}
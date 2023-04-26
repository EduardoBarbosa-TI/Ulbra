public class Estudante {
    String nome;
    int matricula;
    String curso;

    public Estudante(String nome, String curso, int matricula){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }
    public Estudante(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = "Análise e Desenvolvimento de sistemas";
    }
}

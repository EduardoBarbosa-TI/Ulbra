public class Turma {
    Aluno aluno01;
    Aluno aluno02;

    Aluno aluno03;
    public Turma(){
        this.aluno01 = new Aluno();
        this.aluno02 = new Aluno();
        this.aluno03 = new Aluno();
    }

    public double calcular_Media_turma(){
       double media = this.aluno01.calcular_media_aluno() +
        this.aluno02.calcular_media_aluno() +
        this.aluno03.calcular_media_aluno();

       return media;
    }

}

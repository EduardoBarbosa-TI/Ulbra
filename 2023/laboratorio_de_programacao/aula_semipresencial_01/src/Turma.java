public class Turma {
    Aluno aluno01;
    Aluno aluno02;
    Aluno aluno03;

    double media_aluno_01;
    double media_aluno_02;
    double media_aluno_03;
    public Turma(){
        this.aluno01 = new Aluno();
        this.media_aluno_01 = this.aluno01.calcular_media_aluno();
        this.aluno02 = new Aluno();
        this.media_aluno_02 = this.aluno02.calcular_media_aluno();
        this.aluno03 = new Aluno();
        this.media_aluno_03 = this.aluno03.calcular_media_aluno();
    }

    public double calcular_media_turma(){
       double media = this.media_aluno_01 + this.media_aluno_02 + this.media_aluno_03;
       return media;
    }

}

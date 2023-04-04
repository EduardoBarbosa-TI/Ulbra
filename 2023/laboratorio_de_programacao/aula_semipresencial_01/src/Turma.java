public class Turma {
    Aluno aluno01;
    Aluno aluno02;
    Aluno aluno03;

    public Turma(Aluno aluno01, Aluno aluno02, Aluno aluno03){
        this.aluno01 = aluno01;
        this.aluno02 = aluno02;
        this.aluno03 = aluno03;
    }



    public double calcularMedia(){
        double media = (this.aluno01.calcularMedia() + this.aluno02.calcularMedia() + this.aluno03.calcularMedia() ) / 3;
        return media;
    }

}

public class Aluno {
    Prova prova01;
    Prova prova02;

    public Aluno(Prova prova01,Prova prova02){
        this.prova01 = prova01;
        this.prova02 = prova02;
    }


    public double calcularMedia(){
        double mediaAluno = (this.prova01.calcularNotaTotal() + this.prova02.calcularNotaTotal()) / 2 ;

        return mediaAluno;
    }

}

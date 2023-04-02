public class Aluno {
    Prova prova01;
    Prova prova02;

    double media_prova_01;
    double media_prova_02;

    public Aluno(){
        this.prova01 = new Prova(4.5,5.7);
        this.media_prova_01 = prova01.calcularNotaTotal();
        this.prova02 = new Prova(3.6,7.8);
        this.media_prova_02 = prova02.calcularNotaTotal();
    }

    public double calcular_media_aluno(){
        double media_aluno = this.media_prova_01 + this.media_prova_02;
        media_aluno = media_aluno/2;

        return media_aluno;
    }

}

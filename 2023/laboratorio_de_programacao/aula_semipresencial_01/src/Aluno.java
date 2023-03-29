public class Aluno {
    Prova prova01;
    Prova prova02;

    public Aluno(){
        this.prova01 = new Prova(6.5,4.5);
        this.prova02 = new Prova(8.5,4.5);
    }

    public double calcular_media_aluno(5.5){
        double media = this.prova01.calcularNotaTotal();
        media = media/2;
        return media;
    }

}

public class Prova {
    double nota01;
    double nota02;


    public Prova(double nota01, double nota02){
        this.nota01 = nota01;
        this.nota02 = nota02;
    };
    public double calcularNotaTotal(){
        double notaTotal = this.nota01 + this.nota02;
        return notaTotal;
    }

}

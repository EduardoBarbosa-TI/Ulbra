public class Prova {
    double notaParte01;
    double notaParte02;

    public Prova(double notaParte01, double notaParte02){
        this.notaParte01 = notaParte01;
        this.notaParte02 = notaParte02;
    }



    public double calcularNotaTotal(){
        double notaTotal = this.notaParte01 + this.notaParte02;
        if(notaTotal > 10){
            notaTotal = 10;
        }
        return notaTotal;
    }

}

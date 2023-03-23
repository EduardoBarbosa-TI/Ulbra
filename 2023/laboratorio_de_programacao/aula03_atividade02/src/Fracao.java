public class Fracao {
    int numerador;
    int denominador;

    public Fracao(int numerador,int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fracao multiplicacao_fracoes(Fracao fracao){
        int novoNumerador = this.numerador * fracao.numerador;
        int novoDenominador = this.denominador * fracao.denominador;
        return new Fracao(novoNumerador,novoDenominador);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }

}

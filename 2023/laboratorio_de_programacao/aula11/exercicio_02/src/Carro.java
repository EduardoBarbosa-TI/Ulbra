public class Carro extends Veiculo {
    int numPassageiros;

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void exibirDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Quantidade de passageiros: " + numPassageiros);
    }
}

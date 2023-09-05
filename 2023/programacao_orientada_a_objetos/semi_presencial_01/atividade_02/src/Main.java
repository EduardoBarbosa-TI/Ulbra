public class Main {
    public static void main(String[] args) {
        Veiculo carro01 = new Veiculo("Fiat","Uno",1995);
        Veiculo carro02 = new Veiculo("Fiat","Toro",2023);
        Veiculo moto = new Veiculo("Honda","Falcon",2003);

        carro01.ligar();
        carro01.desligar();
        carro01.dadosVeiculo();

        carro02.ligar();
        carro02.desligar();
        carro02.dadosVeiculo();

        moto.ligar();
        moto.desligar();
        moto.dadosVeiculo();
    }
}
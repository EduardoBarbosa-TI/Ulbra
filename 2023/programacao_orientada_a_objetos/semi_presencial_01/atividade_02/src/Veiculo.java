public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo,int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar(){
        System.out.println("Veículo "+ this.marca +"-"+ this.modelo +"/"+ this.ano +" ligado!");
    }

    public void desligar(){
        System.out.println("Veículo "+ this.marca +"-"+ this.modelo +"/"+ this.ano +" desligado!");
    }

    public void dadosVeiculo(){
        System.out.println("Dados do veículo:");
        System.out.println("Veículo "+ this.marca +"-"+ this.modelo +"/"+ this.ano);
        System.out.println(" ");
    }

}

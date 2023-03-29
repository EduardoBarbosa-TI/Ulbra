public class Main {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.setMarca("Fiat");
        carro01.setModelo("Uno mile");
        carro01.setAno(2001);

        System.out.println(carro01.getMarca());
        System.out.println(carro01.getModelo());
        System.out.println(carro01.getAno());
    }
}
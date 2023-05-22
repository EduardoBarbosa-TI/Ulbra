public class Main {
    public static void main(String[] args) {
        HD hd = new HD();
        hd.lerDados();
        hd.gravarDados();
        System.out.println(" ");

        SSD ssd = new SSD();
        ssd.lerDados();
        ssd.gravarDados();
        System.out.println(" ");

        DVD dvd = new DVD();
        dvd.lerDados();
        dvd.gravarDados();
    }
}
public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.acertarRelogio(3,25,50);

        System.out.println("A hora atual é " + relogio.lerHora() + ":" + relogio.lerMinuto() + ":" + relogio.lerSegundo()  );
        
    }
}
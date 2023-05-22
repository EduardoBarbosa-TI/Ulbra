public class Main {
    public static void main(String[] args) {
        Gerente gerente  = new Gerente();
        gerente.calcularSalario();
        gerente.realizarTarefa();

        System.out.println(" ");

        Vendedor vendedor = new Vendedor();
        vendedor.calcularSalario();
        vendedor.realizarTarefa();

        System.out.println(" ");

        Estagiario estagiario =  new Estagiario();
        estagiario.calcularSalario();
        estagiario.realizarTarefa();
    }
}
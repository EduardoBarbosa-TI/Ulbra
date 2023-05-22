public class Main {
    public static void main(String[] args) {
        ImpressoraLaser impressoraLaser =  new ImpressoraLaser();
        impressoraLaser.imprimir();
        impressoraLaser.escanear();
        System.out.println(" ");

        ImpressoraJatoTinta impressoraJatoTinta =  new ImpressoraJatoTinta();
        impressoraJatoTinta.imprimir();
        impressoraJatoTinta.escanear();
        System.out.println(" ");

        ImpressoraMatricial impressoraMatricial = new ImpressoraMatricial();
        impressoraMatricial.imprimir();
        impressoraMatricial.escanear();
    }
}
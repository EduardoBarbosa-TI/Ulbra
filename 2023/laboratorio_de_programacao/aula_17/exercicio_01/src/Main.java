import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Documento doc = new Documento();
        Foto foto = new Foto();

        doc.imprimir();
        foto.imprimir();
    }
}
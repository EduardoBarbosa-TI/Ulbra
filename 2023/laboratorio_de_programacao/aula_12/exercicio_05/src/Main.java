public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Código Limpo",60);
        livro.calcularPreco(10);
        livro.exibirDetalhes();

        System.out.println(" ");

        Roupa roupa =  new Roupa("Casaco",100);
        roupa.calcularPreco(2);
        roupa.exibirDetalhes();

        System.out.println();

        Eletronico eletronico = new Eletronico("Teclado", 360);
        eletronico.calcularPreco(1);
        eletronico.exibirDetalhes();
    }
}
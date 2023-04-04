public class Main {
    public static void main(String[] args) {
        Produto produto01 = new Produto();
        produto01.setNome("Detergente");
        produto01.setPreco(10.50);
        produto01.setQuantidade(3);

        Produto produto02 = new Produto();
        produto02.setNome("Qiboa");
        produto02.setPreco(15.30);
        produto02.setQuantidade(5);

        Loja loja =  new Loja();
        loja.adicionarProduto(produto01);
        loja.adicionarProduto(produto02);

        loja.listarProdutos();
        System.out.println(" ");
        loja.removerProduto(produto02);
        loja.adicionarEstoque(produto01,10);

        loja.listarProdutos();
        System.out.println(" ");
        loja.venderProduto(produto01,2);

        loja.listarProdutos();
        System.out.println(" ");
        loja.adicionarEstoque(produto01,10);
        loja.listarProdutos();




    }
}
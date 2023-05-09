public class Main {
    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel =  new ProdutoPerecivel();
        produtoPerecivel.setCodigo(24545);
        produtoPerecivel.setPreco(40.99);
        produtoPerecivel.setDataValidade("2023/05/20");

        produtoPerecivel.exibirDados();
    }
}
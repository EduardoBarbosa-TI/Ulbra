public class Eletronico extends Produto {
    private double preco;
    String nome;
    private double precoTotal;
    int qtdProdutos;

    public Eletronico(String nome,double preco){
        this.preco = preco;
        this.nome = nome;
    }
    @Override
    public void calcularPreco(int qtdProduto) {
        this.qtdProdutos = qtdProduto;

        if(qtdProduto > 1){
            for(int i = 0; i <= qtdProduto; i++){
                precoTotal = preco * qtdProduto - (0.1 * qtdProduto * preco);
            }
            System.out.println("Preço total sem desconto: R$" + preco);
            System.out.println(" ");
        }else{
            System.out.println("Levando dois produtos você ganha desconto!!!");
            System.out.println(" ");
        }
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do produto " + nome + ":");
        System.out.println("Preço unitário: " + preco);
        System.out.println("Quantidade: " + qtdProdutos);
        double totalProdutos = (qtdProdutos > 1) ? precoTotal : preco;
        System.out.println("Preço total dos produtos: R$" + totalProdutos);
    }
}

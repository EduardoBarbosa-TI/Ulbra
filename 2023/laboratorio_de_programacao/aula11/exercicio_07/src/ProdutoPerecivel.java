public class ProdutoPerecivel extends Produto{
    String dataValidade;

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    public String getDataValidade() {
        return dataValidade;
    }


    public void exibirDados(){
        System.out.println("Dados do produto: " + codigo);
        System.out.println("Preço: R$" + preco);
        System.out.println("Data de vaidade: " + dataValidade);
    }
}

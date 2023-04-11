public class Loja {
    Produto produto01;
    Produto produto02;
    Produto produto03;
    public void adicionarProduto(Produto produto){
        if(this.produto01 == null){
            this.produto01 = produto;
        }else if(this.produto02 == null){
            this.produto02 = produto;
        }else if(this.produto03 == null){
            this.produto03 = produto;
        }else {
            System.out.println("Capacidade de cadastro de produtos esgotada, exclua um produto !!");
        }
    }
    public void removerProduto(Produto produto){
        if(this.produto01 != null && produto == this.produto01){
            this.produto01 =  null;
        } else if(this.produto02 != null && produto == this.produto02){
            this.produto02 =  null;
        } else if(this.produto03 != null && produto == this.produto03){
            this.produto03 =  null;
        }else {
            System.out.println("Produto não foi encontrado !!");
        }
    }
    public void listarProdutos(){
        System.out.println("Produtos disponíveis na loja:");
        if (this.produto01 != null) {
            imprimirProduto(this.produto01);
        }
        if (this.produto02 != null) {
            imprimirProduto(this.produto02);
        }
        if (this.produto03 != null) {
            imprimirProduto(this.produto03);
        }
    }
    private void imprimirProduto(Produto produto){
        System.out.println("Nome: " + produto.getNome() + "  Preço: R$" + produto.getPreco() + "  Quantidade em estoque: " + produto.getQuantidade());
    }
    public void venderProduto(Produto produto, int quantidade){
        if(this.produto01 != null && this.produto01 == produto){
            if(this.produto01.getQuantidade() >= quantidade){
                this.produto01.setQuantidade(this.produto01.getQuantidade() - quantidade);
            }else{
                System.out.println("Produto com falta no estoque !!");
                System.out.println("Quantidade em estoque: " + this.produto01.getQuantidade());
            }
        } else if(this.produto02 != null && this.produto02 == produto){
            if(this.produto02.getQuantidade() >= quantidade){
                this.produto02.setQuantidade(this.produto02.getQuantidade() - quantidade);
            }else{
                System.out.println("Produto com falta no estoque !!");
                System.out.println("Quantidade em estoque: " + this.produto02.getQuantidade());
            }
        } else if(this.produto03 != null && this.produto03 == produto){
            if(this.produto03.getQuantidade() >= quantidade){
                this.produto03.setQuantidade(this.produto03.getQuantidade() - quantidade);
            }else{
                System.out.println("Produto com falta no estoque !!");
                System.out.println("Quantidade em estoque: " + this.produto03.getQuantidade());
            }
        }else{
            System.out.println("Produto não encontrado !!");
        }
    }
    public void adicionarEstoque(Produto produto, int quantidade){
        if(produto == this.produto01){
            this.produto01.setQuantidade(this.produto01.getQuantidade() + quantidade);
        }else if(produto == this.produto02){
            this.produto02.setQuantidade(this.produto01.getQuantidade() + quantidade);
        }else if(produto == this.produto03){
            this.produto03.setQuantidade(this.produto03.getQuantidade() + quantidade);
        }else {
            System.out.println("Produto não encontrado");
        }
    }
}

public class Loja {
    Produto produto01;
    Produto produto02;
    Produto produto03;
    public void adicionarProduto(Produto produto){
        if(produto01 == null){
            produto01 = produto;
        }else if(produto02 == null){
            produto02 = produto;
        }else if(produto03 == null){
            produto03 = produto;
        }
    }
    public void removerProduto(Produto produto){
        if(produto01 != null && produto == produto01){
            produto01 =  null;
        } else if(produto02 != null && produto == produto02){
            produto02 =  null;
        } else if(produto03 != null && produto == produto03){
            produto03 =  null;
        }
    }
    public void listarProdutos(){
        System.out.println("Produtos disponíveis na loja:");
        if (produto01 != null) {
            System.out.println("Nome: " + produto01.getNome() + "  Preço: R$" + produto01.getPreco() + "  Quantidade em estoque: " + produto01.getQuantidade());
        }
        if (produto02 != null) {
            System.out.println("Nome: " + produto02.getNome() + " - Preço: R$" + produto02.getPreco() + " - Quantidade em estoque: " + produto02.getQuantidade());
        }
        if (produto03 != null) {
            System.out.println("Nome: " + produto03.getNome() + " - Preço: R$" + produto03.getPreco() + " - Quantidade em estoque: " + produto03.getQuantidade());
        }
    }
    public void venderProduto(Produto produto, int quantidade){
        if(produto01 != null){
            if(produto01.getQuantidade() >= quantidade){
                produto01.setQuantidade(produto01.getQuantidade() - quantidade);
            }else{
                System.out.println("Produto com falta no estoque !!");
                System.out.println("Quantidade em estoque: " + produto01.getQuantidade());
            }
        } else if(produto02 != null){
            if(produto02.getQuantidade() >= quantidade){
                produto02.setQuantidade(produto02.getQuantidade() - quantidade);
            }else{
                System.out.println("Produto com falta no estoque !!");
                System.out.println("Quantidade em estoque: " + produto02.getQuantidade());
            }
        } else if(produto03 != null){
            if(produto03.getQuantidade() >= quantidade){
                produto03.setQuantidade(produto03.getQuantidade() - quantidade);
            }else{
                System.out.println("Produto com falta no estoque !!");
                System.out.println("Quantidade em estoque: " + produto03.getQuantidade());
            }
        }
    }
    public void adicionarEstoque(Produto produto, int quantidade){
        if(produto == produto01){
            produto01.setQuantidade(produto01.getQuantidade() + quantidade);
        }else if(produto == produto02){
            produto02.setQuantidade(produto01.getQuantidade() + quantidade);
        }else if(produto == produto03){
            produto03.setQuantidade(produto03.getQuantidade() + quantidade);
        }
    }
}

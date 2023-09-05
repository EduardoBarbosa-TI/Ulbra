public class Main {
    public static void main(String[] args) {

        Product product01 = new Product("Detergente","Produto diferenciado", 8.48);
        Product product02 = new Product("Qiboa","Produto de outro nível", 12.49);
        Product product03 = new Product("Vassoura","Suporta vôo de até 3m de altura", 18.48);
        Product product04 = new Product("Esponja","Produto jamais visto", 5.00);

        shoppingCart shoppingCart01 = new shoppingCart();
        shoppingCart01.addProductInShoppingCart(product01);
        shoppingCart01.addProductInShoppingCart(product02);
        shoppingCart01.addProductInShoppingCart(product03);
        shoppingCart01.addProductInShoppingCart(product04);

        shoppingCart01.getListProducts();
        System.out.println("Preço total dos produtos: " + shoppingCart01.getTotalAmount());

    }
}
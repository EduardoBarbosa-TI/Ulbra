import java.util.ArrayList;

public class shoppingCart {
    private ArrayList<Product> listProducts =  new ArrayList();
    private double totalAmount;
    public void addProductInShoppingCart(Product product){
        this.listProducts.add(product);
        this.totalAmount += product.getPrice();
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void getListProducts() {
        System.out.println("Lista de produtos:");
        for (int i = 0; i < listProducts.size();i++){
            System.out.println("Nome do produto: " + listProducts.get(i).getName());
            System.out.println("Descrição do produto: " + listProducts.get(i).getDescription());
            System.out.println("Preço do produto: " + listProducts.get(i).getPrice());
            System.out.println(" ");
        }
    }
}

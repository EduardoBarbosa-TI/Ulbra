public class Product {
    private String name;
    private double price;
    private String description;

    public Product(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

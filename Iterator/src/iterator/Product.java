package iterator;

public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return quantity > 0;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}

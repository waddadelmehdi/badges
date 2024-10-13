public class Product {

    // Fields
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Calculate total value of the product (price * quantity)
    public double getTotalValue() {
        return this.price * this.quantity;
    }

    // Override toString method to display product information
    @Override
    public String toString() {
        return "Product[name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Create a product instance
        Product product = new Product("Laptop", 999.99, 5);

        // Display product details
        System.out.println(product.toString());

        // Calculate total value
        System.out.println("Total value: " + product.getTotalValue());
    }
}

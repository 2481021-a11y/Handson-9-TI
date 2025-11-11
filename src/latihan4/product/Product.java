package latihan4.product;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stock;

    public Product(String productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Abstract method - harus diimplementasikan oleh subclass
    public abstract void displayDetails();

    public abstract String getCategory();

    // Concrete methods
    public boolean isAvailable() {
        return stock > 0;
    }

    public void reduceStock(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
        }
    }

    // Getters
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
}
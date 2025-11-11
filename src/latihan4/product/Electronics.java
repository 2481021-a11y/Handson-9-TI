package latihan4.product;

public class Electronics extends Product {
    private String warranty;
    private int powerConsumption;

    public Electronics(String productId, String name, double price, int stock,
                       String warranty, int powerConsumption) {
        super(productId, name, price, stock);
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public void displayDetails() {
        System.out.println("ELECTRONICS PRODUCT");
        System.out.printf("│ ID: %-35s │%n", productId);
        System.out.printf("│ Name: %-33s │%n", name);
        System.out.printf("│ Price: Rp %-28.0f │%n", price);
        System.out.printf("│ Stock: %-32d │%n", stock);
        System.out.printf("│ Warranty: %-28s │%n", warranty);
        System.out.printf("│ Power: %-27dW │%n", powerConsumption);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
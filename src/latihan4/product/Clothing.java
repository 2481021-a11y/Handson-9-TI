package latihan4.product;

public class Clothing extends Product {
    private String size;
    private String material;
    private String color;

    public Clothing(String productId, String name, double price, int stock,
                    String size, String material, String color) {
        super(productId, name, price, stock);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    public void displayDetails() {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│ CLOTHING PRODUCT                        │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.printf("│ ID: %-35s │%n", productId);
        System.out.printf("│ Name: %-33s │%n", name);
        System.out.printf("│ Price: Rp %-28.0f │%n", price);
        System.out.printf("│ Stock: %-32d │%n", stock);
        System.out.printf("│ Size: %-33s │%n", size);
        System.out.printf("│ Material: %-29s │%n", material);
        System.out.printf("│ Color: %-32s │%n", color);
        System.out.println("└─────────────────────────────────────────┘");
    }

    @Override
    public String getCategory() {
        return "Clothing";
    }
}
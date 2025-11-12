package latihan4.shipping;

public class RegularShipping extends ShippingMethod {

    public RegularShipping() {
        this.shippingName = "Regular Shipping";
        this.estimatedDays = 7;
    }

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 5000; // Rp 5,000 per kg
    }

    @Override
    public void displayInfo() {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│ REGULAR SHIPPING                        │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.printf("│ Method: %-31s │%n", shippingName);
        System.out.printf("│ Estimated Delivery: %-16d days │%n", estimatedDays);
        System.out.println("│ Rate: Rp 5,000/kg                       │");
        System.out.println("└─────────────────────────────────────────┘");
    }
}
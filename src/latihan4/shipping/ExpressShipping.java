package latihan4.shipping;

public class ExpressShipping extends ShippingMethod {

    public ExpressShipping() {
        this.shippingName = "Express Shipping";
        this.estimatedDays = 3;
    }

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 15000; // Rp 15,000 per kg
    }

    @Override
    public void displayInfo() {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│ EXPRESS SHIPPING 🚀                     │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.printf("│ Method: %-31s │%n", shippingName);
        System.out.printf("│ Estimated Delivery: %-16d days │%n", estimatedDays);
        System.out.println("│ Rate: Rp 15,000/kg                      │");
        System.out.println("└─────────────────────────────────────────┘");
    }
}
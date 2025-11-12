package latihan4.shipping;

public class SameDayShipping extends ShippingMethod {

    public SameDayShipping() {
        this.shippingName = "Same Day Shipping";
        this.estimatedDays = 0; // Hari yang sama
    }

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 35000; // Rp 35,000 per kg (paling mahal karena paling cepat)
    }

    @Override
    public void displayInfo() {
        System.out.println("│ SAME DAY SHIPPING 🔥                    │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.printf("│ Method: %-31s │%n", shippingName);
        System.out.println("│ Estimated Delivery: Same Day            │");
        System.out.println("│ Rate: Rp 35,000/kg                      │");
        System.out.println("│ Order before 12:00 PM for same day      │");
        System.out.println("└─────────────────────────────────────────┘");
    }
}
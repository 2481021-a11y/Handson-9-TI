package latihan4.customer;

public class PremiumCustomer extends Customer {

    public PremiumCustomer(String customerId, String name, String email) {
        super(customerId, name, email);
    }

    @Override
    public double getDiscount() {
        return 0.10; // 10% discount
    }

    @Override
    public String getMembershipLevel() {
        return "PREMIUM";
    }

    @Override
    public void displayInfo() {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.println("│ PREMIUM CUSTOMER ⭐                     │");
        System.out.println("├─────────────────────────────────────────┤");
        System.out.printf("│ ID: %-35s │%n", customerId);
        System.out.printf("│ Name: %-33s │%n", name);
        System.out.printf("│ Email: %-32s │%n", email);
        System.out.printf("│ Membership: %-27s │%n", getMembershipLevel());
        System.out.printf("│ Discount: %-29.0f%% │%n", getDiscount() * 100);
        System.out.println("└─────────────────────────────────────────┘");
    }
}
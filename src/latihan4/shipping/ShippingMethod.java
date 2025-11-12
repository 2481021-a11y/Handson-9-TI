package latihan4.shipping;

public abstract class ShippingMethod {
    protected String shippingName;
    protected int estimatedDays;

    // Abstract methods
    public abstract double calculateShippingCost(double weight);
    public abstract void displayInfo();

    // Getters
    public String getShippingName() {
        return shippingName;
    }

    public int getEstimatedDays() {
        return estimatedDays;
    }
}
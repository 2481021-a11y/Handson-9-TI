package latihan4.customer;

public abstract class Customer {
    protected String customerId;
    protected String name;
    protected String email;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    // Abstract methods
    public abstract double getDiscount();
    public abstract String getMembershipLevel();
    public abstract void displayInfo();

    // Getters
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}
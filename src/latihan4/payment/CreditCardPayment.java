package latihan4.payment;

public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        super();
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.printf("Amount: Rp %.0f%n", amount);
        System.out.println("Validating card...");
        System.out.println("Payment authorized!");

        paymentStatus = true;
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}
package latihan4.payment;

import java.util.UUID;

public abstract class Payment {
    protected String transactionId;
    protected boolean paymentStatus;

    public Payment() {
        this.transactionId = generateTransactionId();
        this.paymentStatus = false;
    }

    // Abstract methods
    public abstract boolean processPayment(double amount);
    public abstract String getPaymentMethod();

    // Concrete methods
    protected String generateTransactionId() {
        return "TRX-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public boolean getPaymentStatus() {
        return paymentStatus;
    }
}
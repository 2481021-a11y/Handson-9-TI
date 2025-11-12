package latihan4.payment;

public class EWalletPayment extends Payment {
    private String walletId;
    private String walletProvider;

    public EWalletPayment(String walletId, String walletProvider) {
        super();
        this.walletId = walletId;
        this.walletProvider = walletProvider;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing E-Wallet Payment...");
        System.out.println("Provider: " + walletProvider);
        System.out.println("Wallet ID: " + walletId);
        System.out.printf("Amount: Rp %.0f%n", amount);
        System.out.println("Sending payment request...");
        System.out.println("Payment confirmed!");

        paymentStatus = true;
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "E-Wallet (" + walletProvider + ")";
    }
}
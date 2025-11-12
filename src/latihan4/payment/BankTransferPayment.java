package latihan4.payment;

public class BankTransferPayment extends Payment {
    private String bankName;
    private String accountNumber;
    private String accountHolder;

    public BankTransferPayment(String bankName, String accountNumber, String accountHolder) {
        super();
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing Bank Transfer Payment...");
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + maskAccountNumber(accountNumber));
        System.out.printf("Amount: Rp %.0f%n", amount);
        System.out.println("Generating virtual account...");
        System.out.println("Please complete the transfer within 24 hours.");
        System.out.println("Transfer instruction has been sent to your email.");

        paymentStatus = true;
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Bank Transfer (" + bankName + ")";
    }

    // Helper method untuk mask account number
    private String maskAccountNumber(String accNum) {
        if (accNum.length() <= 4) {
            return accNum;
        }
        int visibleDigits = 4;
        int maskedLength = accNum.length() - visibleDigits;
        String masked = "*".repeat(maskedLength);
        return masked + accNum.substring(maskedLength);
    }
}
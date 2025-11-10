package latihan2;

// Implementasikan class TransferBank implements Pembayaran
public class TransferBank implements Pembayaran {
    private String nomorRekening;

    public TransferBank(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    // Constructor dan implement methods
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Processing Bank Transfer payment: Rp " + jumlah);
        System.out.println("Payment successful via Bank Transfer");
    }

    @Override
    public String getMetodePembayaran() {
        return "Bank Transfer";
    }
}

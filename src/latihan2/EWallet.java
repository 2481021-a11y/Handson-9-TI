package latihan2;

// Implementasikan class EWallet implements Pembayaran
public class EWallet implements Pembayaran {
    private String nomorTelepon;

    public EWallet(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    // Constructor dan implement methods
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Processing E-Wallet payment: Rp " + jumlah);
        System.out.println("Payment successful via E-Wallet");
    }

    @Override
    public String getMetodePembayaran() {
        return "E-Wallet";
    }
}
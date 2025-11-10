package latihan2;

// Implementasikan class KartuKredit implements Pembayaran
public class KartuKredit implements Pembayaran {
    private String nomorKartu;

    // Constructor
    public KartuKredit(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    // Implementasi method dari interface
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Processing Credit Card payment: Rp " + jumlah);
        System.out.println("Payment successful via Credit Card");
    }

    @Override
    public String getMetodePembayaran() {
        return "Credit Card";
    }
}

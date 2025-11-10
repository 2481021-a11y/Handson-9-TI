package latihan2;

public class InterfacePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Interface
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * konsep interface dan multiple inheritance.
         */

        // ===== BASIC INTERFACE USAGE =====
        System.out.println("=== BASIC INTERFACE USAGE ===");

        // Latihan 1: Implementasi interface Terbang
        BurungTerbang elang = new BurungTerbang("Elang", 50);
        elang.lepasLandas();
        elang.terbang();
        elang.mendarat();

        // ===== MULTIPLE INHERITANCE DENGAN INTERFACE =====
        System.out.println("\n=== MULTIPLE INHERITANCE ===");

        // Latihan 2: Class yang implements multiple interface
        Bebek donald = new Bebek("Donald", 30);
        donald.lepasLandas();
        donald.terbang();
        donald.berenang();
        donald.menyelam();

        // ===== INTERFACE SEBAGAI TYPE =====
        System.out.println("\n=== INTERFACE SEBAGAI TYPE ===");

        // Latihan 3: Menggunakan interface sebagai tipe variable
        Terbang burung1 = new BurungTerbang("Elang", 50);
        burung1.terbang();

        Berenang ikan1 = new Ikan("Nemo");
        ikan1.berenang();

        // ===== REAL-WORLD EXAMPLE =====
        System.out.println("\n=== REAL-WORLD EXAMPLE ===");

        // Latihan 4: Sistem pembayaran dengan multiple payment methods
        PaymentProcessor processor = new PaymentProcessor();

        Pembayaran kartu = new KartuKredit("1234567890123456");
        processor.proses(kartu, 100000);

        Pembayaran ewallet = new EWallet("08123456789");
        processor.proses(ewallet, 50000);

        Pembayaran transfer = new TransferBank("9876543210");
        processor.proses(transfer, 200000);

        /*
         * EKSPEKTASI OUTPUT:
         *
         * === BASIC INTERFACE USAGE ===
         * Elang sedang lepas landas...
         * Elang terbang di udara dengan kecepatan 50 km/jam
         * Elang mendarat dengan mulus
         *
         * === MULTIPLE INHERITANCE ===
         * Donald sedang lepas landas...
         * Donald terbang di udara dengan kecepatan 30 km/jam
         * Donald sedang berenang di permukaan air
         * Donald menyelam dengan kedalaman 2 meter
         *
         * === INTERFACE SEBAGAI TYPE ===
         * Elang terbang di udara dengan kecepatan 50 km/jam
         * Nemo sedang berenang di permukaan air
         *
         * === REAL-WORLD EXAMPLE ===
         * Processing Credit Card payment: Rp 100000.0
         * Payment successful via Credit Card
         * Processing E-Wallet payment: Rp 50000.0
         * Payment successful via E-Wallet
         * Processing Bank Transfer payment: Rp 200000.0
         * Payment successful via Bank Transfer
         */
    }
}

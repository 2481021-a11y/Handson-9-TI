package latihan1;

public class IntroToAbstractionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Introduction to Abstraction
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * konsep abstraction dan abstract class.
         */

        // ===== TANPA ABSTRACTION: CARA BIASA =====
        System.out.println("=== TANPA ABSTRACTION ===");

        // Latihan 1: Buat beberapa object hewan dengan cara biasa
        // Masalah: Kita bisa membuat object dari class Hewan yang terlalu umum
        // Padahal di dunia nyata, tidak ada "hewan" tanpa jenis spesifik

        // UNCOMMENT kode di bawah dan perhatikan masalahnya
        // HewanBiasa hewan = new HewanBiasa("Hewan Umum");
        // hewan.bersuara(); // Output apa yang akan keluar? "Hewan Umum Bersuara"
        HewanBiasa hewan = new HewanBiasa("Hewan Umum");
        hewan.bersuara();

        // ===== DENGAN ABSTRACTION: MENGGUNAKAN ABSTRACT CLASS =====
        System.out.println("\n=== DENGAN ABSTRACTION ===");

        // Latihan 2: Menggunakan abstract class
        // Buat beberapa object dari subclass Hewan

        // Buat object Kucing
        // Kucing kucing = new Kucing("Kitty");
        Kucing kucing = new Kucing("Kitty");
        // kucing.bersuara();
        kucing.bersuara();
        // kucing.makan();
        kucing.makan();
        // kucing.tidur();
        kucing.tidur();

        System.out.println();

        // Buat object Anjing
        // Anjing anjing = new Anjing("Bobby");
        Anjing anjing = new Anjing("Bobby");
        // anjing.bersuara();
        anjing.bersuara();
        // anjing.makan();
        anjing.makan();
        // anjing.tidur();
        anjing.tidur();

        // Buat object Burung
        // Burung burung = new Burung("Tweety");
        Burung burung = new Burung("Tweety");
        // burung.bersuara();
        burung.bersuara();
        // burung.makan();
        burung.makan();
        // burung.tidur();
        burung.tidur();

        // ===== DEMONSTRASI ABSTRACTION =====
        System.out.println("\n=== DEMONSTRASI ABSTRACTION ===");

        // Latihan 3: Polymorphic array
        // Buat array bertipe Hewan yang berisi berbagai jenis hewan
        // Iterasi array dan panggil method bersuara()

        // Hewan[] hewanArray = new Hewan[3];
        Hewan[] hewanArray = new Hewan[3];
        // hewanArray[0] = new Kucing("Kitty");
        hewanArray[0] = new Kucing("Kitty");
        // hewanArray[1] = new Anjing("Bobby");
        hewanArray[1] = new Anjing("Bobby");
        // hewanArray[2] = new Burung("Tweety");
        hewanArray[2] = new Burung("Tweety");

        // for (Hewan h : hewanArray) {
        //     h.bersuara();
        // }
        for (Hewan h : hewanArray) {
            h.bersuara();
        }

        // ===== KEUNTUNGAN ABSTRACTION =====
        System.out.println("\n=== KEUNTUNGAN ABSTRACTION ===");
        // Tuliskan dalam komentar 5 keuntungan menggunakan abstraction
        // 1. Mencegah pembuatan objek yang terlalu umum
        // 2. Abstract method (misal: bersuara()) harus diimplementasikan di subclass
        // 3. Satu tipe referensi (Hewan) bisa mewakili berbagai jenis hewan
        // 4. Menghemat kode (code reuse), method umum (makan(), tidur()) bisa dipakai semua subclass
        // 5. Perubahan di class induk langsung berpengaruh ke semua subclass

        /*
         * EKSPEKTASI OUTPUT:
         *
         * === DENGAN ABSTRACTION ===
         * Kitty berkata: Meong!
         * Kitty sedang makan
         * Kitty sedang tidur
         *
         * Bobby berkata: Guk Guk!
         * Bobby sedang makan
         * Bobby sedang tidur
         *
         * Tweety berkata: Cuit Cuit!
         * Tweety sedang makan
         * Tweety sedang tidur
         *
         * === DEMONSTRASI ABSTRACTION ===
         * Kitty berkata: Meong!
         * Bobby berkata: Guk Guk!
         * Tweety berkata: Cuit Cuit!
         */
    }
}

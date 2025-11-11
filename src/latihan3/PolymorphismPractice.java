package latihan3;

public class PolymorphismPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Polymorphism
         *
         * Instruksi: Lengkapi latihan untuk menguasai method overriding
         * dan method overloading (polymorphism).
         */

        // ===== PART 1: METHOD OVERRIDING =====
        System.out.println("=== METHOD OVERRIDING ===");

        // Latihan 1: Method overriding pada class hierarchy
        Bentuk b1 = new Lingkaran(5);
        b1.tampilkanInfo();
        System.out.println();

        Bentuk b2 = new PersegiPanjang(4, 6);
        b2.tampilkanInfo();
        System.out.println();

        Bentuk b3 = new Segitiga(3, 4);
        b3.tampilkanInfo();

        // ===== RUNTIME POLYMORPHISM =====
        System.out.println("\n=== RUNTIME POLYMORPHISM ===");

        // Latihan 2: Array polymorphic
        System.out.println("Menghitung total luas semua bentuk:");
        Bentuk[] bentukArray = {
             new Lingkaran(7),
             new PersegiPanjang(5, 10),
             new Segitiga(6, 8)
        };

        double totalLuas = 0;
        for (Bentuk b : bentukArray) {
            double luas = b.hitungLuas();
            System.out.println(b.getClass().getSimpleName() + ": " + String.format("%.2f", luas));
            totalLuas += luas;
        }
        System.out.println("Total Luas: " + String.format("%.2f", totalLuas));

        // ===== PART 2: METHOD OVERLOADING =====
        System.out.println("\n=== METHOD OVERLOADING ===");

        // Latihan 3: Kalkulator dengan method overloading
        Kalkulator calc = new Kalkulator();
        System.out.println("Menjumlahkan 2 integer: 5 + 3 = " + calc.tambah(5, 3));
        System.out.println("Menjumlahkan 3 integer: 2 + 4 + 6 = " + calc.tambah(2, 4, 6));
        System.out.println("Menjumlahkan 2 double: 2.5 + 3.7 = " + String.format("%.2f", calc.tambah(2.5, 3.7)));

        // ===== CONSTRUCTOR OVERLOADING =====
        System.out.println("\n=== CONSTRUCTOR OVERLOADING ===");

        // Latihan 4: Product dengan berbagai constructor
        Product p1 = new Product("Laptop");
        p1.tampilkanInfo();

        Product p2 = new Product("Mouse", 150000);
        p2.tampilkanInfo();

        Product p3 = new Product("Keyboard", 500000, 10);
        p3.tampilkanInfo();

        // ===== OVERRIDING DENGAN SUPER =====
        System.out.println("\n=== OVERRIDING DENGAN SUPER ===");

        // Latihan 5: Menggunakan super untuk memanggil method parent
        PegawaiTetap pegawai = new PegawaiTetap("Budi", 5000000, 10000000);
        pegawai.tampilkanInfo();

        /*
         * EKSPEKTASI OUTPUT:
         *
         * === METHOD OVERRIDING ===
         * Bentuk: Lingkaran
         * Luas Lingkaran dengan radius 5.0: 78.54
         * Keliling: 31.42
         *
         * Bentuk: Persegi Panjang
         * Luas Persegi Panjang (4.0 x 6.0): 24.00
         * Keliling: 20.00
         *
         * Bentuk: Segitiga
         * Luas Segitiga (alas: 3.0, tinggi: 4.0): 6.00
         * Keliling: 12.00
         *
         * === RUNTIME POLYMORPHISM ===
         * Menghitung total luas semua bentuk:
         * Lingkaran: 153.94
         * PersegiPanjang: 50.00
         * Segitiga: 24.00
         * Total Luas: 227.94
         *
         * === METHOD OVERLOADING ===
         * Menjumlahkan 2 integer: 5 + 3 = 8
         * Menjumlahkan 3 integer: 2 + 4 + 6 = 12
         * Menjumlahkan 2 double: 2.5 + 3.7 = 6.20
         *
         * === CONSTRUCTOR OVERLOADING ===
         * Product: Laptop | Price: Rp 0.0 | Stock: 0
         * Product: Mouse | Price: Rp 150000.0 | Stock: 0
         * Product: Keyboard | Price: Rp 500000.0 | Stock: 10
         *
         * === OVERRIDING DENGAN SUPER ===
         * Pegawai Tetap: Budi
         * Gaji Pokok: Rp 5000000.0
         * Bonus Tahunan: Rp 10000000.0
         * Total Gaji: Rp 15000000.0
         */
    }
}

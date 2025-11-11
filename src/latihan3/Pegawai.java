package latihan3;

// Buat class Pegawai
public class Pegawai {
    protected String nama;
    protected double gajiPokok;

    // Constructor
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method hitungGaji()
    public double hitungGaji() {
        return gajiPokok;
    }

    // Method tampilkanInfo()
    public void tampilkanInfo() {
        System.out.println("Pegawai: " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Total Gaji: Rp " + hitungGaji());
    }
}

package latihan1;

// Class biasa tanpa abstraction (untuk perbandingan)
public class HewanBiasa {
    protected String nama;

    public HewanBiasa(String nama) {
        this.nama = nama;
    }

    public void bersuara() {
        System.out.println(nama + " bersuara..."); // Terlalu umum!
    }

    public void makan() {
        System.out.println(nama + " sedang makan");
    }
}

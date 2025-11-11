package latihan3;

// Buat abstract class Bentuk
public abstract class Bentuk {
    protected String nama;

    // Constructor
    public Bentuk(String nama) {
        this.nama = nama;
    }

    // Abstract methods
    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    // Concrete method
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Luas: " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}

package latihan1;

// Buat abstract class Hewan
public abstract class Hewan {
    // Instance variable
    // protected String nama
    protected String nama;

    // Constructor
    // public Hewan(String nama) {
    //     this.nama = nama;
    // }
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Abstract method - harus diimplementasikan oleh subclass
    // public abstract void bersuara();
    public abstract void bersuara();

    // Concrete method - sudah ada implementasi
    // public void makan() {
    //     System.out.println(nama + " sedang makan");
    // }
    public void makan() {
        System.out.println(nama + "sedang makan");
    }

    // public void tidur() {
    //     System.out.println(nama + " sedang tidur");
    // }
    public void tidur() {
        System.out.println(nama + "sedang tidur");
    }

    // Method untuk menampilkan info
    // public void tampilkanInfo() {
    //     System.out.println("Nama: " + nama);
    // }
    public void tampilkanInfo() {
        System.out.println("Nama: + nama");
    }
}

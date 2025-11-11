package latihan3;

// Implementasikan class Product dengan constructor overloading
public class Product {
    private String nama;
    private double harga;
    private int stok;

    // Constructor 1: hanya nama
    public Product(String nama) {
        this.nama = nama;
        this.harga = 0;
        this.stok = 0;
    }

    // Constructor 2: nama dan harga
    public Product(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }

    // Constructor 3: nama, harga, dan stok
    public Product(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Method tampilkanInfo()
    public void tampilkanInfo() {
        System.out.println("Product: " + nama + " | Price: Rp " + harga + " | Stock: " + stok);
    }
}

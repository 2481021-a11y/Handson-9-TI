package latihan3;

// Implementasikan class Segitiga extends Bentuk
public class Segitiga extends Bentuk {
    private double alas, tinggi;

    // Constructor
    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Assume segitiga siku-siku untuk hitung keliling

    // Override hitungLuas() - return 0.5 * alas * tinggi
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Override hitungKeliling()
    // Hitung sisi miring menggunakan pythagoras: Math.sqrt(alas*alas + tinggi*tinggi)
    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

    // Override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Luas Segitiga (alas: " + alas + ", tinggi: " + tinggi + "): " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}

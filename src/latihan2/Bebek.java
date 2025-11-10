package latihan2;

// Implementasikan class Bebek implements Terbang, Berenang
// Multiple inheritance!
public class Bebek implements Terbang, Berenang {
    private String nama;
    private int kecepatan;

    // Constructor
    public Bebek(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    // Implementasi SEMUA method dari KEDUA interface
    // Dari interface Terbang:
    @Override public void lepasLandas() {
        System.out.println(nama + "sedang lepas landas");
    }
    @Override public void terbang() {
        System.out.println(nama + "terbang di udara dengan kecepatan");
    }
    @Override public void mendarat() {
        System.out.println("mendarat dengan mulus");
    }

    // Dari interface Berenang:
    @Override public void berenang() {
        System.out.println(nama + "sedang berenang di permukaan air");
    }
    @Override public void menyelam() {
        System.out.println(nama + " menyelam dengan kedalaman 2 meter");
    }
}

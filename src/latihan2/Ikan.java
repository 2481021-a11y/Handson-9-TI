package latihan2;

// Implementasikan class Ikan implements Berenang
public class Ikan implements Berenang {
    private String nama;

    // Constructor
    public Ikan(String nama) {
        this.nama = nama;
    }

    // Implementasi semua method dari interface Berenang
    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang di permukaan air");
    }

    @Override
    public void menyelam() {
        System.out.println(nama + " menyelam ke kedalaman air");
    }
}

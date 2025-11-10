package latihan1;

// Implementasikan class Burung extends Hewan
public class Burung extends Hewan {
    // Constructor
    public Burung(String nama) {
        super(nama);
    }

    // Implementasi method bersuara()
    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Cuit Cuit!");
    }
}

package latihan1;

// Implementasikan class Anjing extends Hewan
public class Anjing extends Hewan {
    // Constructor
    public Anjing(String nama) {
        super(nama);
    }

    // Implementasi method bersuara()
    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Guk Guk!");
    }
}

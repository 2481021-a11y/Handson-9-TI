package latihan1;

// Implementasikan class Kucing extends Hewan
public class Kucing extends Hewan {
    // Constructor
    public Kucing(String nama) {
        super(nama);
    }

    // Implementasi method bersuara()
    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Meong!");
    }
}

package latihan3;

// Implementasikan class PersegiPanjang extends Bentuk
public class PersegiPanjang extends Bentuk {
    private double panjang, lebar;

    // Constructor dengan super()
    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Override hitungLuas() - return panjang * lebar
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Override hitungKeliling() - return 2 * (panjang + lebar)
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Luas Persegi Panjang (" + panjang + " x " + lebar + "): " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}

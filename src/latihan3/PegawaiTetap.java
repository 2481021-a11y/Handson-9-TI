package latihan3;

// Buat class PegawaiTetap extends Pegawai
public class PegawaiTetap extends Pegawai {
    private double bonusTahunan;

    // Constructor
    public PegawaiTetap(String nama, double gajiPokok, double bonusTahunan) {
        super(nama, gajiPokok);
        this.bonusTahunan = bonusTahunan;
    }

    // Override hitungGaji() dengan menambahkan bonus
    @Override
    public double hitungGaji() {
        return super.hitungGaji() + bonusTahunan;
    }

    // Override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("Pegawai Tetap: " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Bonus Tahunan: Rp " + bonusTahunan);
        System.out.println("Total Gaji: Rp " + hitungGaji());
    }
}

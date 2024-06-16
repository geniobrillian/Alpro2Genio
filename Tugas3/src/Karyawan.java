public class Karyawan {
    private String nama;
    private int usia;
    private int gaji;

    public Karyawan(String nama, int usia, int gaji) {
        this.nama = nama;
        this.usia = usia;
        this.gaji = gaji;
    }

    // Menggunkan parameter input
    public void tambahGaji(int jumlah) {
        gaji += jumlah;
    }

    // Tanpa Parameter
    public String getNama() {
        return nama;
    }

    // Tanpa Return value
    public void setUsia(int usiaBaru) {
        usia = usiaBaru;
    }

    // Dengan Return value
    public double hitungGajiBersih() {
        // Dikurangi pajak
        return gaji * 0.90;
    }

    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Alip", 19, 4000000);
        karyawan1.tambahGaji(500000);
        karyawan1.setUsia(20);
        System.out.println("Jumlah Gaji : " + karyawan1.gaji);
        System.out.println("Nama : " + karyawan1.getNama());
        System.out.println("Usia : " + karyawan1.usia);
        System.out.println("Gaji Bersih : " + karyawan1.hitungGajiBersih());
    }
}

public class Pegawai {
    private String nama;
    private String jabatan;
    private int tahunMasuk;
    
    public Pegawai(String nama, String jabatan, int tahunMasuk) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.tahunMasuk = tahunMasuk;
    }
    //Method Getter tipe return value
    public String getNama() {
        return nama;
    }
    //Method Getter tipe return value
    public String getJabatan() {
        return jabatan;
    }
    //Method tanpa parameter
    public int hitungLamaKerja() {
        return 2024 - tahunMasuk;
    }
    //Method Setter Tanpa return value, tipe void
    public void setJabatan(String jabatanBaru) {
        jabatan = jabatanBaru;
        System.out.println("Jabatan sekarang : " + jabatanBaru);
    }

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Rozi", "OB", 2022);
        System.out.println("Nama : " + pegawai1.getNama());
        System.out.println("Jabatan : " + pegawai1.getJabatan());
        System.out.println("Lama bekerja : " + pegawai1.hitungLamaKerja() + " tahun");
        System.out.println("Jabatan awal : " + pegawai1.jabatan);
        pegawai1.setJabatan("Kepala Koki");

    }
}

package perbankkan;

public class Nasabah {
    private String namaAWal;
    private String namaAkhir;
    private Tabungan tabungan;

    Nasabah(String namaAwal, String namaAkhir){
        this.namaAWal = namaAwal;
        this.namaAkhir = namaAkhir;
        this.tabungan = new Tabungan(0);
    }

    public String getNamaAwal(){
        return this.namaAWal;
    }

    public String getNamaAkhir(){
        return this.namaAkhir;
    }
    public Tabungan getTabungan(){
        return this.tabungan;
    }
    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
}

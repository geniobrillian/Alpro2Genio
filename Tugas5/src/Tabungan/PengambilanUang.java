package Tabungan;

public class PengambilanUang extends Tabungan {
    private int proteksi;
    public PengambilanUang(int saldo, int proteksi) {
        super(saldo, "IDR");
        this.proteksi = proteksi;
    }
    public PengambilanUang(int saldo, int proteksi, String mataUang) {
        super(saldo, mataUang);
        this.proteksi = proteksi;
    }
    public boolean ambilUang(int jumlah) {
        if (jumlah <= getSaldo() - proteksi) {
            return super.ambilUang(jumlah, "IDR");
        } else {
            return false;
        }
    }
    public int getProteksi() {
        return proteksi;
    }
    public void setProteksi(int proteksi) {
        this.proteksi = proteksi;
    }

}

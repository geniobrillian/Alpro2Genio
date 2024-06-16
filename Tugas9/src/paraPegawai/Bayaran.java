package paraPegawai;

public class Bayaran {
    public int hitungBayaran(Pegawai pegawai) {
        int uang = pegawai.infoGaji();

        if (pegawai instanceof Manajer) {
            uang += ((Manajer) pegawai).getTunjangan();
        } else if (pegawai instanceof Programmer) {
            uang += ((Programmer) pegawai).getBonus();
        }

        return uang;
    }

    public static void main(String[] args) {
        Manajer manajer = new Manajer("Agus", 750, 50);
        Programmer programmer = new Programmer("Budi", 570, 30);
        Bayaran pembayaran = new Bayaran();

        System.out.println("Bayaran untuk Manajer: " + pembayaran.hitungBayaran(manajer));
        System.out.println("Bayaran untuk Programmer: " + pembayaran.hitungBayaran(programmer));
    }
}

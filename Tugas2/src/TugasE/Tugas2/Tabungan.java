package TugasE.Tugas2;
class Tabungan {
    int saldo;

    Tabungan(int saldo) {
        this.saldo = saldo;
    }

    int getSaldo() {
        return this.saldo;
    }

    int simpanUang(int jumlah) {
        this.saldo += jumlah;
        return jumlah;
    }

    boolean ambilUang(int ambil) {
        if (this.saldo > ambil) {
            this.saldo -= ambil;
            System.out.print("Jumlah uang yang diambil : " + ambil + " oke ");
            return true;
        } else {
            System.out.print("Jumlah uang yang diambil : " + ambil + " gagal ");
            return false;
        }
        
    }

    boolean transfer(Tabungan tLain, int jumlah){
        if (this.saldo > jumlah) {
            this.saldo -= jumlah;
            System.out.print("Saldo sebesar : " + jumlah + " berhasil di transfer ");
            tLain.saldo += jumlah;
            return true;
        } else {
            System.out.print("Taransfer saldo : " + jumlah + " gagal ");
            return false;
        }
    }

    public static void main(String[] args) {
        Tabungan tabunganKu = new Tabungan(5000);
        System.out.println("Saldo Awal : " + tabunganKu.getSaldo());
        System.out.println("Jumlah uang yang disimpan : " + tabunganKu.simpanUang(3000));
        System.out.println(tabunganKu.ambilUang(6000));
        System.out.println("Jumlah uang yang disimpan : " + tabunganKu.simpanUang(3500));
        System.out.println(tabunganKu.ambilUang(4000));
        System.out.println(tabunganKu.ambilUang(1600));
        System.out.println("Jumlah uang yang disimpan : " + tabunganKu.simpanUang(2000));
        System.out.println("Saldo sekarang : " + tabunganKu.saldo + "\n");

        Tabungan tabunganTeman = new Tabungan(0);
        System.out.println("Saldo Awal tabungan Teman : " + tabunganTeman.getSaldo());
        tabunganKu.transfer(tabunganTeman, 2000);
        System.out.println("\nSisa saldo Tabunganku : " + tabunganKu.saldo);
        System.out.println("Saldo Akhir Tabungan Teman : " + tabunganTeman.saldo);
    }
}

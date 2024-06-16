package TugasE.Tugas1;

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
        } else {
            System.out.print("Jumlah uang yang diambil : " + ambil + " gagal ");
            return false;
        }
        return true;
    }
    //class Tabungan memiliki 1 atribut yaitu int saldo, memiliki konstruktor untuk mengisi nilai dari atribut saldo, Method getSaldo() digunakan untuk menampilkan saldo, method simpanUang() digunakan untuk menambahkan jumlah pada parameter kedalam atribut saldo, method ambilUang() digunakan untuk mengkurangi jumlah saldo sesuai dengan isi parameter dan memiliki 2 pengkondisian jika saldo lebih besar dari yang akan diambil maka true sedangkan jika tidak maka false, Memiliki Object tabunganku
    public static void main(String[] args) {
        Tabungan tabunganKu = new Tabungan(5000);
        System.out.println("Saldo Awal : " + tabunganKu.getSaldo());
        System.out.println("Jumlah uang yang disimpan : " + tabunganKu.simpanUang(3000));
        System.out.println(tabunganKu.ambilUang(6000));
        System.out.println("Jumlah uang yang disimpan : " + tabunganKu.simpanUang(3500));
        System.out.println(tabunganKu.ambilUang(4000));
        System.out.println(tabunganKu.ambilUang(1600));
        System.out.println("Jumlah uang yang disimpan : " + tabunganKu.simpanUang(2000));
        System.out.println("Saldo sekarang : " + tabunganKu.saldo);
    }
}

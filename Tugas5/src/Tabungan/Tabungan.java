package Tabungan;

public class Tabungan {
    private int saldo;
    private String mataUang;

    public Tabungan(int saldoAwal, String mataUang) {
        this.saldo = saldoAwal;
        this.mataUang = mataUang;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah, String mataUang) {
        if (mataUang.equals("IDR")) {
            saldo += jumlah;
        } else if (mataUang.equals("USD")) {
            saldo += jumlah * 9000;
        } else if (mataUang.equals("AUD")) {
            saldo += jumlah * 10000;
        } else {
            System.out.println("Salah input mata uang");
        }
    }

    public boolean ambilUang(int jumlah, String mataUang) {
        if (mataUang.equals("IDR")) {
            if (saldo >= jumlah) {
                saldo -= jumlah;
                return true;
            } else {
                System.out.println("Saldo tidak cukup");
                return false;
            }
        } else if (mataUang.equals("USD")) {
            if (saldo >= jumlah * 9000) {
                saldo -= jumlah * 9000;
                return true;
            } else {
                System.out.println("Saldo tidak cukup");
                return false;
            }
        } else if (mataUang.equals("AUD")) {
            if (saldo >= jumlah * 10000) {
                saldo -= jumlah * 10000;
                return true;
            } else {
                System.out.println("Saldo tidak cukup");
                return false;
            }
        } else {
            System.out.println("Mata uang tidak dikenal");
            return false;
        }
    }

    public String getMataUang() {
        return mataUang;
    }

    public void setMataUang(String mataUang) {
        this.mataUang = mataUang;
    }

}

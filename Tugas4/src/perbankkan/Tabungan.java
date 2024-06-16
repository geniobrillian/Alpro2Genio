package perbankkan;

public class Tabungan {
    private int saldo ;

    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return this.saldo;
    }

    int simpanUang(int jumlah){
        this.saldo += jumlah;
        return jumlah ;
    }

    boolean ambilUang(int jumlah){
        if (getSaldo() > jumlah) {
            this.saldo -= jumlah;
            System.out.print("Diambil : "+jumlah + " ");
            return true;
        } else {
            return false;
        }
    }
}

package perbankkan;

public class Bank {
    private Nasabah [] nasabah;
    private int jumlahNasabah;

    public Bank(){
        this.jumlahNasabah = 0;
        this.nasabah = new Nasabah[5];
    };

    public void tambahNasabah(String namaAwal, String namaAkhir){
        nasabah[jumlahNasabah++] = new Nasabah(namaAwal, namaAkhir);
    }

    public int getJumlahNasabah(){
        return this.jumlahNasabah;
    }
    
    public Nasabah getNasabah(int indexs){
        return this.nasabah[indexs] ;
    }

}


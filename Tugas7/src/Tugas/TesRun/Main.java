package Tugas.TesRun;
import Tugas.Kendaraan.*;

public class Main {
    public static void main(String[] args) {
        Truk truk1 = new Truk();
        Truk truk2 = new Truk();
        Taksi taksi1 = new Taksi();
        Taksi taksi2 = new Taksi();
        Sepeda sepeda1 = new Sepeda();
        Sepeda sepeda2 = new Sepeda();

        truk1.setName("Truk1");
        truk1.setJmlhRoda(4);
        truk1.setWarna("kuning");
        truk1.setBahanBakar("solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks(1000);
        truk2.setName("Truk2");
        truk2.setJmlhRoda(6);
        truk2.setWarna("merah");
        truk2.setBahanBakar("solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks(5000);
        taksi1.setName("taksi1");
        taksi1.setJmlhRoda(4);
        taksi1.setWarna("oranye");
        taksi1.setBahanBakar("bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKm(5000);
        taksi2.setName("taksi2");
        taksi2.setJmlhRoda(4);
        taksi2.setWarna("biru");
        taksi2.setBahanBakar("bensin");
        taksi2.setKapasitasMesin(1300);
        taksi2.setTarifAwal(7000);
        taksi2.setTarifPerKm(3500);
        sepeda1.setName("sepeda1");
        sepeda1.setJmlhRoda(3);
        sepeda1.setWarna("hitam");
        sepeda1.setjmlhSadel("1");
        sepeda1.setjmlhGir(2);
        sepeda2.setName("sepeda2");
        sepeda2.setJmlhRoda(2);
        sepeda2.setWarna("putih");
        sepeda2.setjmlhSadel("2");
        sepeda2.setjmlhGir(5);
        
        truk1.display();
        truk2.display();
        taksi1.display();
        taksi2.display();
        sepeda1.display();
        sepeda2.display();

    }
}

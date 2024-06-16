package Tugas.Kendaraan;

public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;

    public void setTarifAwal(int tarif){
        this.tarifAwal = tarif;
    }

    public int getTarifAwal(){
        return tarifAwal;
    }

    public void setTarifPerKm(int tarif){
        this.tarifPerKm = tarif;
    }

    public int getTarifPerKm(){
        return tarifPerKm;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("tarif awal          : " + getTarifAwal());
        System.out.println("tarif per KM        : " + getTarifPerKm() + "\n");
    }
}
package Tugas.Kendaraan;

public class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;

    public void setBahanBakar(String setBahanBakar){
    this.bahanBakar = setBahanBakar;        
    }

    public String getBahanBakar(){
        return bahanBakar;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("bahan bakar         : " + getBahanBakar());
        System.out.println("kapasitas mesin     : " + getKapasitasMesin());
        //gen//System.out.println("muatan maks         : " + getMuatanMaks() + "\n") ;
    }


}

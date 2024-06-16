package Tugas.Kendaraan;

public class Truk extends Mobil {
    protected int muatanMaks;
    protected String name;

    public void setMuatanMaks(int muatan){
        this.muatanMaks = muatan;
    }

    public int getMuatanMaks(){
        return muatanMaks;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("muatan maks         : " + getMuatanMaks() + "\n") ;
    }
}

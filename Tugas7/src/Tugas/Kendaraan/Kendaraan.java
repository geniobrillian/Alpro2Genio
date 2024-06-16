package Tugas.Kendaraan;

public class Kendaraan {
    protected int jmlhRoda;
    protected String warna;
    protected String name;

    public void setJmlhRoda (int roda){
        this.jmlhRoda = roda;
    }
    public int getJmlhRoda(){
        return jmlhRoda;
    }
    public void setWarna (String warna){
        this.warna = warna;
    }
    public String getWarna (){
        return warna;
    }
    public void setName(String genio){
        this.name = genio;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("nama kendaraan      : " + getName());
        System.out.println("Jumlah Roda         : " + getJmlhRoda());
        System.out.println("warna               : " + getWarna());

    }


}

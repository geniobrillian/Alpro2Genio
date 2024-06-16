package Tugas.Kendaraan;

public class Sepeda extends Kendaraan {
    protected String jmlhSadel;
    protected int jmlhGir;

    public void setjmlhSadel(String jmlhSadel) {
        this.jmlhSadel = jmlhSadel;
    }

    public String getjmlhSadel() {
        return jmlhSadel;
    }

    public void setjmlhGir(int jmlhGir) {
        this.jmlhGir = jmlhGir;
    }

    public int getjmlhGir() {
        return jmlhGir;
    }

    public void display(){
        super.display();
        System.out.println("jumlah sadel        : " + getjmlhSadel());
        System.out.println("jumlah gir          : " + getjmlhGir() + "\n");
    }

}

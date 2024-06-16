package Overload;

public class MesinCusi extends PerangkatElektronik {
    @Override
    public void nyalakan() {
        System.out.println("Mesin cuci dinyalakan");
    }

    @Override
    public void matikan() {
        System.out.println("Mesin cuci dimatikan");
    }

    @Override
    public void operasikan() {
        System.out.println("Mesin cuci sedang mencuci pakaian");
    }
}

package Overload;

public class KUlkas extends PerangkatElektronik {
    @Override
    public void nyalakan() {
        System.out.println("Kulkas dinyalakan");
    }

    @Override
    public void matikan() {
        System.out.println("Kulkas dimatikan");
    }

    @Override
    public void operasikan() {
        System.out.println("Kulkas sedang mendinginkan makanan");
    }
}

package Overload;

public class Microwafe extends PerangkatElektronik {
    @Override
    public void nyalakan() {
        System.out.println("Microwave dinyalakan");
    }

    @Override
    public void matikan() {
        System.out.println("Microwave dimatikan");
    }

    @Override
    public void operasikan() {
        System.out.println("Microwave sedang memanaskan makanan");
    }
}

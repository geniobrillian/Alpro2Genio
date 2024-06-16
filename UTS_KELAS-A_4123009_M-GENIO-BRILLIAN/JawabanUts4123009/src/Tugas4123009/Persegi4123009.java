package Tugas4123009;

public class Persegi4123009 extends BangunDatar {
    private double sisi;


    public Persegi4123009(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double rumusHitung() {
        return sisi * sisi;
    }
}


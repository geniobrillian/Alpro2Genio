package Tugas4123009;

public class Segitiga4123009 extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga4123009(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double rumusHitung() {
        return 0.5 * alas * tinggi;
    }
}

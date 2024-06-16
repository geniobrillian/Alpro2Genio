package Tugas4123009;

public class Lingkaran4123009 extends BangunDatar {
    private double jariJari;

    
    public Lingkaran4123009(double jariJari) {
        this.jariJari = jariJari;
    }

    
    @Override
    public double rumusHitung() {
        return Math.PI * jariJari * jariJari;
    }
}

package senjata;

abstract class Weapon {
    public abstract void attack();
    public final void info() {
        System.out.println("Ini adalah Senjata");
    }
}

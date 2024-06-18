package senjata;

public class Knife  extends Weapon {
    private String knifeEdge;

    public Knife() {
        this.knifeEdge = "Tajam";
    }

    @Override
    public void attack() {
        System.out.println("Serangan Pisau dengan ketajaman " + knifeEdge + " .");
    }
}

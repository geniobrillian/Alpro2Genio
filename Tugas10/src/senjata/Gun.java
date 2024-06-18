package senjata;

class Gun extends Weapon {
    private int bullets;

    public Gun(int bullets) {
        this.bullets = bullets;
    }

    @Override
    public void attack() {
        if (bullets > 0) {
            System.out.println("Serangan pistol dengan  " + bullets + " peluru.");
            bullets--;
        } else {
            System.out.println("Tidak ada peluru untuk menyerang.");
        }
    }
}

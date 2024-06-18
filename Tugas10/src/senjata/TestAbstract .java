package senjata;

class TestAbstract {
    public static void main(String[] args) {
        Weapon knife1 = new Knife();
        Weapon gun1 = new Gun(10);

        knife1.attack();
        gun1.attack();
        gun1.attack();

        Weapon knife2 = new Knife();
        Weapon gun2 = new Gun(10);

        knife2.attack();
        gun2.attack();
        gun2.attack();

        // Demonstrasi metode final
        //knife1.info();
        //gun1.info();
        //knife2.info();
        //gun2.info();
    }
}

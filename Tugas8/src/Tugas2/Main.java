package Tugas2;

public class Main {
    public static void main(String[] args) {
        Katak katak1 = new Katak(5, "Froggy");
        Kecebong kecebong1 = new Kecebong(2, "Junior Frog", 10);

        System.out.println("Katak " + katak1.nama + " berumur " + katak1.umur + " tahun dan bergerak dengan cara " + katak1.caraBergerak());
        System.out.println("Kecebong " + kecebong1.nama + " berumur " + kecebong1.umur + " tahun, memiliki panjang ekor " + kecebong1.panjangEkor + " cm, dan bergerak dengan cara " + kecebong1.caraBergerak());
    }
}

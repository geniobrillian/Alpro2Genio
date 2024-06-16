package Tugas2;

public class Katak{
    int umur;
    String nama;

    public Katak(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    public String caraBergerak() {
        return "melompat";
    }
}

//Class katak memiliki 2 atribut yaitu umur bertipe int dan nama bertipe String, Memilliki konstruktor untuk mengisi nilai dari atributnya, Kemudian method cara bergerak dengan tipe String
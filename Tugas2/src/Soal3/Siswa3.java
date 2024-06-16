package Soal3;

class Siswa {
    int nrp;
    String nama;

    void setNrp(int i) {
        nrp = i;
    }

    void setNama(String i) {
        nama = i;
    }
}

class Test {
    public static void main(String args[]) {
        Siswa anak = new Siswa();
        anak.setNrp(5);
        anak.setNama("Budi");
        System.out.println(anak.nrp);
        System.out.println(anak.nama);
    }
}

//Membuat class dengan nama Siswa dengan atribut nrp dan nama, class Siswa memiliki method setNrp untuk mengisi nilai atribut nrp dan method setNama untuk mengisi value atribut nama, dan membuat object dengan nama anak

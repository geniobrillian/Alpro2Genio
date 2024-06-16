package Soal1;

class Siswa {
    int nrp;

    public void setNrp(int i) {
        nrp = i;
    }
}

class Test {
    public static void main(String args[]) {
        Siswa anak = new Siswa();
        anak.nrp = 5;
        System.out.println(anak.nrp);
    }
}

// Membuat class dengan nama Siswa, dan object dengan nama anak, Class siswa memiliki method setter untuk mengisi atribut nrp

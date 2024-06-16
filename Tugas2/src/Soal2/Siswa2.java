package Soal2;

class Siswa {
    int nrp;

    void setNrp(int i) {
        nrp = i;
    }
}

class Test {
    public static void main(String args[]) {
        Siswa anak = new Siswa();
        anak.setNrp(10);
        System.out.println(anak.nrp);
    }
}

package tesTugas;

public class Pegawai {
    int nip;
    String nama;

    public Pegawai(int nipPegawai){
        this(nipPegawai, "Noname");
    }

    public Pegawai(int nipPegawai, String namaPegawai){
        this.nip = nipPegawai;
        this.nama = namaPegawai;
    }

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai(30987);
        Pegawai pegawai2 = new Pegawai(12398, "Michael");

        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);

        System.out.println(pegawai2.nip);
        System.out.println(pegawai2.nama);
    }
}

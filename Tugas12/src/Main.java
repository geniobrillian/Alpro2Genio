import java.util.*;

class Mahasiswa {
    private String nrp;
    private String nama;
    private float nilai;

    public Mahasiswa(String nrp, String nama, float nilai) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getNilai() {
        return nilai;
    }

    public void setNilai(float nilai) {
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nrp='" + nrp + '\'' +
                ", nama='" + nama + '\'' +
                ", nilai=" + nilai +
                '}';
    }
}

class MahasiswaComparator implements Comparator<Mahasiswa> {
    @Override
    public int compare(Mahasiswa m1, Mahasiswa m2) {
        return Float.compare(m2.getNilai(), m1.getNilai());
    }
}

public class Main {
    public static void main(String[] args) {
        // 10 Mahasiswa Random
        List<Mahasiswa> mahasiswa = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String nrp = "M" + String.format("%04d", i + 1);
            String nama = "Mahasiswa " + (i + 1);
            float nilai = (float) (Math.random() * (100 - 60) + 60);
            mahasiswa.add(new Mahasiswa(nrp, nama, nilai));
        }
        System.out.println("Data mahasiswa sebelum diurutkan:");
        for (Mahasiswa m : mahasiswa) {
            System.out.println(m);
        }

        Collections.sort(mahasiswa, new MahasiswaComparator());

        System.out.println("\nData mahasiswa setelah diurutkan:");
        for (Mahasiswa m : mahasiswa) {
            System.out.println(m);
        }
    }
}

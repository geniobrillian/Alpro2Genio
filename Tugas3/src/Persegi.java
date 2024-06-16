public class Persegi {
    private double sisi;

    // Method parameter input tipe void
    public void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }

    // Method tipe return value
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Method tipe return value
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        persegi1.setSisi(15);
        System.out.println("Nilai Sisi : " + persegi1.sisi);
        System.out.println("Luas : " + persegi1.hitungLuas());
        System.out.println("Keliling : " + persegi1.hitungKeliling());
    }
}
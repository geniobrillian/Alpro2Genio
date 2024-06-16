package Overrid;

public class Pencetak {
        // Metode yang dioverload
        public void cetak(String teks) {
            System.out.println("Mencetak teks: " + teks);
        }
    
        public void cetak(int angka) {
            System.out.println("Mencetak angka: " + angka);
        }
    
        public void cetak(double angka) {
            System.out.println("Mencetak angka desimal: " + angka);
        }
}

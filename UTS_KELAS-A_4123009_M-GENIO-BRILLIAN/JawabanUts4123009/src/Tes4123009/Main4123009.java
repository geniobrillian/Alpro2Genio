package Tes4123009;
import java.util.Scanner;
import Tugas4123009.*;
public class Main4123009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+=======================================+");
        System.out.println("| Nama      : Muhammad Genio Brillian   |");
        System.out.println("| NIM       : 4123009                   |");
        System.out.println("+=======================================+");
        System.out.println("| Pilih Angka Menghitung Luas Bidang    |");
        System.out.println("| 1. Luas Persegi                       |");
        System.out.println("| 2. Luas Segitiga                      |");
        System.out.println("| 3. Luas Lingkaran                     |");
        System.out.println("+=======================================+");

        System.out.print("Pilih salah satu: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi persegi: ");
                double sisi = scanner.nextDouble();
                Persegi4123009 persegi = new Persegi4123009(sisi);
                System.out.println("Luas persegi: " + persegi.rumusHitung());
                break;
            case 2:
                System.out.print("Masukkan alas segitiga: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = scanner.nextDouble();
                Segitiga4123009 segitiga = new Segitiga4123009(alas, tinggi);
                System.out.println("Luas segitiga: " + segitiga.rumusHitung());
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                Lingkaran4123009 lingkaran = new Lingkaran4123009(jariJari);
                System.out.println("Luas lingkaran: " + lingkaran.rumusHitung());
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close();
    }
}

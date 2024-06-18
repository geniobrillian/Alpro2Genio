package Tabungan;

public class Main {
    public static void main(String[] args) {
    Tabungan tabungan = new Tabungan(3000000, "IDR");
    
    // Menyetor uang dalam USD
    tabungan.simpanUang(50, "USD");
    // Mengambil uang dalam AUD
    tabungan.ambilUang(20, "AUD");
    // Mendapatkan saldo dalam IDR
    int saldo = tabungan.getSaldo();
    // Mendapatkan mata uang
    String mataUang = tabungan.getMataUang();
    // Mengubah mata uang
    tabungan.setMataUang("USD");
    System.out.println("Saldo : " + saldo + " " + mataUang);
    }
}

package Tes;
import Overload.*;
import Overrid.*;

public class Main {
    public static void main(String[] args) {
        // Demonstrasi overriding
        PerangkatElektronik mesinCuciSaya = new MesinCusi();
        mesinCuciSaya.nyalakan();
        mesinCuciSaya.operasikan();
        mesinCuciSaya.matikan();

        PerangkatElektronik kulkasSaya = new KUlkas();
        kulkasSaya.nyalakan();
        kulkasSaya.operasikan();
        kulkasSaya.matikan();

        PerangkatElektronik microwaveSaya = new Microwafe();
        microwaveSaya.nyalakan();
        microwaveSaya.operasikan();
        microwaveSaya.matikan();

        // Demonstrasi overloading
        Pencetak pencetak = new Pencetak();
        pencetak.cetak("Halo, dunia!");
        pencetak.cetak(123);
        pencetak.cetak(123.45);
    }
}

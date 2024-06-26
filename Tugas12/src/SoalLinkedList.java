import java.util.ArrayList;
import java.util.List;

public class SoalLinkedList {

    public static void main(String[] args) {
        List<String> warna = new ArrayList<>();
        warna.add("MAGENTA");
        warna.add("RED");
        warna.add("WHITE");
        warna.add("BLUE");
        warna.add("CYAN");

        List<String> warnaDihapus = new ArrayList<>();
        warnaDihapus.add("RED");
        warnaDihapus.add("WHITE");
        warnaDihapus.add("BLUE");

        for (String warnaDihapusItem : warnaDihapus) {
            warna.remove(warnaDihapusItem);
        }

        System.out.println("Warna:");
        for (String warnaItem : warna) {
            System.out.print(warnaItem + " ");
        }
        System.out.println();
    }
}

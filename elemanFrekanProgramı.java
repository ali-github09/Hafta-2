import java.util.Arrays;
import java.util.HashMap;

public class elemanFrekanProgramı {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 40, 40, 50, 60, 10};

        HashMap<Integer, Integer> tekrarSayilari = new HashMap<>();

        // Listedeki sayıların tekrar sayılarını hesapla

        for (int sayi : list) {
            if (tekrarSayilari.containsKey(sayi)) {
                tekrarSayilari.put(sayi, tekrarSayilari.get(sayi) + 1);
            } else {
                tekrarSayilari.put(sayi, 1);
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("Listedeki sayıların tekrar sayıları:");
        for (int sayi : tekrarSayilari.keySet()) {
            System.out.println(sayi + ": " + tekrarSayilari.get(sayi) + " kez");
        }





    }
}

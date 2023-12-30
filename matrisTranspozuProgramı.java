import java.util.Scanner;
public class matrisTranspozuProgramı {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Matrisin satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int sutunSayisi = scanner.nextInt();


        int[][] matris = new int[satirSayisi][sutunSayisi];
        System.out.println("Matrisin elemanlarını girin:");

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print("Matris[" + (i + 1) + "][" + (j + 1) + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Matrisin transpozunu bul
        int[][] transpoz = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }


        System.out.println("Matris:");
        matrisiYazdir(matris);


        System.out.println("Transpoz:");
        matrisiYazdir(transpoz);

        scanner.close();
    }

    // Matrisi ekrana yazdıran yardımcı fonksiyon
    static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }




    }
}

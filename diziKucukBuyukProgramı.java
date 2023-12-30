import java.util.Arrays;
import java.util.Scanner;
public class diziKucukBuyukProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("lütfen bir sayı giriniz : ");
        int x = input.nextInt();

        int i = 0;
        boolean devam = true;
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};

        Arrays.sort(arr);
        System.out.println("dizinin sıralı hali : " + Arrays.toString(arr));

        while (devam) {

            if (x < arr[i]) {
                System.out.println(arr[i] + "  " + x + "  'ten büyük en yakın sayıdır.");
                devam = false;
            } else {
                i++;
            }
        }

        i = 0;
        devam = true;

        while (devam) {

            if (x > arr[i]) {
                i++;

            } else {
                System.out.println(arr[i-1] + "  " + x + "  'ten küçük en yakın sayıdır.");
                devam = false;
            }
        }
    }
}

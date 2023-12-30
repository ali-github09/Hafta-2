import java.util.Arrays;
import java.util.Scanner;

public class diziSıralamaProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dizinin eleman sayısını giriniz : ");
        int x = input.nextInt();
        int[] arr = new int[x];



        for (int i =0; i < x; i++) {
            System.out.println("Lütfen dizinin " + (i+1) + ". elemanını giriniz: ");
            int m = input.nextInt();
            arr[i] = m;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

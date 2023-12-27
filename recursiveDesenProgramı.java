import java.util.Scanner;

public class recursiveDesenProgramı {


    static int desen(int x) {
        int sonuc = 0;
       for (int i = 0; i < x+5; i+=5) {
           sonuc = x-i;
           System.out.print(sonuc + " ");
           if (sonuc <= 0) {
               for (int k = 0; k < x; k+=5) {
                   sonuc += 5;
                   System.out.print(sonuc + " ");
               }
           }

       }
       return sonuc;
    }





    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz : ");
    int m = input.nextInt();
        desen(m);
    }
}

import java.util.Scanner;

public class recursiveAsalSayıProgramı {


    static boolean asal(int x) {
        boolean result = true;

        for ( int i = 2; i < x; i++) {

            if (x < 2)
                result = true;
            else if ( x % i == 0) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int x = input.nextInt();
        if (asal(x))
            System.out.println(x + " asal bir sayıdır.");
        else {
            System.out.println(x + " asal bir sayı değildir.");
        }
    }
}
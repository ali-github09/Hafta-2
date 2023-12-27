import java.util.Scanner;

public class recursiveUsAlmaProgramı {

    static  int recursive(int x, int y) {
        int result = 1;

        if (y == 0)
            result = 1;

        else {
            for (int i = 1; i <= y; i++){

                result *= x;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen taban değerini giriniz : ");
        int x = input.nextInt();
        System.out.print("Lütfen kuvvet değerini giriniz : ");
        int y = input.nextInt();

        System.out.println(recursive(x,y));

    }

}

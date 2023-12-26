import java.util.Scanner;

public class PalindromSayıProgramı {

    static boolean isPalindrom(int number){
int temp = number, reverseNumber = 0, lastNumber;
while(temp != 0) {
    lastNumber = temp % 10;
    reverseNumber = (reverseNumber * 10) + lastNumber;
    temp /=10;
}

if(number == reverseNumber)
    return true;
else
    return false;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int m = input.nextInt();

        if (isPalindrom(m))
            System.out.println(m + " bir palindrom sayıdır.");
        else
            System.out.println(m + " bir palindrom sayı değildir.");

    }
}

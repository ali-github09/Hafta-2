import java.util.Scanner;

public class palindromikKelimeProgramı {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kelime;
        System.out.print("lütfen bir kelime giriniz : ");
        kelime = input.nextLine();
        if (isPalindrome(kelime)){
            System.out.println(kelime + " palindromik bir kelimedir.");
        } else {
            System.out.println(kelime + " palindromik bir kelime değildir.");
        }

    }
}

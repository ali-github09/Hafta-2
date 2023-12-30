public class diziOrtalamaProgramı {
    public static void main(String[] args) {

        double [] numbers = {1,4,4,4,4};
        double toplam = 1.0;

        for (int i = 0; i < numbers.length; i++){
            toplam += 1 / numbers[i];
        }
        System.out.println(toplam);
    }
}

import java.util.Arrays;
public class tekrarEdenSayıProgramı {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int [] list = {1,8,4,6,7,4,9,5,7,8,6,2,};
        int [] dublicate = new int[list.length];
        int startindex = 0;

        for (int i=0; i < list.length; i++){
            for (int j=0; j < list.length; j++){
                if(i != j && (list[i] == list[j])){
                    if(!isFind(dublicate, list[i])) {
                        dublicate[startindex++] = list[i];
                    }
                    break;
                }

            }
        }

        for (int value : dublicate){
            if (value != 0 && value%2 == 0){
                System.out.print(value + " ");
            }
        }
    }
}

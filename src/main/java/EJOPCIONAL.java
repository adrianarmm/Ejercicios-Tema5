import java.util.Arrays;

public class EJOPCIONAL {

    public static void main(String[] args) {
        int[] array = {10, 5, 3, 8, 2, 6, 4, 7, 9, 1};
        quicksort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }


}

import java.util.Arrays;

public class EJOPCIONAL {

    public static void main(String[] args) {
        int[] array = {10, 5, 3, 8, 2, 6, 4, 7, 9, 1};
        quicksort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quicksort(int[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int pivote = particionOptimizado(array, izquierda, derecha);
            quicksort(array, izquierda, pivote - 1);
            quicksort(array, pivote + 1, derecha);
        }
    }

}

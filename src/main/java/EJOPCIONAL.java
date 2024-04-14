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

    private static int particionOptimizado(int[] array, int izquierda, int derecha) {
        int pivote = array[derecha];
        int i = izquierda - 1;
        for (int j = izquierda; j < derecha; j++) {
            if (array[j] <= pivote) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[derecha];
        array[derecha] = temp;
        return i + 1;
    }
}


public class EJ5 {

    public static void main(String[] args) {
        int[] vector = {3, 5, 1, 7, 9};
        int maximo = EJ5(vector, 0);
        System.out.println("El valor máximo del vector es: " + maximo);
    }

    public static int EJ5(int[] vector, int indice) {
        if (indice == vector.length - 1) {
            return vector[indice];
        } else {
            int maximoResto = EJ5(vector, indice + 1);
            return Math.max(vector[indice], maximoResto);
        }
    }
}
public class ej2 {

    public static void main(String[] args) {
        int n = 5;
        long suma = ej2(n);
        System.out.println("La suma de los " + n + " primeros números naturales es: " + suma);
    }

    public static long ej2(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n + ej2(n - 1);
        }
    }
}
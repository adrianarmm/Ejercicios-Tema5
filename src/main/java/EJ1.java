public class EJ1 {
    public static void main(String[] args) {
        int n = 5;
        long resultado = EJ1(n);
        System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);
    }
public static long EJ1(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n + EJ1(n - 1);
        }
}
}

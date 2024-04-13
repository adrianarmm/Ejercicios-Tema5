import java.util.Scanner;

public class EJ4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Introduce el valor de y: ");
        int y = scanner.nextInt();
        int producto = EJ4(x, y);
        System.out.println("El producto de " + x + " y " + y + " es: " + producto);
    }

    public static int EJ4(int x, int y) {
        if (y == 0) {
            return 0;
        } else if (y == 1) {
            return x;
        } else {
            return x + EJ4(x, y - 1);
        }
    }
}
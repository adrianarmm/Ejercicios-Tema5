import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Introduce el valor de b: ");
        int b = scanner.nextInt();
        ej2(a, b);
    }

    public static void ej2(int a, int b) {
        if (a > b) {
            System.out.println("La lista de números naturales entre " + a + " y " + b + " está vacía.");
        } else if (a == b) {
            System.out.println(a);
        } else {
            System.out.print(a + " ");
            ej2(a + 1, b);
        }
    }
}
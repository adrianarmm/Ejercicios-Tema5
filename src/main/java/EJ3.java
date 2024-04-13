import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        int cantidadDeDigitos = EJ3(numero);
        System.out.println("La cantidad de dígitos de " + numero + " es: " + cantidadDeDigitos);
    }

    public static int EJ3(int numero) {
        if (numero < 10) {
            return 1;
        } else {
            return 1 + EJ3(numero / 10);
        }
    }
}
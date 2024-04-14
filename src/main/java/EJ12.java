import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<LocalDate> fechas = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.SMART);
        System.out.println("Introduce una fecha (dd/MM/yyyy) o pulse FIN para terminar.");

        while (true) {
            String linea = scanner.nextLine();
            if ("FIN".equalsIgnoreCase(linea)) {
                break;
            }
            try {
                LocalDate fecha = LocalDate.parse(linea, formatter);
                fechas.add(fecha);
            } catch (DateTimeException e) {
                System.out.println("La fecha introducida no es válida.");
                // Añade la sugerencia para que el usuario sepa el formato esperado
                System.out.println("Asegúrate de introducir la fecha en formato dd/MM/yyyy.");
            }
        }
        Collections.sort(fechas);
        System.out.println("Las fechas introducidas en orden cronológico son:");
        for (LocalDate fecha : fechas) {
            System.out.println(fecha.format(formatter));
        }
    }
}


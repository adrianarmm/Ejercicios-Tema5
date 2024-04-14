import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<LocalDate> fechas = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy").withResolverStyle(ResolverStyle.STRICT);
        while (true) {
            System.out.println("Introduce una fecha (dd/MM/yyyy) o pulse FIN para terminar.");
            String linea = scanner.nextLine();
            if (linea.isEmpty()) {
                break;
            }
            try {
                LocalDate fecha = LocalDate.parse(linea, formatter);
                fechas.add(fecha);
            } catch (DateTimeException e) {
                System.out.println("La fecha introducida no es válida.");
            }
        }
        Collections.sort(fechas, Comparator.naturalOrder());
        System.out.println("Las fechas introducidas en orden cronológico son:");
        for (LocalDate fecha : fechas) {
            System.out.println(fecha.format(formatter));
        }
    }
}


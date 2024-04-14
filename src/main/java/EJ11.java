import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EJ11 {
    public static void main(String[] args) {
        String rutaArchivo = "archivo.txt";
        String palabraBuscada = "ADENINA";
        boolean encontrada = buscarPalabraBinaria(rutaArchivo, palabraBuscada);
        if (encontrada) {
            System.out.println("La palabra \"" + palabraBuscada + "\" ha sido encontrada en el archivo.");
        } else {
            System.out.println("La palabra \"" + palabraBuscada + "\" no ha sido encontrada en el archivo.");
        }
    }
    private static boolean buscarPalabraBinaria(String rutaArchivo, String palabraBuscada) {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            List<String> lineas = new ArrayList<>();
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
            lineas.sort(String::compareTo);
            int izquierda = 0;
            int derecha = lineas.size() - 1;
            while (izquierda <= derecha) {
                int mitad = (izquierda + derecha) / 2;
                int comparacion = lineas.get(mitad).compareToIgnoreCase(palabraBuscada);
                if (comparacion == 0) {
                    return true;
                } else if (comparacion < 0) {
                    izquierda = mitad + 1;
                } else {
                    derecha = mitad - 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}


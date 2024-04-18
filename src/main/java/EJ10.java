import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class EJ10 {
    public static void main(String[] args) {
        // PONER ARCHIVOOOOOS
        String rutaArchivo = "/Users/adrianareyesmorera/Desktop/CASO5.txt";
        String palabraBuscada = "TIMINA";
        boolean encontrada = buscarPalabra(rutaArchivo, palabraBuscada);
        if (encontrada) {
            System.out.println("La palabra \"" + palabraBuscada + "\" ha sido encontrada en el archivo.");
        } else {
            System.out.println("La palabra \"" + palabraBuscada + "\" no ha sido encontrada en el archivo.");
        }
    }

    private static boolean buscarPalabra(String rutaArchivo, String palabraBuscada) {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int lineaActual = 1;
            while ((linea = reader.readLine()) != null) {
                int posicionPalabra = linea.toLowerCase().indexOf(palabraBuscada.toLowerCase());
                while (posicionPalabra != -1) {
                    System.out.println("La palabra \"" + palabraBuscada + "\" ha sido encontrada en la línea " + lineaActual + " en la posición " + (posicionPalabra + 1) + ".");
                    posicionPalabra = linea.toLowerCase().indexOf(palabraBuscada.toLowerCase(), posicionPalabra + 1);
                }
                lineaActual++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}


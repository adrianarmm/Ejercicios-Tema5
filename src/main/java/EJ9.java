import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EJ9 {
   // PONER ARCHIVOOOOOS
    public static void main(String[] args) {
        String rutaArchivoEntrada = "archivoEntrada.txt";
        String rutaArchivoSalida = "archivoSalida.txt";
        ordenarArchivo(rutaArchivoEntrada, rutaArchivoSalida);
    }
    private static void ordenarArchivo(String rutaArchivoEntrada, String rutaArchivoSalida)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivoEntrada));
             BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivoSalida)))
        {
            List<String> lineas = new ArrayList<>();
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
            lineas.sort(String::compareTo);
            for (String lineaOrdenada : lineas) {
                writer.write(lineaOrdenada);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


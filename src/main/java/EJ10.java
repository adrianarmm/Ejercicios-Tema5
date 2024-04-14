import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class EJ10 {
    public static void main(String[] args) {
        String rutaArchivo = "archivo.txt";
        String palabraBuscada = "giraffe";
        boolean encontrada = EJ10(rutaArchivo, palabraBuscada);
        if (encontrada) {
            System.out.println("La palabra \"" + palabraBuscada + "\" ha sido encontrada en el archivo.");
        } else {
            System.out.println("La palabra \"" + palabraBuscada + "\" no ha sido encontrada en el archivo.");
        }
    }

}

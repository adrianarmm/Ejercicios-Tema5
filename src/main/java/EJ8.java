import java.util.Random;
public class EJ8 {
    public static void main(String[] args) {
        String adn = generarCadenaAleatoria(100);
        System.out.println("Cadena de ADN generada: " + adn);
        int genes = contarGenes(adn);
        System.out.println("Número de genes en la cadena de ADN: " + genes);
    }

    private static String generarCadenaAleatoria(int longitud) {
        String cadena = "";
        String bases = "ATGC";
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            cadena += bases.charAt(random.nextInt(bases.length()));
        }
}

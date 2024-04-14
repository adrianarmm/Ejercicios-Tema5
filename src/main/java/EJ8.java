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
        return cadena;
    }
    private static int contarGenes(String adn) {
        int genes = 0;
        int longitud = adn.length();
        for (int i = 0; i < longitud - 2; i++) {
            if (adn.substring(i, i + 3).equals("ATG")) {
                genes++;
            }
        }
        return genes;
    }
}
import java.util.Random;
public class EJ8 {
    public static void main(String[] args) {
        String adn = generarCadenaAleatoria(100);
        System.out.println("Cadena de ADN generada: " + adn);
        int genes = contarGenes(adn);
        System.out.println("Número de genes en la cadena de ADN: " + genes);
    }
}

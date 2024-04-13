public class EJ6 {

    public static void main(String[] args) {
        String hexadecimal = "1A3F";
        int decimal = EJ6(hexadecimal, hexadecimal.length());
        System.out.println("El valor decimal correspondiente a la cadena hexadecimal \"" + hexadecimal + "\" es: " + decimal);
    }

    public static int EJ6(String hexadecimal, int longitud) {
        if (longitud == 1) {
            return valorDecimal(hexadecimal.charAt(0));
        } else {
            return (int) (valorDecimal(hexadecimal.charAt(longitud - 1)) * Math.pow(16, longitud - 1) + EJ6(hexadecimal, longitud - 1));
        }
    }

    private static int valorDecimal(char hexadecimal) {
        if (hexadecimal >= '0' && hexadecimal <= '9') {
            return hexadecimal - '0';
        } else if (hexadecimal >= 'A' && hexadecimal <= 'F') {
            return hexadecimal - 'A' + 10;
        } else if (hexadecimal >= 'a' && hexadecimal <= 'f') {
            return hexadecimal - 'a' + 10;
        } else {
            throw new IllegalArgumentException("La cadena hexadecimal contiene un carácter inválido");
        }
    }
}
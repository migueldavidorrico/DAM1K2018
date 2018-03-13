import java.util.ArrayList;
import java.util.List;

public class Poemas {
    public static void main(String[] args) {

        List<String> palabras = separaEnPalabras("الماء يذهب إلى الأنهار");
        for (String p :
                palabras) {
            System.out.println(p);
        }
    }

    private static List<String> separaEnPalabras(String s) {
        List<String> palabras = new ArrayList<>();
        int indice = 0;
        while (!Character.isLetter(s.charAt(indice))) {
            indice++;
        }
        while (indice < s.length()) {
            String palabraNueva = "";
            char actual = s.charAt(indice++);
            while (Character.isLetter(actual)) {
                palabraNueva += actual;
                if (indice == s.length()) {
                    break;
                }
                actual = s.charAt(indice++);
            }
            if (palabraNueva.length() > 0) {
                palabras.add(palabraNueva);
            }
        }
        return palabras;
    }
}

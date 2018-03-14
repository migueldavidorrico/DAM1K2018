import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Poemas {
    public static void main(String[] args) throws IOException {

        List<String> frasesFichero = Files.readAllLines(Paths.get("poemaCuervos"));
        for (String s :
                frasesFichero) {
            System.out.println(s);
        }
        List<List<String>> texto = new ArrayList<>();
        for (String s :
                frasesFichero) {
            if (s.length() > 0) {
                texto.add(separaEnPalabras(s));
            }
        }
        for (List<String> lista :
                texto) {
            System.out.println(lista);
        }
        for (List<String> lista :
                texto) {
            System.out.println(lista.get(lista.size() - 1));
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

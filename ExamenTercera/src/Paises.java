import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Paises {
    public static void main(String[] args) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get("paises.txt"));
        Map<String, List<String>> paises = new HashMap<>();
        Iterator<String> itPaises = lineas.iterator();
        while (itPaises.hasNext()) {
            String nombre = itPaises.next();
            String idiomas = itPaises.next();
            List<String> listaIdiomas = Arrays.asList(idiomas.split(","));
            paises.put(nombre, listaIdiomas);
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("salida.obj")))) {
            oos.writeObject(paises);
        }
    }
}

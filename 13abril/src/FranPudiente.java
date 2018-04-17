import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FranPudiente {
    public static void main(String[] args) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get("franXML"));
        for (String linea :
                lineas) {
            if (linea.contains("<Nombre>")) {
                System.out.println(linea);
                String nueva = linea.substring(linea.indexOf("<Nombre>") + 8);
                System.out.println(nueva);
                nueva = nueva.substring(0, nueva.indexOf('<'));
                System.out.println(nueva);
            }
        }
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ErreFobia {
    public static void main(String[] args) throws IOException {
        List<String> fichero = Files.readAllLines(Paths.get("Nombres"));
        List<List<String>> nombresSueltos = new ArrayList<>();
        for (String linea : fichero) {
            String[] nombres = linea.split(" ");
            List<String> lineaActual = new ArrayList<>();
            for (String s :
                    nombres) {
                if (!s.contains("r"))
                    lineaActual.add(s);
            }
            if (lineaActual.size() > 0) {
                nombresSueltos.add(lineaActual);
            }
        }
        System.out.println(nombresSueltos);
    }
}

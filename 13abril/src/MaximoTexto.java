import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MaximoTexto {
    public static void main(String[] args) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get("numeros.txt"), StandardCharsets.UTF_8);
        int maximo = Integer.MIN_VALUE;
        for (String cadena :
                lineas) {
            if (Integer.parseInt(cadena) > maximo) {
                maximo = Integer.parseInt(cadena);
            }
        }
        System.out.println("El máximo es " + maximo);
    }
}

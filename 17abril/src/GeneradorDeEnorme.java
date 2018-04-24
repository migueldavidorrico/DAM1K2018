import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class GeneradorDeEnorme {
    public static void main(String[] args) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get("enorme.txt"));
        for (int i = 0; i < 100000; i++) {

            Files.write(Paths.get("grande.txt"), lineas, StandardOpenOption.APPEND);
        }

        List<String> noCabe = Files.readAllLines(Paths.get("grande.txt"));
        System.out.println(noCabe.size());
    }
}

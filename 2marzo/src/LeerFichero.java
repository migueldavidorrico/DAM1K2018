import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerFichero {
    public static void main(String[] args) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get("poema"));
        System.out.println(lineas);
    }
}

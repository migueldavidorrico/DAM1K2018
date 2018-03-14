import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Excepciones {
    public static List<String> leerFichero(String nombre) throws IOException {
        return Files.readAllLines(Paths.get(nombre));
    }

    public static void main(String[] args) throws IOException {
        try {
            List<String> lineas = leerFichero("google.es");
        } catch (IllegalArgumentException e) {
            System.out.println("Algo funcionó mal");
        } finally {
            cerrarConexion();
        }
    }

    private static void cerrarConexion() {
        System.out.println("Cerrada");
    }

    private static List<String> leerPaginaInternet(String s) {
        return new ArrayList<>();
    }

}

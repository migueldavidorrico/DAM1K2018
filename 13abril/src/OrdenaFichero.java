import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;

public class OrdenaFichero {
    public static void main(String[] args) throws IOException {
        JFileChooser seleccion = new JFileChooser();
        File fichero = null;
        if (seleccion.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            fichero = seleccion.getSelectedFile();
        }
        List<String> lineas = Files.readAllLines(fichero.toPath(), StandardCharsets.UTF_8);
        for (String linea :
                lineas) {
            System.out.println("-" + linea);
        }
        Collections.sort(lineas);
        JFileChooser seleccion2 = new JFileChooser();
        File fichero2 = null;
        if (seleccion2.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            fichero2 = seleccion2.getSelectedFile();
        }
        Files.write(fichero2.toPath(), lineas, StandardCharsets.UTF_8);
    }
}

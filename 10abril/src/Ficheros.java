import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Ficheros {
    public static void main(String[] args) throws IOException {
        //En este curso, no hacer cosas raras con los nombres.
        File fichero = new File("10abril" + File.separator + "prueba.txt");
        fichero.createNewFile();
        File directorio = new File("a/a/a/a/a/a/a/a/a/a/a/a/a/a/pepe");
        System.out.println(directorio.mkdir());
        System.out.println(directorio.mkdirs());
        File nuevo = new File(directorio, "nuevo.txt");
        nuevo.createNewFile();
        System.out.println(nuevo.getFreeSpace());
        System.out.println(nuevo.lastModified());
        long milis = nuevo.lastModified();
        LocalDateTime date =
                Instant.ofEpochMilli(milis)
                        .atZone(ZoneId.systemDefault())
                        .toLocalDateTime();
        System.out.println(date);
//        JFileChooser fileChooser = new JFileChooser();
//
//        int seleccion = fileChooser.showSaveDialog(null);
//        System.out.println(fileChooser.getSelectedFile().createNewFile());
        File conEspacios = new File("perico pepito");
        conEspacios.createNewFile();
    }
}

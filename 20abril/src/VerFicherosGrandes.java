import javax.swing.*;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VerFicherosGrandes {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = chooser.showOpenDialog(null);
        if (seleccion != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File directorioInicial = chooser.getSelectedFile();
        List<File> seleccionados = seleccionNombreTamanyo(directorioInicial, ".png", 5000000);
        List<File> seleccionados2 = seleccionTamanyo(directorioInicial, 10000);
        List<File> seleccionados3 = seleccionExtension(directorioInicial, ".zip");
        List<File> seleccionGrandes = seleccionTamanyo(directorioInicial, 1, Unidades.MEGAS);

        for (File f : seleccionGrandes) {
            System.out.printf("%20s - %8d %n", f.getName(), f.length());
        }
    }

    private static List<File> seleccionTamanyo(File directorioInicial, int i, Unidades ud) {
        return seleccionTamanyo(directorioInicial, ud.getBytes(i));
    }

    private static List<File> seleccionTamanyo(File directorioInicial, int i) {
        return seleccionNombreTamanyo(directorioInicial, "", i);
    }

    private static List<File> seleccionExtension(File directorioInicial, String s) {
        return seleccionNombreTamanyo(directorioInicial, s, -1);
    }

    private static List<File> seleccionNombreTamanyo(File f, String s, int i) {
        File[] ficheros = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || (pathname.getName().endsWith(s) && pathname.length() > i);
            }
        });

        List<File> listaFicheros = new ArrayList<>();
        for (File fichero :
                ficheros) {
            if (fichero.isFile()) {
                listaFicheros.add(fichero);
            } else if (fichero.isDirectory()) {
                listaFicheros.addAll(seleccionNombreTamanyo(fichero, s, i));
            }
        }
        return listaFicheros;
    }
}

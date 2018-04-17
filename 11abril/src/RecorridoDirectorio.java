import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.util.Deque;
import java.util.LinkedList;

public class RecorridoDirectorio {
    public static void main(String[] args) {
        File inicio = new File("/");
        mostrarFicheros(inicio);
    }

    private static void mostrarFicheros(File inicio) {
        File[] iniciales = inicio.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                return pathname.length() < 300;
            }
        });
        Deque<File> noMostrados = new LinkedList<>();
        for (File f :
                iniciales) {
            noMostrados.add(f);
        }
        while (!noMostrados.isEmpty()) {
            File actual = noMostrados.pop();
            if (actual.isFile()) {
                System.out.println(actual.getName() + " " + actual.length());
            } else {
//                System.out.println("DIR: " + actual.getName());
                File[] nuevos = actual.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        return pathname.length() < 300;
                    }
                });
                if (nuevos != null) {
                    for (File f : nuevos
                            ) {
                        noMostrados.add(f);
                    }
                }
            }
        }

    }

//    private static void mostrarFicheros(File inicio) {
//        File[] lista=inicio.listFiles();
//        for (File f :
//                lista) {
//            if (f.isFile()) {
//                System.out.println(f.getName());
//            } else {
//                System.out.println("DIR: " + f.getName());
//                mostrarFicheros(f);
//            }
//            }
//    }
}

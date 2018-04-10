import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Dir {
    public static void main(String[] args) {
        File actual = new File("/home/miguel");
        muestraFicheros(actual);
    }

    private static void muestraFicheros(File actual) {
        List<File> porMirar = new ArrayList<>();

    }
//
//    private static void muestraFicheros(File actual) {
//        File[] nombres=actual.listFiles();
//
//        for (File archivo :
//                nombres) {
//            if(archivo.isFile()) {
//                System.out.println(archivo.getName());
//            } else {
//                System.out.println(archivo.getName() + " DIR");
//                muestraFicheros(archivo);
//            }
//        };
//    }
}

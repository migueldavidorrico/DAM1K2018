import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class More {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean finDeFichero = false;
        try (Scanner fichero = new Scanner(new File("largo.txt"))) {
            while (!finDeFichero) {
                String[] lineasMostrar = new String[24];
                for (int i = 0; i < 24; i++) {
                    try {
                        lineasMostrar[i] = fichero.nextLine();
                        System.out.println(lineasMostrar[i]);
                    } catch (NoSuchElementException e) {
                        lineasMostrar = Arrays.copyOf(lineasMostrar, i);
                        finDeFichero = true;
                    }
                }
                for (String s :
                        lineasMostrar) {
                    System.out.println(s);
                }
                System.out.println("FIN DE PAGINA");
                teclado.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

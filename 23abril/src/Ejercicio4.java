import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.readAllLines;

/*Escribir un método, de nombre leerCadenaDeArchivo, que reciba por
parámetro el nombre de un archivo y devuelva un array con las cadenas
que dicho archivo almacena. Se tendrá en cuenta que las distintas cadenas
se separan en el archivo por un asterisco. El método no capturará ninguna
excepción que pueda producirse.
 */
public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.deepToString(leerCadenaDeArchivo("cadenas.txt")));

    }

    private static String[] leerCadenaDeArchivo(String s) throws IOException {
        List<String> salida = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(s))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] nuevas = linea.split("\\*");
                for (String nueva :
                        nuevas) {
                    salida.add(nueva);
                }
            }
        }
        String[] salidaFinal = new String[salida.size()];
        for (int i = 0; i < salida.size(); i++) {
            salidaFinal[i] = salida.get(i);
        }
        return salidaFinal;
        /*
        List<String> lineas=Files.readAllLines(Paths.get(s));
        List<String> salida=new ArrayList<>();
        for (String linea :
                lineas) {
            salida.addAll(Arrays.asList(linea.split("\\*")));
        }

        String[] salidaFinal= new String[salida.size()];
        for (int i = 0; i < salida.size(); i++) {
            salidaFinal[i]=salida.get(i);
        }
        */
    }
}

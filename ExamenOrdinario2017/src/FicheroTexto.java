import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FicheroTexto {
    public static void main(String[] args) {
        String ficheroEntrada = "datos.txt";
        String ficheroSalida = "salida.txt";
//A rellenar
        int maximo1 = Integer.MIN_VALUE;
        int maximo2 = Integer.MIN_VALUE;
        try (BufferedReader br = new BufferedReader(new FileReader(ficheroEntrada))) {
            String linea = null;
            while ((linea = br.readLine()) != null) {
                int nuevo = Integer.parseInt(linea);
                if (nuevo > maximo1) {
                    maximo2 = maximo1;
                    maximo1 = nuevo;
                } else if (nuevo > maximo2) {
                    maximo2 = nuevo;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroSalida))) {
            bw.write("" + maximo1);
            bw.newLine();
            bw.write("" + maximo2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ficheros Pequeños
//        try {
//            List<String> lineas=Files.readAllLines(Paths.get(ficheroEntrada));
//            List<Integer> numeros=new ArrayList<>();
//            for (String s:
//                lineas) {
//                numeros.add(Integer.parseInt(s));
//            }
//            Collections.sort(numeros);
//            List<String> maximos=new ArrayList<>();
//            maximos.add(""+numeros.get(numeros.size()-1));
//            maximos.add(""+numeros.get(numeros.size()-2));
//            Files.write(Paths.get(ficheroSalida),maximos);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

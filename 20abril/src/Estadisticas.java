import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Estadisticas {
    public static final int MAXIMO_POR_DEFECTO = 5;

    public static void main(String[] args) throws IOException {
        int maximo = MAXIMO_POR_DEFECTO;
        if (args.length > 0) {
            try {
                maximo = Integer.parseInt(args[0]);
            } catch (NumberFormatException nfe) {
                System.out.println("USO ERRONEO, PON UN NÚMERO (5 si no pones nada)");
            }
        }
        int[] contadorLongitudes = new int[maximo + 1];
        List<String> lineas = Files.readAllLines(Paths.get("enunciado.txt"));
        for (String s :
                lineas) {
            String limpia = s.trim();
            String[] palabras = s.split(" ");
            for (String palabra :
                    palabras) {
//                System.out.println(palabra);
                if (palabra.length() >= maximo) {
                    contadorLongitudes[maximo] = contadorLongitudes[maximo] + 1;
                } else {
                    contadorLongitudes[palabra.length()] = contadorLongitudes[palabra.length()] + 1;
                }
            }
        }
        for (int i = 1; i < contadorLongitudes.length - 1; i++) {
            System.out.println("Con " + i + " letras hay: " + contadorLongitudes[i] + " palabras");
        }
        System.out.println("Con " + (contadorLongitudes.length - 1) + " o más letras hay: " + contadorLongitudes[contadorLongitudes.length - 1] + " palabras");

    }
}



import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static java.util.stream.Collectors.joining;

public class NumerarLineas {
    public static void main(String[] args) throws IOException {
//        try(
//                BufferedReader br=new BufferedReader(new FileReader("poemaCuervos"));
//                BufferedWriter bw=new BufferedWriter(new FileWriter("poemaLineas"));
//        ){
//            String linea;
//            int numeroLinea=1;
//            while((linea=br.readLine())!=null) {
//                linea=linea.trim();
//                if(!linea.equals("")) {
//                    System.out.println(linea);
//                    bw.write(String.format("%3d - ",numeroLinea++)+linea);
//                    bw.newLine();
//                }
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("No encontrado el fichero");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        List<String> nombres = new ArrayList<>();

        //Ejemplo de lo mismo en Java 8
        final int[] linea = {1};
        try (
                PrintWriter bw = new PrintWriter(new FileWriter("poemaLineas"));
        ) {
            bw.write(
                    Files.lines(Paths.get("poemaCuervos"))
                            .map(String::trim)
                            .filter(str -> !str.isEmpty())
                            .map(s -> format("%3d - ", linea[0]++) + s)
                            .collect(joining("\n")
                            ));

        } catch (IOException e) {
            System.out.println("MAL");
        }
    }
}

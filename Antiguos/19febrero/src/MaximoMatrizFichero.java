import javafx.print.Printer;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MaximoMatrizFichero {
    public static void main(String[] args) throws IOException {
        List<String> lineas= Files.readAllLines(Paths.get("matriz"));

//        System.out.println(lineas);
        Iterator<String> iterator=lineas.iterator();
        String dimensiones=iterator.next();
        String[] numerosEnCadena=dimensiones.split(" ");
        int filas=Integer.parseInt(numerosEnCadena[0]);
        int columnas=Integer.parseInt(numerosEnCadena[1]);
        System.out.println("Quieres una matriz de " + filas + "x" + columnas);
        int[][] matriz=new int[filas][columnas];
        int numeroFila=0;
        while(iterator.hasNext()){
            int numeroColumna=0;
            String[] numerosTexto=iterator.next().split(" ");
            for (String s :
                    numerosTexto) {
                matriz[numeroFila][numeroColumna++]=Integer.parseInt(s);
            }
            numeroFila++;
            System.out.println(numeroFila);
        }
//        for (int i = 0; i < filas; i++) {
//            String filaactual=iterator.next();
//            System.out.println(filaactual);
//            String[] numerosEscritos=filaactual.split(" ");
//            for (int j = 0; j < numerosEscritos.length; j++) {
//                matriz[i][j]=Integer.parseInt(numerosEscritos[j]);
//            }
//        }
        System.out.println(Arrays.deepToString(matriz));
        int maximo=Integer.MIN_VALUE;
        for (int[] fila :
                matriz) {
            for (int numero :
                    fila) {
                maximo=Math.max(numero,maximo);
            }
        }
        System.out.println("El maximo es " + maximo);

    }
}

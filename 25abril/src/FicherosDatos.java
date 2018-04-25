import java.io.*;
import java.util.Arrays;

public class FicherosDatos {
    public static void main(String[] args) throws IOException {
        String[][] matriz = {
                {"Juan", "García", "López"},
                {"Ana", "García", "López"},
                {"Bea", "García", "Gutiérrez"},
        };
        try (DataOutputStream dos =
                     new DataOutputStream(
                             new FileOutputStream("25abril/datos.dat"))) {
            dos.writeInt(matriz.length);
            dos.writeInt(matriz[0].length);
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    dos.writeUTF(matriz[i][j]);
                }
            }
        }


        try (DataInputStream dis =
                     new DataInputStream(
                             new FileInputStream("25abril/datos.dat"))) {

            String[][] nueva = new String[dis.readInt()][dis.readInt()];
            for (int i = 0; i < nueva.length; i++) {
                for (int j = 0; j < nueva[i].length; j++) {
                    nueva[i][j] = dis.readUTF();
                }
            }
            System.out.println(Arrays.deepToString(nueva));
        }
        //Leer el primer apellido de la tercera persona y ponerlo en mayúsculas con Sr. delante
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicherosAleatorios {
    final static int TAMANYO_STRING = 20;

    public static void main(String[] args) throws IOException {
        String[][] matriz = {
                {"Juan", "García", "López"},
                {"Ana", "García", "López"},
                {"Bea", "García", "Gutiérrez"},
        };
        File fichero = new File("25abril/random.dat");
        if (fichero.exists()) {
            fichero.delete();
        }
        try (RandomAccessFile raf = new RandomAccessFile("25abril/random.dat", "rw")) {
            raf.writeInt(matriz.length);
            raf.writeInt(matriz[0].length);
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    int posicion = 8 + (TAMANYO_STRING * j) + (matriz.length * i * TAMANYO_STRING);
                    System.out.println(posicion);
                    raf.seek(posicion);
                    raf.writeUTF(matriz[i][j]);
                }
            }
        }
        //Leer el primer apellido de la tercera persona y ponerlo en mayúsculas con Sr. delante
        try (RandomAccessFile raf = new RandomAccessFile("25abril/random.dat", "rw")) {
            int posicion = 8 + (TAMANYO_STRING * 1) + (matriz.length * 2 * TAMANYO_STRING);
            raf.seek(posicion);
            String apellido = raf.readUTF();
            System.out.println(apellido);
            raf.seek(posicion);
            raf.writeUTF("Sra. " + apellido.toUpperCase());
        }
    }
}

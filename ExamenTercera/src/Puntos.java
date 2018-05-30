import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Puntos {
    public static void main(String[] args) throws IOException {
        List<String> lista = new ArrayList<>();
        System.out.println(String.join(" - ", lista));
    }

    private static void punto(int posicion, int x, int y) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile("puntos.dat", "rw")) {
            raf.seek(posicion * 8);
            raf.writeInt(x);
            raf.writeInt(y);
        }
    }
}


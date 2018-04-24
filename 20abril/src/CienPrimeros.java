import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CienPrimeros {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("enteros.txt"))) {
            StringBuffer salida = new StringBuffer(); //String salida="";
            for (int i = 0; i < 100; i++) {
                salida.append(i);     //String salida+=i+"\n";
                salida.append("\n");
            }
            bw.write(salida.toString());
            bw.newLine();
        }
    }
}

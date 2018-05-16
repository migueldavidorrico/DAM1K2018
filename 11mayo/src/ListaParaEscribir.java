import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaParaEscribir {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("RE");
        palabras.add("REDFJK");
        palabras.add("GWERRE");
        palabras.add("YTRERE");
        palabras.add("NHGFRE");
        palabras.add("NGFRE");
        palabras.add("MJHGTRE");
        System.out.println(Arrays.deepToString(palabras.toArray()));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("p.obj")))) {
            oos.writeObject(palabras);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> otrasPalabras = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("p.obj")))) {
            otrasPalabras = (List<String>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.deepToString(otrasPalabras.toArray()));
    }
}

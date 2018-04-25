import java.io.*;
import java.util.Arrays;

public class FicherosObjetos {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String[][] matriz = {
                {"Juan", "García", "López"},
                {"Ana", "García", "López"},
                {"Bea", "García", "Gutiérrez"},
        };
        //Crea arbol XML raiz --> Personas, nombn
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("25abril/objetos.dat"))) {
            oos.writeObject(matriz);
        }
        String[][] nueva = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("25abril/objetos.dat"))) {
            nueva = (String[][]) ois.readObject();
        }
        System.out.println(Arrays.deepToString(nueva));
    }
}

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PalabraAleatoria {
    Map<String, Integer> listaPalabras = new HashMap<>();
    File fichero = new File("palabras.mot");

    PalabraAleatoria() {
        if (!fichero.exists()) {
            try {
                List<String> leidas = Files.readAllLines(Paths.get("palabrasMuestra"));
                for (String s :
                        leidas) {
                    listaPalabras.put(s, 0);
                }
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
                    oos.writeObject(listaPalabras);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
                listaPalabras = (Map<String, Integer>) ois.readObject();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public String muestraLista() {
        String salida = "";
        for (Map.Entry<String, Integer> entrada :
                listaPalabras.entrySet()) {
            salida += String.format("%2d - %20s\n", entrada.getValue(), entrada.getKey());
        }
        return salida;
    }

    public static void main(String[] args) {
        PalabraAleatoria palabraAleatoria = new PalabraAleatoria();
        System.out.println(palabraAleatoria.muestraLista());
        System.out.println(palabraAleatoria.obtenerPalabra());
    }

    public String obtenerPalabra() {
        List<String> palabras = new ArrayList<>(listaPalabras.keySet());
        String elegida = palabras.get((int) (Math.random() * palabras.size()));
        listaPalabras.put(elegida, listaPalabras.get(elegida) + 1);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(listaPalabras);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return elegida;
    }
}

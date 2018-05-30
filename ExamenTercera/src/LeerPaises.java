import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LeerPaises {
    public static void main(String[] args) {
        Map<String, List<String>> paises;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("salida.obj")))) {
            paises = (Map<String, List<String>>) ois.readObject();
            System.out.println(paises.size());
            for (Map.Entry<String, List<String>> entrada : paises.entrySet()) {
                System.out.println(entrada.getKey() + " " + entrada.getValue());
            }
            Iterator<String> it = paises.keySet().iterator();
            while (it.hasNext()) {
                String clave = it.next();
                System.out.println("Clave: " + clave + " valor:" + paises.get(clave));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

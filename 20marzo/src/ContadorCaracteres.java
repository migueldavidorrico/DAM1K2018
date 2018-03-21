import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContadorCaracteres {
    public static void main(String[] args) {
        String objetivo = "El perro de San Roque no Tiene Rabo";
        Map<Character, Integer> apariciones = new TreeMap<>();
        for (int i = 0; i < objetivo.length(); i++) {
            char actual = objetivo.charAt(i);
            if (apariciones.containsKey(actual)) {
                int veces = apariciones.get(actual);
                apariciones.put(actual, veces + 1);
            } else {
                apariciones.put(objetivo.charAt(i), 1);
            }
        }
        System.out.println(apariciones);
    }
}

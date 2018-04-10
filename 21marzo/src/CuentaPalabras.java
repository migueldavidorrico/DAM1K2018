import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CuentaPalabras {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList(
                "hola", "que", "hola"
        );
        Map<String, Integer> cuenta = new TreeMap<>();
        for (String s :
                lista) {
            if (!cuenta.containsKey(s)) {
                cuenta.put(s, 1);
            } else {
                int cuantasVeces = cuenta.get(s);
                cuenta.put(s, cuantasVeces + 1);
            }
        }
    }
}

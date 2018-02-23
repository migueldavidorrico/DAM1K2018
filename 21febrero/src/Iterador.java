import java.util.*;

public class Iterador {
    public static void main(String[] args) {
        List<String> cadenas = new ArrayList<>();
        cadenas.add("Ana");
        cadenas.add("Bea");
        cadenas.add("Clara");
        cadenas.add("Delia");

        System.out.println(cadenas);
        Iterator<String> iterator = cadenas.iterator();
        iterator.next();
        iterator.next();
        iterator.remove();

        System.out.println(cadenas);

    }
}

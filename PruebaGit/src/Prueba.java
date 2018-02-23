import java.util.*;

public class Prueba {
    public static void main(String[] args) {
        List<Boolean> boo = Arrays.asList(true, false, true);

        List<Integer> lista = new ArrayList<>();
        Map<List<Integer>, Set<List<String>>> lio;
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);

        System.out.println(lista);
        lista.set(1, 546);
        System.out.println(lista);
        lista.add(1, 2);
        System.out.println(lista);
    }
}

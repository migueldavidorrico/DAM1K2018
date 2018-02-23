import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorCompartido {
    static Iterator<Integer> iterator;

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(4, 3, 2, 34, 45, 5, 34);
        iterator = lista.iterator();
        duplica(lista, 3);
        iterator = lista.iterator();
        invierteRestantes(lista);
    }

    private static void invierteRestantes(List<Integer> lista) {
        while (iterator.hasNext()) {
            System.out.println(-1 * iterator.next());
        }
    }

    private static void duplica(List<Integer> lista, int i) {
        for (int j = 0; j < i; j++) {
            int actual = iterator.next();
            System.out.println(actual * 2);
        }
    }
}

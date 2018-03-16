import java.util.*;

public class Prioridad {
    public static void main(String[] args) {
        Deque<String> pila = new LinkedList<>();
        Queue<Integer> cola = new ArrayDeque<>();

        PriorityQueue<String> cadenas = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        cadenas.add("ZXZZZ");
        cadenas.add("AX");
        cadenas.add("CXZZZ");
        cadenas.add("DXZ");
        System.out.println(cadenas);
        while (!cadenas.isEmpty()) {
            System.out.println(cadenas.poll());
        }

    }
}

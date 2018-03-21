import java.util.*;

public class PruebaSet {
    public static void main(String[] args) {
        Set<Integer> valores = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * Integer.compare(o1, o2);
            }
        });
        valores.add(87);
        valores.add(8);
        valores.add(-4);
        valores.add(3);
        valores.add(5);
        valores.add(5);
        System.out.println(valores);
        Iterator iterator = valores.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

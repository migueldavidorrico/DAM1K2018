import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarNegativos {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(32);
        lista.add(31);
        lista.add(32);
        lista.add(33);
        lista.add(32);
        lista.add(45);
        lista.add(32);
        lista.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 3 == 0) {
                    return -1;
                }
                return o1.compareTo(o2);
            }
        });
        System.out.println(lista);
    }
}

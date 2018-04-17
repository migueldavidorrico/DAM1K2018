import java.util.Arrays;
import java.util.List;

public class EncontrarElimpar {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(2, 3, 4, 2, 4, 5, 57834, 9, 3, 1, 9, 1);
        int solucion = 0;
        for (Integer i :
                lista) {
            solucion = solucion ^ i;
        }
        System.out.println(solucion);
    }
}

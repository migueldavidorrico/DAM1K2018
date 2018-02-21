import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ImprimeLista {
    public static void main(String[] args) {
        List<Integer> lista= Arrays.asList(3,4,5,3,2);
        imprimeLista(lista);
        lista=devuelveTresPrimerosPares();
    }

    private static List<Integer> devuelveTresPrimerosPares() {
        List<Integer> salida=new ArrayList<>();
        salida.add(2);
        salida.add(4);
        salida.add(6);
        return salida;
    }

    private static void imprimeLista(List<Integer> lista) {
        ListIterator<Integer> listIterator=lista.listIterator();

    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej14y15 {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista.add(i);
        }
        List<Integer> temporal=new ArrayList<>();
        Iterator<Integer> iterador=lista.iterator();
        while(iterador.hasNext()){
            Integer actual=iterador.next();
            temporal.add(actual*actual);
        }
        lista=temporal;
        System.out.println(temporal);
    }
}

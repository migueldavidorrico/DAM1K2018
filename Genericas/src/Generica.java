import java.util.Iterator;
import java.util.List;

public class Generica<T> {
    public void imprimePares(List<T> lista) {
        Iterator<T> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            it.next();
        }
    }

}

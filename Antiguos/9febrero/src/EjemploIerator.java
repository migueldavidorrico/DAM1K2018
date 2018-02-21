import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EjemploIerator {
    public static void main(String[] args) {
        List<Double> temperaturas=new ArrayList<>(Arrays.asList(0.5,0.6,0.4,54.32));
        System.out.println(temperaturas);
        System.out.println(temperaturas.get(2));
        Iterator<Double> iterador=temperaturas.iterator();
        while(iterador.hasNext()){
            Double actual=iterador.next();
            actual=Double.valueOf("4");
        }
        System.out.println(temperaturas);

    }
}

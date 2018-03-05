import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorString {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Ana");
        palabras.add("Ana");
        palabras.add("Ana");
        palabras.add("Bea");
        palabras.add("Clara");
        palabras.add("Delia");
        palabras.add("Elena");
        palabras.add("Flori");
        System.out.println(palabras);
        Iterator<String> miIterador = palabras.iterator();
        while (miIterador.hasNext()) {
            if (miIterador.next().equals("Delia")) {
                miIterador.remove();
            }
        }
        System.out.println(palabras);
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(5);
        numeros.add(8);
        numeros.add(-12);
        numeros.add(0);
        numeros.add(54);
        numeros.add(55);
        List<Integer> pares = new ArrayList<>();
        Iterator<Integer> otroIterador = numeros.iterator();
        while (otroIterador.hasNext()) {
            Integer i = otroIterador.next();
            if (i % 2 == 0) {
                pares.add(i);
                otroIterador.remove();
            }
        }
        System.out.println(numeros);
        System.out.println(pares);
    }
}

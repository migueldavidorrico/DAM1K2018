import java.util.*;

/* Escriba un método que recibe como argumentos 2 listas de enteros,
a1 y a2. Los datos de estas listas están ordenados y no contienen elementos
duplicados. El método debe devolver otra lista, que contenga todos los
elementos de a1 y todos los elementos de a2, ordenados y sin duplicados.
        Ejemplo
        a1 = [ -30, 10, 13, 77 ]
        a2 = [ 0, 10, 20 ]
        resultado = [ -30, 0, 10, 13, 20, 77 ]
*/
public class Ej23 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(-30, 10, 13, 77, 99, 345, 654, 765, 8756);
        List<Integer> lista2 = Arrays.asList(0, 10, 20, 40, 67, 87, 102, 156);
        List<Integer> temporal = new ArrayList<>();
        Iterator<Integer> itPrimera = lista1.iterator();
        Iterator<Integer> itSegunda = lista2.iterator();
        ListIterator<Integer> oo = lista1.listIterator();
        Set<Integer> conjunto = new HashSet<>();
        Iterator<Integer> iterator = conjunto.iterator();

        Integer primero = itPrimera.next();
        Integer segundo = itSegunda.next();
        try {
            while (true) {
                if (primero > segundo) {
                    temporal.add(segundo);
                    segundo = itSegunda.next();
                } else if (primero < segundo) {
                    temporal.add(primero);
                    primero = itPrimera.next();
                } else {
                    temporal.add(primero);
                    primero = itPrimera.next();
                    segundo = itSegunda.next();
                }
            }
        } catch (Exception e) {
//            System.out.println("Salir");
        }

        System.out.println(temporal);
        Iterator<Integer> dummy;
        if (!itPrimera.hasNext()) {
            System.out.println("resto de la dos");
            dummy = itSegunda;
        } else {
            System.out.println("Resto de la uno");
            dummy = itPrimera;
        }
        while (dummy.hasNext()) {
            temporal.add(dummy.next());
        }
        System.out.println(temporal);
    }
}

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
        List<Integer> lista1 = Arrays.asList(0,1,2,3,4,7,8,9,12,13,14,15,16,17);
        List<Integer> lista2 = Arrays.asList(0, 4,5,6,7,9,10,11);
        List<Integer> temporal = new ArrayList<>();
        Iterator<Integer> itPrimera = lista1.iterator();
        Iterator<Integer> itSegunda = lista2.iterator();

        Integer primero = itPrimera.next();
        Integer segundo = itSegunda.next();
        while (itPrimera.hasNext() && itSegunda.hasNext()) {
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
            System.out.println(temporal);
        }
        if (primero > segundo) {
            temporal.add(segundo);
            temporal.add(primero);
        } else if (primero < segundo) {
            temporal.add(primero);
            temporal.add(segundo);
        } else {
            temporal.add(primero);
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

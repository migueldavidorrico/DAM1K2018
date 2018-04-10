import java.util.*;

public class SetyMap {
    public static void main(String[] args) {
        //Dicho pronto y mal, un set es como un arraylist sin duplicados
//        Set<Integer> conjunto = new TreeSet<>(); //Conjunto con orden interno,
//         al recorrer, devuelve en orden
//        Set<Integer> conjunto = new LinkedHashSet<>();
        //al recorrer, devuelve en orden de insercion
        Set<Integer> conjunto = new HashSet<>();
        //no asegura orden
        conjunto.size();
        conjunto.add(32);
        conjunto.add(48);
        conjunto.add(32);
        conjunto.contains(32);
        for (Integer i :
                conjunto) {
            System.out.println(i);
        }
        conjunto.remove(32);
        Iterator<Integer> it = conjunto.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Map --> Parejas de clave, valor; clave es un objeto y valor es un objeto
//        Número de veces de cada letra en una frase
//        Map<Character,Integer> apariciones=new TreeMap<>();
        //Al recorrerlo, lo devuelve con un orden
        Map<Character, Integer> apariciones = new LinkedHashMap<>();
        //Al recorrerlo, lo devuelve por orden de insercion
//        Map<Character,Integer> apariciones=new HashMap<>();
        //Al recorrerlo, lo devuelve sin orden
        apariciones.put('a', 5);
        apariciones.put('e', 8);
        apariciones.put('a', 102);
        apariciones.put('r', null);
//        System.out.println(apariciones.containsKey('e'));
//        System.out.println(apariciones.get('e'));
//        System.out.println(apariciones.get('a'));
//        System.out.println(apariciones.containsValue(102));
//        System.out.println(apariciones.values());
//        System.out.println(apariciones.keySet());
        //Forma no del todo correcta de recorrer un Map
        for (Character c :
                apariciones.keySet()) {
            System.out.println(c + " - " + apariciones.get(c));
        }
        //Forma correcta
        Set parejas = apariciones.entrySet();
        System.out.println(parejas);
        for (Map.Entry pareja : apariciones.entrySet()
                ) {
            System.out.println(pareja.getKey() + " - " + pareja.getValue());
        }
        apariciones.clear();
//        Recorrer la frase: para cada caracter
//                Si ya está sumar uno a lo que tenga
//                Si no está, ponerlo con un uno
        String frase = "aaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbcaabbbeb";
        for (int i = 0; i < frase.length(); i++) {
            Character actual = frase.charAt(i);
            if (apariciones.containsKey(actual)) {
                Integer anteriores = apariciones.get(actual);
                apariciones.replace(actual, anteriores + 1);
            } else {
                apariciones.put(actual, 1);
            }
        }
        for (Map.Entry pareja : apariciones.entrySet()
                ) {
            System.out.println(pareja.getKey() + " - " + pareja.getValue());
        }
    }
}

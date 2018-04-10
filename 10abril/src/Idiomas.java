import java.util.*;

public class Idiomas {
    public static void main(String[] args) {
        Map<String, Set<String>> listado = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String nombre = sc.nextLine();
            String idioma = sc.nextLine();
            if (listado.containsKey(nombre)) {
                Set loQueTenia = listado.get(nombre);
                loQueTenia.add(idioma);
            } else {
                Set listaIdiomas = new HashSet();
                listado.put(nombre, listaIdiomas);
                listaIdiomas.add(idioma);
            }
        }
        for (Map.Entry persona :
                listado.entrySet()) {
            System.out.println(persona.getKey() + " Habla " + persona.getValue());
        }


    }
}
//pepe, inglés, español y catalán
//Juan, alemán, gallego y georgiano
//Ana, inglés y Alemán
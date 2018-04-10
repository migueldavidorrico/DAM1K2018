import java.util.*;

public class MapPelis {
    public static void main(String[] args) {
        Map<String, Set<String>> Pelis = new HashMap<>();
        /////////
        String nombre1 = "300";
        String et1 = "bélica";
        String et2 = "grecia";
        String et3 = "esparta";
        if (!Pelis.containsKey(nombre1)) {
            Pelis.put(nombre1, new HashSet<>());
        }
        Set<String> listaEtiquetas = Pelis.get(nombre1);
        listaEtiquetas.add(et1);
        listaEtiquetas.add(et2);
        listaEtiquetas.add(et3);
        System.out.println(Pelis);
        String nombre2 = "Dunkerke";
        String et22 = "wwii";
        String et21 = "bélica";
        String et23 = "histórica";
        if (!Pelis.containsKey(nombre2)) {
            Pelis.put(nombre2, new HashSet<>());
        }
        listaEtiquetas = Pelis.get(nombre2);
        listaEtiquetas.add(et22);
        listaEtiquetas.add(et21);
        listaEtiquetas.add(et23);
        System.out.println(Pelis);

        Set<String> todasEt = new TreeSet<>();
        for (Map.Entry<String, Set<String>> entrada :
                Pelis.entrySet()) {
            todasEt.addAll(entrada.getValue());
        }
        System.out.println(todasEt);


    }
}

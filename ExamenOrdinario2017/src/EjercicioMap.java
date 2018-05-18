import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class EjercicioMap {
    public static void main(String[] args) {
        Set<String> peliculas = new TreeSet<>();
        peliculas.add("Star Wars - Un Jedi se pelea con el malo y le gana.");
        peliculas.add("La momia - Una momia egipcia revive pero es derrotada");
        peliculas.add("La momia - Una momia egipcia revive pero es derrotada");
        peliculas.add("La momia - Una momia egipcia revive pero es derrotada");
        peliculas.add("Wonder Woman - La historia de esa superheroina");
        peliculas.add("Alien - Una nave descubre un extraterreste malvado. Lo matan");
        peliculas.add("Cars - Coches animados corren en carreras");
        System.out.println(listado(peliculas, 3));
    }

    private static String listado(Set<String> peliculas, int i) {
        String salida = "";
        Iterator<String> iterador = peliculas.iterator();
        for (int j = 0; j < i; j++) {
            salida += iterador.next() + "\n";
        }
        return salida;
    }
//Definición del método listado. A rellenar.
}
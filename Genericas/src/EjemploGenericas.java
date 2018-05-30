import java.util.ArrayList;
import java.util.List;

public class EjemploGenericas {


    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("pepe");
        lista.add("Juan");
        lista.add("ana");
        lista.add("Bea");
        new Generica<String>().imprimePares(lista);
        List<Integer> listaI = new ArrayList<>();
        listaI.add(32);
        listaI.add(5);
        listaI.add(3);
        listaI.add(8);
        new Generica<Integer>().imprimePares(listaI);


    }
}

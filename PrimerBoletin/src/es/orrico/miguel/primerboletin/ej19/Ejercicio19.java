package es.orrico.miguel.primerboletin.ej19;

import java.util.*;

/**
 * Created by Miguel-David Orrico Teruel on 02/03/2018.
 */
public class Ejercicio19 {
    public static List<Integer>
    invertirOrdenGenerandoLista(List<Integer> lista) {
        List<Integer> listaNueva=new ArrayList<>();
        int indice=0;
        for (int i = lista.size()-1; i >=0; i--) {
            listaNueva.add(indice++,lista.get(i));
        }
        return listaNueva;
    }

    public static void reverse(List<Integer> lista) {
        Collections.reverse(lista);
    }

    public static void invertirOrdenReordenando(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, (lista.get(lista.size() - (1 + i))));
        }
    }

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(30, 17, 514, 216, 701,
                0);
        System.out.println(lista);
        System.out.println(invertirOrdenGenerandoLista(lista));
    }
}

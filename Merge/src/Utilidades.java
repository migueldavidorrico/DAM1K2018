
import java.util.*;

/**
 * Created by Miguel-David Orrico Teruel on 28/02/2018.
 */

interface MergeList{
    List<Integer> mergeList(List<Integer> primera, List<Integer> segunda);
}

enum MergeType{
    MERGEWITHGET("Merge using list.get", new MergeList() {
        @Override
        public List<Integer> mergeList(List<Integer> primera, List<Integer> segunda) {
            List<Integer> ordenada=new ArrayList<>();
            int i=0;
            int j=0;
            while (i<primera.size() && j <segunda.size())
            {
                if (primera.get(i) < segunda.get(j))
                    ordenada.add(primera.get(i++));
                else if(primera.get(i)>segunda.get(j)) {
                    ordenada.add(segunda.get(j++));
                } else {
                    ordenada.add(primera.get(i));
                    i++;
                    j++;
                }
            }

            while (i < primera.size())
                ordenada.add(primera.get(i++));

            // Store remaining elements of second array
            while (j < segunda.size())
                ordenada.add(segunda.get(j++));
            return ordenada;
        }
    });
    MergeType(String description,MergeList Algorithm){
        this.description=description;
        this.mergeAlgorithm=Algorithm;
    }

    public MergeList getMergeAlgorithm() {
        return mergeAlgorithm;
    }

    public void setMergeAlgorithm(MergeList mergeAlgorithm) {
        this.mergeAlgorithm = mergeAlgorithm;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    MergeList mergeAlgorithm;
    String description;

}
public class Utilidades {
    public static List<Integer> reuneGet(List<Integer> primera, List<Integer> segunda){
        List<Integer> ordenada=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<primera.size() && j <segunda.size())
        {
            if (primera.get(i) < segunda.get(j))
                ordenada.add(primera.get(i++));
            else if(primera.get(i)>segunda.get(j)) {
                ordenada.add(segunda.get(j++));
            } else {
                ordenada.add(primera.get(i));
                i++;
                j++;
            }
        }

        while (i < primera.size())
            ordenada.add(primera.get(i++));

        // Store remaining elements of second array
        while (j < segunda.size())
            ordenada.add(segunda.get(j++));
        return ordenada;
    }
    public static List<Integer> reuneSet(List<Integer> primera, List<Integer> segunda){
        Set<Integer> conjunto=new TreeSet<>();
        conjunto.addAll(primera);
        conjunto.addAll(segunda);
        return new ArrayList<>(conjunto);
    }
    public static List<Integer> reuneOrdenando(List<Integer> primera, List<Integer> segunda) {
        List<Integer> ordenada = new ArrayList<>();
        for (int n : primera
                ) {
            ordenada.add(n);
        }
        for (int n : segunda
                ) {
            ordenada.add(n);
        }
        Collections.sort(ordenada);
//        System.out.println(ordenada);
        for (int i = 0; i < ordenada.size() - 1; i++) {
            if (ordenada.get(i).equals(ordenada.get(i + 1))) {
                ordenada.remove(i);
            }
        }
        return ordenada;
    }

    public static List<Integer> reune(List<Integer> primera, List<Integer> segunda) {
        List<Integer> temporal = new ArrayList<>();
        Iterator<Integer> itPrimera = primera.iterator();
        Iterator<Integer> itSegunda = segunda.iterator();

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

        }
        //primero o segundo tienen el último número de una lista
        //Caso especial: Las dos listas tienen el mismo número de elementos:
        if(!itPrimera.hasNext() && !itSegunda.hasNext()) {
            if (primero > segundo) {
                temporal.add(segundo);
                temporal.add(primero);
            } else if (primero < segundo) {
                temporal.add(primero);
                temporal.add(segundo);
            } else {
                temporal.add(primero);
            }
            return temporal;
        }
        //Caso general:Una lista es más larga: Añadimos de la más larga hasta que el número
        //sea mayor que el que quedó, después el que quedó y después toda la lista
        Iterator<Integer> itCorta;
        Iterator<Integer> itLarga;
        Integer ultimoCorta;
        Integer ultimoLarga;
        if(itPrimera.hasNext()){
            itCorta=itSegunda;
            itLarga=itPrimera;
            ultimoCorta=segundo;
            ultimoLarga=primero;
        } else {
            itCorta=itPrimera;
            itLarga=itSegunda;
            ultimoCorta=primero;
            ultimoLarga=segundo;
        }
        while(ultimoLarga<ultimoCorta && itLarga.hasNext()){
            temporal.add(ultimoLarga);
            ultimoLarga=itLarga.next();
        }
        if(ultimoCorta<ultimoLarga) {
            temporal.add(ultimoCorta);
            temporal.add(ultimoLarga);
        } else if(ultimoCorta>ultimoLarga){
            temporal.add(ultimoLarga);
            temporal.add(ultimoCorta);
        } else {
            temporal.add(ultimoCorta);
        }
        while(itLarga.hasNext()){
            temporal.add(itLarga.next());

        }

        return temporal;
    }
    public static List<Integer> listaNumeros(int n){
        List<Integer> salida=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            salida.add(i);
        }
        return salida;
    }
    public static boolean compruebaTodos(List<Integer> lista,int n){
        for (int i = 0; i < n; i++) {
            if(lista.get(i)!=i){
                return false;
            }
        }
        return true;
    }
    public static void reparteLista(List<Integer> original,List<Integer> primera,List<Integer> segunda){
        primera.clear();
        segunda.clear();
        Random r=new Random();
        for (Integer n:
             original) {
            if(r.nextDouble()<0.3){
                primera.add(n);
            } else if(r.nextDouble()<0.8){
                segunda.add(n);
            } else {
                primera.add(n);
                segunda.add(n);
            }
        }
    }

    public static void main(String[] args) {
        int NUMEROS=500000;
        int VECES=20;
        List<Integer> primera=new ArrayList<>();
        List<Integer> segunda=new ArrayList<>();
        int tiempoTotal=0;
        for(int i=0;i<VECES;i++) {
            reparteLista(listaNumeros(NUMEROS), primera, segunda);
            long time_start, time_end;
            time_start = System.currentTimeMillis();
            List<Integer> resultado = reune(primera, segunda);
            time_end = System.currentTimeMillis();
            tiempoTotal+=( time_end - time_start );
            System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");

            if (!compruebaTodos(resultado, NUMEROS)) {
                System.out.println("         ---------------------------------");
                System.out.println(primera);
                System.out.println(segunda);
                System.out.println(resultado);
            }
        }
        System.out.println("La media han sido " + tiempoTotal / VECES + " milisegundos");
    }
}

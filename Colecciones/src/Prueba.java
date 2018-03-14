import java.util.*;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("Hola, Mundo");
        List<String> lista=new ArrayList<>();
        lista.add("Uno");
        lista.add(0,"Cero");
        lista.contains("Tres");
        lista.get(1);
        lista.indexOf("Cero");
        lista.remove(0);
        lista.remove("Uno");
        lista.set(0,"Cuatro");
        lista.size();
        lista.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        });
        Collections.sort(lista);
        Iterator<String> iterator=lista.iterator();
        while(iterator.hasNext()){
            String actual=iterator.next();
            if(actual.length()==0){
                iterator.remove();
            }
        }
    }

}

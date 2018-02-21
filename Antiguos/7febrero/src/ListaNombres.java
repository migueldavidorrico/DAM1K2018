import java.text.Collator;
import java.util.*;

public class ListaNombres {
    public static void main(String[] args) {
        List<String> lista=new ArrayList<>();
        lista.add("Ana");
        lista.add(1,"Bea");
//        lista.add(4,"Bea");
        lista.add(0,"Clara");
        lista.add("Delia");
        System.out.println(lista.toString());
        lista.set(0,"Otra Clara");
        System.out.println(lista.toString());
        lista.remove("Bea");
        System.out.println(lista.toString());
        System.out.println("¿Tiene a Flori?"+lista.contains("Flori"));
        System.out.println(lista.get(2));
        System.out.println(lista.indexOf("Ana"));
        System.out.println(lista.lastIndexOf("Ana"));
        System.out.println(lista.indexOf("Flori"));
        ArrayList<String> listaApellidos=new ArrayList<>();
        listaApellidos.add("Gómez");
        listaApellidos.add("Ángulez");
        listaApellidos.add("Antúnez");
        listaApellidos.add("Lómez");
        listaApellidos.add("Pómez");
        listaApellidos.add("Tómez");
        System.out.println(listaApellidos);
        lista.addAll(1,listaApellidos);
        System.out.println(lista);
        Collator bueno=Collator.getInstance(new Locale("es"));
        lista.sort(bueno);
        System.out.println(lista);
//        listaApellidos.set(5,new Integer(346));
        String aux1=(String)listaApellidos.get(1);
        String aux2=(String)listaApellidos.get(5);
        listaApellidos.set(1,aux2);
        listaApellidos.set(5,aux1);
        System.out.println(listaApellidos);
        for (String cadena :
                lista) {
            System.out.println(cadena.toUpperCase());
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toUpperCase());
        }

    }
}

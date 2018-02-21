import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Colecciones {
    public static void main(String[] args) {
        ArrayList<Integer> lista= new ArrayList<>();
        lista.add(1);
        lista.add(254);
        lista.add(3);
        lista.add(665);
        lista.add(234);
        lista.add(23);
        System.out.println(lista.toString());
        lista.add(2,56);
        System.out.println(lista.toString());
//        lista.clear();
//        System.out.println(lista.toString());
        System.out.println(lista.contains(56));
        System.out.println(lista.get(2));
        System.out.println(lista.indexOf(56));

        lista.remove(Integer.valueOf(56));
        System.out.println(lista.toString());
        lista.indexOf(65);
        System.out.println(lista.toString());
        lista.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a=o1;
                int b=o2;
                if((a%2==0 && b%2!=0)||(a%2!=0 && b%2==0)){
                    return (-1)*o1.compareTo(o2);
                }
                return o1.compareTo(o2);
            }
        });
        System.out.println(lista.toString());


    }
}

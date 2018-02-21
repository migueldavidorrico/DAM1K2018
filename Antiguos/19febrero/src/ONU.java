import java.util.*;

public class ONU {
    public static void main(String[] args) {
        List<Pais> onu= Arrays.asList(
                new Pais("España",50,20),
                new Pais("Portugal",40,10),
                new Pais("Francia",3,20),
                new Pais("Canada",56,70),
                new Pais("Laos",45,15)
        );
        onu.get(0).addIdioma("Español");
        onu.get(0).addIdioma("Catalán");
        onu.get(0).addIdioma("Euskera");
        onu.get(0).addIdioma("Gallego");
        onu.get(3).addIdioma("Inglés");
        onu.get(3).addIdioma("Francés");
        onu.get(3).addIdioma("Esquimal");
        Iterator<Pais> paises=onu.iterator();
        while(paises.hasNext()){
            Pais p=paises.next();
            p.addIdioma("Esperanto");
        }
        System.out.println(onu);
        Collections.sort(onu);
        System.out.println(onu);
        Collections.sort(onu, new Comparator<Pais>() {
            @Override
            public int compare(Pais o1, Pais o2) {
                if(o1.getIdiomas().size()!=o2.getIdiomas().size()){
                    return -1*Integer.compare(o1.getIdiomas().size(),o2.getIdiomas().size());
                }
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println(onu);


    }
}

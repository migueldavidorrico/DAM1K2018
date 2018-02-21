import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PreparativoCabalgata {
    public static void main(String[] args) {


        Silla buena = new Silla("Enfrente de Centro");
        Silla media = new Silla("Detrás");
        Silla mala = new Silla("Sin visibilidad");
        Coche coche1 = new Coche("GGHH·4343");
        Coche coche2 = new Coche("TYR·4343");
        Coche coche3 = new Coche("MMM·4343");
        List<Alquilable> lista = new ArrayList<>();
        lista.add(buena);
        lista.add(coche1);
        lista.add(mala);
        lista.add(media);
        lista.add(coche3);
        lista.add(coche2);
        System.out.println(lista);
        Alquilable algo=lista.get(2);
        algo.alquilar(LocalDate.of(2001,3,1));
        Alquilable otroalgo=lista.get(4);
        otroalgo.alquilar(LocalDate.of(1999,5,2));
        for (Alquilable a :
                lista) {
            System.out.print(a);
            if(a.estaAlquilado()){
                System.out.println(" PRECIO HASTA AHORA: " + a.gastoActual());
            } else {
                System.out.println("");
            }
        }
    }
}

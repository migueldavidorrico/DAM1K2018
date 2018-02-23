import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumArray {
    public static void main(String[] args) {
        Jugadores[] jugadores = Jugadores.values();

        List<Jugadores> alineacion = new ArrayList<>();
        for (Jugadores j :
                jugadores) {
            alineacion.add(j);
        }
        System.out.println(alineacion);
        alineacion = Arrays.asList(Jugadores.values());
        System.out.println(alineacion);
    }
}

enum Jugadores {
    Pirri, Zara, Butragueño, Pelé
}

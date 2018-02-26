import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    public static void main(String[] args) {
        List<IntegranteSeleccion> integrantes = new ArrayList<>();
        integrantes.add(new Jugador("Pelé"));
        integrantes.add(new Jugador("Maradona"));
        integrantes.add(new Jugador("Rivaldo"));
        integrantes.add(new Entrenador("Zidane"));
        integrantes.add(new Entrenador("Luis Enrique"));
        integrantes.add(new Jugador("Pele"));
        integrantes.add(new Masajista("Paquito"));
        for (IntegranteSeleccion integrante :
                integrantes) {
            integrante.cantarHimno();
        }
        System.out.println("ENTRENO");
        for (IntegranteSeleccion integrante :
                integrantes) {
            if (integrante.getNombre().equals("Maradona")) {
                System.out.println("Maradona no puede ir al entreno");
            } else {
                integrante.vaAlEntrenamiento();
            }
        }
        System.out.println("PARTIDO");
        for (IntegranteSeleccion integrante :
                integrantes) {
            integrante.vaAlpartido();
        }
    }
}

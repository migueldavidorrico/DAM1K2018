import java.io.Serializable;

public class Entrenador extends IntegranteSeleccion implements Serializable {
    public Entrenador(String nombre) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return "Mr. " + this.nombre;
    }

    @Override
    public void cobrar() {
        System.out.println(this.getNombre() + " No cobra demasiado, es entrenador");
    }

    @Override
    public void vaAlpartido() {
        System.out.println(this.getNombre() + "Está en la banda y grita mucho");

    }

    @Override
    public void vaAlEntrenamiento() {
        System.out.println(this.getNombre() + " Se ve los partidos del equipo contrario");
    }
}

import java.time.LocalDate;

public class Silla implements Alquilable{
    String situacion;
    boolean alquilado=false;

    @Override
    public String toString() {
        return "Silla{" +
                "situacion='" + situacion + '\'' +
                ", alquilado=" + alquilado +
                '}';
    }

    public Silla(String situacion) {
        this.situacion = situacion;
    }

    @Override
    public boolean estaAlquilado() {
        return this.alquilado;
    }

    @Override
    public void alquilar(LocalDate fecha) {
        this.alquilado=true;
    }

    @Override
    public void devolver(LocalDate fecha) {
        this.alquilado=false;
    }

    @Override
    public int gastoActual() {
        return 20;
    }
}

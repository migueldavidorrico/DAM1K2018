import java.time.LocalDate;

public interface Alquilable {
    boolean estaAlquilado();
    void alquilar(LocalDate fecha);
    void devolver(LocalDate fecha);
    int gastoActual();
}

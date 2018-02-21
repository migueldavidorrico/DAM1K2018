import java.time.LocalDate;
import java.time.Period;

public class Coche implements Alquilable{
    public static final int PRECIO_DIA=30;
    String matricula;
    boolean alquilado=false;
    LocalDate fechaAlquiler;

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", alquilado=" + alquilado +
                ", fechaAlquiler=" + fechaAlquiler +
                '}';
    }

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean estaAlquilado() {
        return alquilado;
    }

    @Override
    public void alquilar(LocalDate fecha) {
        this.alquilado=true;
        this.fechaAlquiler=fecha;
    }

    @Override
    public void devolver(LocalDate fecha) {
        this.alquilado=false;
    }

    @Override
    public int gastoActual() {
        int dias=Period.between(this.fechaAlquiler,LocalDate.now()).getDays();
        return dias*PRECIO_DIA;
    }
}

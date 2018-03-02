import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Alumno implements Comparable {
    String apellidos;
    String nombre;
    String comportamiento;
    double nota;

    @Override
    public int compareTo(Object o) {
        Alumno otro = (Alumno) o;
        if (otro.apellidos.equals(this.apellidos)) {
            return this.nombre.compareTo(otro.nombre);
        }
        return apellidos.compareTo(otro.apellidos);
    }

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return Double.compare(o1.nota, o2.nota);
            }
        });
    }
}

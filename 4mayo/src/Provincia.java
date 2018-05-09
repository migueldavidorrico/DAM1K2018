import java.io.Serializable;

public class Provincia implements Serializable {
    private final String nombre;
    private final String capital;

    public Provincia(String nombre, String capital) {
        this.nombre = nombre.trim().toUpperCase();
        this.capital = capital.trim().toUpperCase();
    }

    public Provincia(String nombre) {
        this(nombre, nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + capital + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Provincia provincia = (Provincia) o;

        return nombre.equals(provincia.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }
}

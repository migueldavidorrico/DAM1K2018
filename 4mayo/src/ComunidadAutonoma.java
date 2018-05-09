import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ComunidadAutonoma implements Serializable {
    private final String nombre;
    private final List<Provincia> provincias;
    private final String capital;
    int poblacion;
    boolean tieneLitoral;

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void anyadeProvincia(Provincia p) {
        this.provincias.add(p);
    }

    /**
     * Constructor
     *
     * @param nombre
     * @param capital
     * @param poblacion
     * @param tieneLitoral
     */
    public ComunidadAutonoma(String nombre, String capital, int poblacion, boolean tieneLitoral) {
        this.nombre = nombre.trim().toUpperCase();
        this.capital = capital.trim().toUpperCase();
        this.poblacion = poblacion;
        this.tieneLitoral = tieneLitoral;
        this.provincias = new ArrayList<>();
    }

    @Override
    public String toString() {
        String salida = nombre + " -->";
        for (Provincia p :
                this.provincias) {
            salida += p + " ";
        }
        return salida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComunidadAutonoma that = (ComunidadAutonoma) o;

        return nombre != null ? nombre.equals(that.nombre) : that.nombre == null;
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }

    public String getNombre() {
        return nombre;
    }


    public String getCapital() {
        return capital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public boolean isTieneLitoral() {
        return tieneLitoral;
    }

    public void setTieneLitoral(boolean tieneLitoral) {
        this.tieneLitoral = tieneLitoral;
    }

    public static void main(String[] args) {
        ComunidadAutonoma murcia = new ComunidadAutonoma(
                "Murcia",
                "Murcia",
                1_000_000,
                true
        );
        murcia.anyadeProvincia(new Provincia("Murcia", "Murcia"));
        System.out.println(murcia);
        ComunidadAutonoma paisVasco = new ComunidadAutonoma(
                "Pais Vasco",
                "Bilbao",
                3_000_000,
                true
        );
        paisVasco.anyadeProvincia(new Provincia("Alava", "Vitoria"));
        paisVasco.anyadeProvincia(new Provincia("Guipuzcoa", "San Sebastian"));
        paisVasco.anyadeProvincia(new Provincia("Vizcaya", "Bilbao"));
        System.out.println(paisVasco);
    }

    public String cadenaFichero() {
        String salida = "";
        salida += this.nombre + "\n";
        salida += this.capital + "\n";
        salida += this.poblacion + "\n";
        salida += (this.tieneLitoral ? "TIENE LITORAL" : "ES INTERIOR") + "\n";
        salida += "" + this.provincias.size() + "\n";
        for (Provincia provincia :
                this.provincias) {
            salida += provincia.getNombre() + "\n";
            salida += provincia.getCapital() + "\n";
        }
        return salida;
    }
}

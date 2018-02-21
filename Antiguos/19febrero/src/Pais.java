import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Pais implements Comparable<Pais> {
    private final String nombre;
    private int poblacion;
    private int superficie;
    private final List<String> idiomas=new ArrayList<>();

    public Pais(String nombre, int poblacion, int superficie) {
        compruebaDatos(nombre,poblacion,superficie);
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
    }

    private void compruebaDatos(String nombre, int poblacion, int superficie) {
        if(nombre==null) throw new IllegalArgumentException("Nombre vacío");
        if(nombre.equals("")) throw new IllegalArgumentException("Nombre vacío");
        if(poblacion<=0) throw new IllegalArgumentException("Población mal");
        if(superficie<=0) throw new IllegalArgumentException("Superficie mal");
    }

    public void addIdioma(String idioma){
        this.idiomas.add(idioma);
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", superficie=" + superficie +
                ", idiomas=" + idiomas +
                '}';
    }

    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareTo(o.nombre);
    }
}

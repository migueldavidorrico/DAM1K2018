public class Fichero {
    private String nombre;
    private final String extension;
    private long tamanyo;
    private String ruta;
    private static final String SISTEMA_FICHEROS="NTFS";

    public String getNombreTotal(){
        return this.nombre+"."+this.extension;
    }

    public Fichero(String nombre, String extension) {
        this(nombre,extension,0,".");
    }

    public Fichero(String nombre, String extension, long tamanyo, String ruta) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanyo = tamanyo;
        this.ruta = ruta;
    }


}

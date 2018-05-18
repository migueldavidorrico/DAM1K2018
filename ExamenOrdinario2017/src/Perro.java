public class Perro implements Animal {
    String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String comunicarse() {
        return nombre + " dice: " + "GUAU GUAU";
    }
}

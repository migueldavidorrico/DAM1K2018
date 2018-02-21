public abstract class Animales {
    String nombre;

    public Animales(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void presentate(){
        System.out.println("Soy: " + nombre);
    }
}

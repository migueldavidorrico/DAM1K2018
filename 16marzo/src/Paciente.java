public class Paciente {
    String nombre;
    int gravedad;

    @Override
    public String toString() {
        return "Paciente: " + String.format("%6s", nombre) + " Gravedad: " + gravedad;
    }

    public Paciente(String nombre, int gravedad) {
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }
}

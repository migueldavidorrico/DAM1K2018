public abstract class IntegranteSeleccion implements Trabajador {
    protected final String nombre;

    public String getNombre() {
        return nombre;
    }

    public IntegranteSeleccion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void cantarHimno() {
        System.out.println("NA NA NA NA NANANAANAN");
    }

    public abstract void cobrar();

    public abstract void vaAlpartido();

    public abstract void vaAlEntrenamiento();
}

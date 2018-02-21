public class Producto {
    private final String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public int calcular(int productosPasados){
        return this.getPrecio()*productosPasados;
    }

    @Override
    public String toString() {
        return "Producto{" + nombre + '-' +
                 precio +
                "€ }";
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

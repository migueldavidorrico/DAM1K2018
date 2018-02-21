public class Producto {
    private final int ID;
    private final String descripcion;
    private int precio;

    @Override
    public String toString() {
        return  ID +" - " + descripcion +" - "+ precio +"€";
    }

    public Producto(int ID, String descripcion, int precio) {
        this.ID = ID;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getID() {
        return ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

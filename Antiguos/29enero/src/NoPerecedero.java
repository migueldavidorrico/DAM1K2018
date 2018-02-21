public class NoPerecedero extends Producto {
    private final String tipo;

    public String getTipo() {
        return tipo;
    }

    public NoPerecedero(String nombre, int precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }
}

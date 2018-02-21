/*bebidas como agua mineral y bebidas azucaradas (coca-cola, fanta, etc).
De los productos nos interesa saber su identificador
(cada uno tiene uno distinto), cantidad de litros, precio y marca.

*/
public class Bebida {
    private final String ID;
    private final int litros;
    private int precio;
    private final Marca marca;

    @Override
    public String toString() {
        return ID + " -" +marca+ " "+litros+" litros" +
                " - " + precio +"€";
    }

    public Bebida(String ID, int litros, int precio, Marca marca) {
        this.ID = ID;
        this.litros = litros;
        this.precio = precio;
        this.marca = marca;
    }

    public String getID() {
        return ID;
    }

    public int getLitros() {
        return litros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Marca getMarca() {
        return marca;
    }
}

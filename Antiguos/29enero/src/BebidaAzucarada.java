/*Si es una bebida azucarada queremos saber el porcentaje
que tiene de azúcar y si tiene o no alguna promoción (si la tiene
tendrá un descuento del 10% en el precio).
*/
public class BebidaAzucarada extends Bebida{
    private Promocion promocion;
    private final int porcentajeAzucar;

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public int getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public BebidaAzucarada(String ID, int litros, int precio, Marca marca, int porcentajeAzucar) {
        super(ID, litros, precio, marca);
        this.promocion = Promocion.SINPROMOCION;
        this.porcentajeAzucar = porcentajeAzucar;
    }
    public BebidaAzucarada(Bebida bebida, int porcentajeAzucar) {
        super(bebida.getID(), bebida.getLitros(), bebida.getPrecio(), bebida.getMarca());
        this.promocion = Promocion.SINPROMOCION;
        this.porcentajeAzucar = porcentajeAzucar;
    }


    @Override
    public int getPrecio(){
        int precioOriginal=super.getPrecio();
        int precioPromocion=precioOriginal*(100-promocion.getDescuento())/100;
        return precioPromocion;
    }
    @Override
    public String toString() {
        return "Bebida Azucarada:" +super.toString() + " "+this.promocion+" "+this.getPrecio()+"€";
    }
}

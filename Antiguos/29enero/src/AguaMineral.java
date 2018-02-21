/*Si es agua mineral nos interesa saber también el origen (manantial tal
sitio o donde sea).
*/
public class AguaMineral extends Bebida{
    public AguaMineral(String ID, int litros, int precio, Marca marca, String origen) {
        super(ID, litros, precio, marca);
        this.origen = origen;
    }

    private final String origen;

    public AguaMineral(Bebida bebida, String origen) {
        super(bebida.getID(), bebida.getLitros(), bebida.getPrecio(), bebida.getMarca());

        this.origen=origen;
    }

    @Override
    public String toString() {
        return "Agua Mineral:" +super.toString() + " De: "+this.origen;
    }
}

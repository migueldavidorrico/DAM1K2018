public class Perecedero extends Producto{
    private int diasACaducar;

    @Override
    public int calcular(int productosPasados){
        int precioNuevo=super.calcular(productosPasados);
        switch(diasACaducar){
            case 1:precioNuevo=precioNuevo/4;
            break;
            case 2:precioNuevo=precioNuevo/3;
            break;
            case 3:precioNuevo=precioNuevo/2;
            break;
        }
        return precioNuevo;
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    public Perecedero(String nombre, int precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar=diasACaducar;
    }
}

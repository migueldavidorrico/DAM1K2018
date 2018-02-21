import com.sun.media.sound.AlawCodec;

import java.util.ArrayList;

public class Almacen {
    public static final int HUECOS_ESTANTERIA=5;
    Bebida[][] huecos;

    public Almacen(int numeroEstanterias) {
        huecos=new Bebida[numeroEstanterias][HUECOS_ESTANTERIA];
    }

    public Posicion devuelvePosicion(String IDaBuscar){
        for (int i = 0; i < huecos.length; i++) {
            for (int j = 0; j < huecos[i].length; j++) {
                if(huecos[i][j]==null){
                    continue;
                }
                if (huecos[i][j].getID().equals(IDaBuscar)){
                    return new Posicion(i,j);
                }
            }
        }
        return null;
    }
    public Posicion devuelvePosicionInsercion(){
        for (int i = 0; i < huecos.length; i++) {
            for (int j = 0; j < huecos[i].length; j++) {
                if(huecos[i][j]==null){
                    return new Posicion(i,j);
                }
            }
        }
        return null;
    }

    public String inventario(){
        String salida="";
        for (Bebida[] estanteria :
                huecos) {
            for (Bebida b :
                    estanteria) {
                if (b == null) {
                    salida+=" vacío ";
                }else{
                    salida+=" "+b.getID()+" ";
                }
                }
                salida+="\n";
        }
        return salida;
    }
    public boolean addBebida(Bebida b){
        if(devuelvePosicion(b.getID())!=null){
            return false;
        }
        Posicion p=devuelvePosicionInsercion();
        if(p==null){
            return false;
        }
        huecos[p.getEstanteria()][p.getColuma()]=b;
        return true;
    }
    public boolean removeBebida(String ID){
        Posicion p=devuelvePosicion(ID);
        if(p==null){
            return false;
        }
        huecos[p.getEstanteria()][p.getColuma()]=null;
        return true;
    }
    public int precioTotal(){
        int suma=0;
        for (Bebida[] estanteria :
                huecos) {
            for (Bebida b :
                    estanteria) {
                suma+=b.getPrecio();
            }
        }
        return suma;
    }


    class Posicion{
        int estanteria;
        int columa;

        public Posicion(int estanteria, int columa) {
            this.estanteria = estanteria;
            this.columa = columa;
        }

        public int getEstanteria() {
            return estanteria;
        }

        public void setEstanteria(int estanteria) {
            this.estanteria = estanteria;
        }

        public int getColuma() {
            return columa;
        }

        public void setColuma(int columa) {
            this.columa = columa;
        }

        @Override
        public String toString() {
            return "Posicion{" +
                    "estanteria=" + estanteria +
                    ", columa=" + columa +
                    '}';
        }
    }
    public static void main(String[] args) {
        Almacen a=new Almacen(2);
        System.out.println(a.devuelvePosicionInsercion());
        a.addBebida(new BebidaAzucarada(new Bebida("AA33A",54,46,Marca.COCACOLA),20));
        a.addBebida(new Bebida("AC33C",54,46,Marca.COCACOLA));
        a.addBebida(new Bebida("AD33C",54,46,Marca.COCACOLA));
        a.addBebida(new Bebida("TT33T",54,46,Marca.COCACOLA));
        a.addBebida(new Bebida("AA33A",54,46,Marca.COCACOLA));
        a.addBebida(new Bebida("BA33A",54,46,Marca.COCACOLA));
        a.addBebida(new Bebida("BC33C",54,46,Marca.COCACOLA));
        a.addBebida(new Bebida("BD33C",54,46,Marca.COCACOLA));
        a.addBebida(new Bebida("BT33T",54,46,Marca.COCACOLA));
        a.addBebida(new Bebida("FA33A",54,46,Marca.COCACOLA));
        System.out.println(a.inventario());
        a.removeBebida("TT33T");
        System.out.println(a.inventario());
        a.addBebida(new Bebida("NUEVA",54,46,Marca.COCACOLA));
        System.out.println(a.inventario());






    }

}

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.ArrayList;

public class Macedonia {
    private static final int MAXIMO_FRUTAS = 500;
    private Fruta[] frutas=new Fruta[MAXIMO_FRUTAS];
    private int numeroFrutas=0;

    public boolean borra(int posicionABorrar){
        if(posicionABorrar>=numeroFrutas){
            return false;
        }
        if(posicionABorrar<0){
            return false;
        }
        for (int i = posicionABorrar; i <numeroFrutas-1 ; i++) {
            this.frutas[i]=this.frutas[i+1];
        }
        numeroFrutas--;
        return true;
    }
    public boolean borra(Fruta fruta){
        return borra(posicion(fruta));
    }
    public boolean borra(String nombreFruta){
        return borra(posicion(nombreFruta));
    }


    public int posicion(Fruta f){
        return posicion(f.toString());
    }
    public int posicion(String elQueBusco){
        for (int i = 0; i < numeroFrutas; i++) {
            String elQuemiroEnMiArray=frutas[i].toString();
            if(elQuemiroEnMiArray.equals(elQueBusco)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Macedonia miMacedonia=Macedonia.inicializaMacedonia();
        JOptionPane.showMessageDialog(null,miMacedonia.salidaPosiciones());
        miMacedonia.ordenaBurbuja();
        JOptionPane.showMessageDialog(null,miMacedonia.salidaPosiciones());


    }

    private void ordenaBurbuja() {
        for (int i = 0; i < numeroFrutas; i++) {
            for (int j = 0; j < numeroFrutas-1; j++) {
                if(frutas[j].toString().compareTo(frutas[j+1].toString())>0){
                    Fruta aux=frutas[j];
                    frutas[j]=frutas[j+1];
                    frutas[j+1]=aux;
                }

            }
        }
    }

    public String salidaPosiciones(){

        String salida="<html><pre>             0";
        for (int i = 1; i < numeroFrutas; i++) {
            salida+=String.format("%15d",i);
        }
        salida+="<br />";
        for (int i = 0; i < numeroFrutas; i++) {
            salida+=String.format("%15s",this.frutas[i]);
        }
        return salida;
    }

    public static Macedonia inicializaMacedonia(){
        Macedonia nueva = new Macedonia();
        nueva.anyadeFruta(new Fruta("Fresa", TipoFruta.BAYA, 300));
        nueva.anyadeFruta(new Fruta("Plátano", TipoFruta.EXOTICA, 100));
        nueva.anyadeFruta(new Fruta("Melón", TipoFruta.CUCURBITACEA, 200));
        nueva.anyadeFruta(new Fruta("Kiwi", TipoFruta.EXOTICA, 300));
        nueva.anyadeFruta(new Fruta("Albercoque", TipoFruta.DULCE, 150));
        nueva.anyadeFruta(new Fruta("Mandarina", TipoFruta.CITRICO, 600));
        nueva.anyadeFruta(new Fruta("Coco", TipoFruta.EXOTICA, 350));
        return nueva;
    }

    public boolean anyadeFruta(Fruta f){
        if(numeroFrutas==MAXIMO_FRUTAS){
            return false;
        }
        frutas[numeroFrutas++]=f;
        return true;
    }
}

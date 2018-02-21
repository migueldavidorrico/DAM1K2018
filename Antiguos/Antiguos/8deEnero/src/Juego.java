import javax.swing.*;

public class Juego {
    Pieza[] piezas=new Pieza[32];

    public static void main(String[] args) {
        Juego miJuego=new Juego();
        miJuego.piezas[0]=new Pieza(Color.NEGRA,Tipo.TORRE);
        miJuego.piezas[1]=new Pieza(Color.NEGRA,Tipo.TORRE);
        miJuego.piezas[2]=new Pieza(Color.NEGRA,Tipo.ALFIL);
        miJuego.piezas[3]=new Pieza(Color.NEGRA,Tipo.ALFIL);
        miJuego.piezas[4]=new Pieza(Color.NEGRA,Tipo.CABALLO);
        miJuego.piezas[5]=new Pieza(Color.NEGRA,Tipo.CABALLO);
        miJuego.piezas[6]=new Pieza(Color.NEGRA,Tipo.REINA);
        miJuego.piezas[7]=new Pieza(Color.NEGRA,Tipo.REY);
        for (int i = 0; i < 8; i++) {
            miJuego.piezas[8+i]=new Pieza(Color.NEGRA,Tipo.PEON);
            miJuego.piezas[24+i]=new Pieza(Color.BLANCA,Tipo.PEON);

        }
        miJuego.piezas[16]=new Pieza(Color.BLANCA,Tipo.TORRE);
        miJuego.piezas[17]=new Pieza(Color.BLANCA,Tipo.TORRE);
        miJuego.piezas[18]=new Pieza(Color.BLANCA,Tipo.ALFIL);
        miJuego.piezas[19]=new Pieza(Color.BLANCA,Tipo.ALFIL);
        miJuego.piezas[20]=new Pieza(Color.BLANCA,Tipo.CABALLO);
        miJuego.piezas[21]=new Pieza(Color.BLANCA,Tipo.CABALLO);
        miJuego.piezas[22]=new Pieza(Color.BLANCA,Tipo.REINA);
        miJuego.piezas[23]=new Pieza(Color.BLANCA,Tipo.REY);

        String salida="<html><pre style='font-size:42px'>";

        int n=0;
        for (Pieza p :
                miJuego.piezas) {
            if(n++%8==0){
                salida+="<br />";
            }
            salida+=p.salida();
        }

        JOptionPane.showMessageDialog(null,salida,"Piezas",JOptionPane.PLAIN_MESSAGE);
    }
}

import javax.swing.*;

public class Tablero {
    Pieza[][] tablero=new Pieza[8][8];
    Tablero(){
        tablero[0][0]=new Pieza(Color.NEGRA,Tipo.TORRE);
        tablero[0][1]=new Pieza(Color.NEGRA,Tipo.CABALLO);
        tablero[0][2]=new Pieza(Color.NEGRA,Tipo.ALFIL);
        tablero[0][3]=new Pieza(Color.NEGRA,Tipo.REINA);
        tablero[0][4]=new Pieza(Color.NEGRA,Tipo.REY);
        tablero[0][5]=new Pieza(Color.NEGRA,Tipo.ALFIL);
        tablero[0][6]=new Pieza(Color.NEGRA,Tipo.CABALLO);
        tablero[0][7]=new Pieza(Color.NEGRA,Tipo.TORRE);
        for (int i = 0; i < 8; i++) {
            tablero[1][i]=new Pieza(Color.NEGRA,Tipo.PEON);
        }
        tablero[7][0]=new Pieza(Color.BLANCA,Tipo.TORRE);
        tablero[7][1]=new Pieza(Color.BLANCA,Tipo.CABALLO);
        tablero[7][2]=new Pieza(Color.BLANCA,Tipo.ALFIL);
        tablero[7][3]=new Pieza(Color.BLANCA,Tipo.REINA);
        tablero[7][4]=new Pieza(Color.BLANCA,Tipo.REY);
        tablero[7][5]=new Pieza(Color.BLANCA,Tipo.ALFIL);
        tablero[7][6]=new Pieza(Color.BLANCA,Tipo.CABALLO);
        tablero[7][7]=new Pieza(Color.BLANCA,Tipo.TORRE);
        for (int i = 0; i < 8; i++) {
            tablero[6][i]=new Pieza(Color.BLANCA,Tipo.PEON);
        }
    }
    String cadenaEsqueje(int i,int j){
        String salida="<td style='border:1px solid black;background-color:";
        if((i+j)%2==0) {
            salida += "#777777";
        } else {
            salida +="#BBBBBB";
        }
        salida+=";width:36px;transform: scale(2, 3);transition:scale 2s;'>";
        if(tablero[i][j]!=null) {
            salida += tablero[i][j].salida();
        } else {
            salida+=" ";
        }
        salida+="</td>";
        return salida;
    }
    String cadenaTablero(){

        String salida="<html><table style='border:1px solid black; font-size:32px; border-spacing: 0px;'>";
        for (int i = 0; i < tablero.length; i++) {
            salida+="<tr>";
            for(int j=0;j<tablero[i].length;j++) {
                salida += cadenaEsqueje(i,j);
            }
            salida+="</tr>";
        }
        salida+="</table></html>";
        return salida;
    }

    public static void main(String[] args) {
        Tablero t=new Tablero();
        JOptionPane.showMessageDialog(null,t.cadenaTablero(),"TABLERO",JOptionPane.PLAIN_MESSAGE);
        Pieza aux=t.tablero[1][1];
        t.tablero[1][1]=t.tablero[3][1];
        t.tablero[3][1]=aux;
        JOptionPane.showMessageDialog(null,t.cadenaTablero(),"TABLERO",JOptionPane.PLAIN_MESSAGE);
    }
}

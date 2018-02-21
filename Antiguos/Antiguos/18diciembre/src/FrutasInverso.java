import javax.swing.*;

/*
1. Crea un programa que cree un array de 5 frutas y pida al usuario introducir sus valores por teclado.
Al final mostrará sus valores en orden inverso al introducido
 */
public class FrutasInverso {
    private static final int TAMANYO = 3;
    static Fruta[] frutero=new Fruta[TAMANYO];
    public static void invierteArrayFrutas(Fruta[] frutero){
        for (int i = 0; i < frutero.length/2; i++) {
            int ultimo=frutero.length-i-1;
            Fruta aux=frutero[i];
            frutero[i]=frutero[ultimo];
            frutero[ultimo]=aux;
        }
    }
    public static Fruta[] invierteFrutas(Fruta[] frutero){
        Fruta[] invertido=new Fruta[frutero.length];
        for (int i = 0, j=frutero.length-1; i < frutero.length; i++,j--) {
            invertido[j]=frutero[i];
        }

        return invertido;
    }
    public static void main(String[] args) {
//        for(int i=0;i<TAMANYO;i++){
//            Fruta nueva=ESFruta.pideFrutaOSal();
//            if(nueva==null){
//                return;
//            }
//            frutero[i]=nueva;
//        }
        frutero=Fruta.arrayInicial();
        JOptionPane.showMessageDialog(null,ESFruta.muestraFrutas(frutero));
//        invierteArrayFrutas(frutero);
        Fruta[] nuevo=invierteFrutas(frutero);
        JOptionPane.showMessageDialog(null,ESFruta.muestraFrutas(nuevo));






    }
}

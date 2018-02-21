import javax.swing.*;
import java.util.Arrays;

/*Desarrollar un programa en el que se pidan al usuario dos vectores
de números enteros e indique en pantalla si son
proporcionales o no. (Dos vectores son proporcionales si uno de
ellos es el resultado de multiplicar por un mismo factor
todos los elementos del otro). Si los vectores proporcionados no
tienen la misma longitud, se ha de escribir en pantalla un
mensaje indicativo.
*/
public class Ejercicio4 {

    public static int[] pideVectorConCancelar(){
        String entrada=JOptionPane.showInputDialog("Introduzca el tamaño del vector");
        if(entrada==null){
            return null;
        }
        int tamanyo=Integer.parseInt(entrada);
        int[] salida=new int[tamanyo];
        for (int i = 0; i < tamanyo; i++) {
            String cadenaNumero=JOptionPane.showInputDialog("Introduzca el elemento: "+(i+1));
            if(cadenaNumero==null){
                if(JOptionPane.showConfirmDialog(null,"¿Realmente desea salir?","Confirmación", JOptionPane.YES_NO_OPTION)==
                        JOptionPane.YES_OPTION){
                    return null;
                } else {
                    i--;
                    continue;
                }
            }
            salida[i]=Integer.parseInt(cadenaNumero);
        }
        System.out.println(Arrays.toString(salida));
        return salida;
    }

    public static void main(String[] args) {
        int[] primero=pideVectorConCancelar();
        while(primero.length==0){
            JOptionPane.showMessageDialog(null,"ERROR, longitud cero","ERROR",JOptionPane.WARNING_MESSAGE);
            primero=pideVectorConCancelar();
        }
        if(primero==null){
            return;
        }
        int[] segundo=pideVectorConCancelar();
        while(segundo.length==0){
            JOptionPane.showMessageDialog(null,"ERROR, longitud cero","ERROR",JOptionPane.WARNING_MESSAGE);
            segundo=pideVectorConCancelar();
        }
        if(segundo==null){
            return;
        }
        if(primero.length!=segundo.length){
            JOptionPane.showMessageDialog(null,"Las longitudes son distintas\n pero continuamos","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
        }
        if(primero.length==0 || segundo.length==0){
            return;
        }
        if(sonProporcionales(primero,segundo)){
            JOptionPane.showMessageDialog(null,"Son Proporcionales con factor de:"+
            getProporcionPrimerElemento(primero,segundo));
        } else {
            JOptionPane.showMessageDialog(null,"No son Proporcionales");
        }

    }

    private static boolean sonProporcionales(int[] primero, int[] segundo) {
        double proporcion=getProporcionPrimerElemento(primero,segundo);
        for (int i = 1; i < Math.min(primero.length, segundo.length); i++) {
            double nuevaProporcion=primero[i]/(double)segundo[i];
            if(nuevaProporcion!=proporcion){
                return false;
            }
        }
        return true;
    }

    private static double getProporcionPrimerElemento(int[] primero, int[] segundo) {
        return primero[0]/(double)segundo[0];
    }
}


/*
Crea un programa que cree un array de 5 enteros y pida al usuario
introducir sus valores por teclado.
Al final mostrará sus valores en orden inverso
al introducido

*/
import javax.swing.*;

public class ArrayEnteros{
    private static final int CANTIDAD_NUMEROS = 5;
    static int[] numeros=new int[CANTIDAD_NUMEROS];

    public static void main(String[] args){
        //Insercion de datos
        String 	entrada = JOptionPane.showInputDialog("Introduce "
                +CANTIDAD_NUMEROS+
                " valores separados por espacios:");

        //Separacion de numeros
        String[] entradas = entrada.split(" ");
        //Asignacion de los numeros introducidos al array
        for (int i=0; i<CANTIDAD_NUMEROS; i++){

            numeros[i] = Integer.parseInt(entradas[i]);;
        }
        //Valores en orden inverso
        String salida="";
        for (int i=CANTIDAD_NUMEROS-1; i>=0;i--){
            salida+=numeros[i]+" ";
        }
        JOptionPane.showMessageDialog(null,salida);
     /* esto puede funcionar:
     int[] intArr = new int[5];

           for (int i=0;i<=5;i++) {
               intArr[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número entero"));
           }*/
    }
}

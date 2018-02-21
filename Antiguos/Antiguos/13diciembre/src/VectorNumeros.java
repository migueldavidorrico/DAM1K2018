import javax.swing.*;
import java.util.Arrays;

public class VectorNumeros {
    public static void main(String[] args) {
        int cantidadNumerosVector = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cúantos números en el vector quieres?"));

        String numerosVector=JOptionPane.showInputDialog(null,"Escribeme separado por espacios, "+cantidadNumerosVector+" números para tu vector.");

        String[] numerosDivididos=numerosVector.split(" ");

        int[] vector=new int[cantidadNumerosVector];

        for (int i = 0; i < cantidadNumerosVector; i++) {
            vector[i]=Integer.parseInt(numerosDivididos[i]);
        }

        String salida="";

        for (int i = 0; i < (cantidadNumerosVector-1); i++) {
            System.out.println(Arrays.toString(vector));
            System.out.println("Miro posicion " + i +" que tiene un "+vector[i]+ " y " + (i + 1)+" que tiene un "+vector[i+1]);

            if (vector[i]>vector[i+1]){
                salida="No están ordenados de menor a mayor.";
                break;
            }

            salida="Están ordenados de menor a mayor.";
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(vector));
        JOptionPane.showMessageDialog(null,salida);
        System.out.println(cantidadNumerosVector);

    }
}

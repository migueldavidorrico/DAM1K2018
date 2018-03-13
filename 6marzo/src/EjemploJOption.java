import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploJOption {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        String[] a;

        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                String respuesta = JOptionPane.showInputDialog(null, "Numero?");
                if (respuesta == null) {
                    break;
                }
                int numero = Integer.parseInt(respuesta);
                System.out.println(numero * 2);
                entradaValida = true;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Eso no es un número");
            }
        }
    }
}

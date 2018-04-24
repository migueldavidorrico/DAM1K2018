import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*Crea una aplicación donde pidamos la ruta de un fichero por teclado
 y un texto que queramos a escribir en el fichero. Deberás mostrar por
  pantalla el mismo texto pero variando entre mayúsculas y minúsculas,
  es decir, si escribo “Bienvenido” deberá devolver “bIENVENIDO”. Si se
   escribe cualquier otro carácter, se quedara tal y como se escribió.
  */
public class EjercicioInternet {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showSaveDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File fichero = chooser.getSelectedFile();
        String texto = JOptionPane.showInputDialog(null);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            bw.write(texto);
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        char[] letras = texto.toCharArray();
        for (char c : letras) {
            char aAnyadir;
            if (!Character.isLetter(c)) {
                aAnyadir = c;
            } else {
                if (Character.isUpperCase(c)) {
                    aAnyadir = Character.toLowerCase(c);
                } else {
                    aAnyadir = Character.toUpperCase(c);
                }
            }
            sb.append(aAnyadir);
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}

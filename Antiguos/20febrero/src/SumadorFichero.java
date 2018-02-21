import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class SumadorFichero {
    public static void main(String[] args) throws IOException {
        JFileChooser fileChooser = new JFileChooser();

        int seleccion = fileChooser.showSaveDialog(null);

        if(seleccion==JFileChooser.APPROVE_OPTION){
            PrintWriter printer=new PrintWriter(fileChooser.getSelectedFile());
        printer.append("vlksdfmlñ");
        printer.close();
            System.out.println(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println(fileChooser.getSelectedFile().getCanonicalFile());
        }
    }
}

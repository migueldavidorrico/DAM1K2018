import javax.swing.*;
import java.awt.*;

public class EjemploJLabel {
    static JFrame frame;

    private static void createAndShowGUI() {
        frame = new JFrame("Ejemplo JFrame"); //TITULO
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
        frame.setLayout(new GridLayout(2, 0));
        //Label simple
        frame.add(new JLabel("Prueba de texto"));
        //HTML en la etiqueta
        frame.add(new JLabel("<html><h1><pre>Label <strong>con HTML</strong></pre></h1>"));
        //Fuente en la etiqueta
        JLabel etiqueta = new JLabel("Mi etiqueta");
        etiqueta.setFont(new Font("Arial", Font.BOLD, 48));
        frame.add(etiqueta);
        //Imagen en el botón
        frame.add(new JLabel(new ImageIcon("redondel.gif")));
        frame.pack();//LO PONE TODO AL TAMAÑO MÍNIMO NECESARIO
//        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//MUESTRA LA VENTANA
        JOptionPane.showMessageDialog(frame, "Mensaje de muestra");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (Exception e) {
                    // If Nimbus is not available, you can set the GUI to another look and feel.
                }

                createAndShowGUI();
            }
        });
    }
}


import javax.swing.*;
import java.awt.*;

public class EjemploJFrame {
    static JFrame frame;

    private static void createAndShowGUI() {
        frame = new JFrame("Ejemplo JFrame"); //TITULO
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
        JLabel etiqueta = new JLabel("Programa de ejemplo");
        etiqueta.setPreferredSize(new Dimension(200, 180));
        frame.getContentPane().add(etiqueta);//AÑADE AL CONTENEDOR DEL FRAME
        frame.pack();//LO PONE TODO AL TAMAÑO MÍNIMO NECESARIO
//        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//MUESTRA LA VENTANA
        JOptionPane.showMessageDialog(frame, "Mensaje de muestra");
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
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


import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

public class EjemploListas {
    static JFrame frame;
    static JLabel leyenda = new JLabel("Tienes seleccionado: ");

    private static void createAndShowGUI() {
        frame = new JFrame("Ejemplo Listas"); //TITULO
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
        frame.setLayout(new GridLayout(0, 2, 10, 10));
        String[] opciones = {
                "ESPAÑA",
                "FRANCIA",
                "PORTUGAL",
                "RUSIA",
                "EEUU",
                "UK",
                "YEMEN",
                "IRÁN",
                "ITALIA"
        };
        JList<String> lista = new JList<>(opciones);
        JScrollPane scroll = new JScrollPane(lista);
        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    for (String s :
                            lista.getSelectedValuesList()) {
                        System.out.print(s);
                    }
                    System.out.println("");

                }
            }
        });
        frame.add(leyenda);
        frame.add(scroll);
        frame.pack();//LO PONE TODO AL TAMAÑO MÍNIMO NECESARIO
        frame.setLocationRelativeTo(null);
//        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//MUESTRA LA VENTANA
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

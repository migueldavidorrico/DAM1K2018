import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploListasComplejas {
    static JFrame frame;
    static JLabel leyenda = new JLabel("Tienes seleccionado: ");
    static DefaultListModel<String> modelo;
    static int numero;
    static JButton anyadir = new JButton("Añadir numero");
    static JButton quitar = new JButton("Quitar Número");

    private static void createAndShowGUI() {
        frame = new JFrame("Ejemplo Listas"); //TITULO
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
        frame.setLayout(new GridLayout(0, 2, 10, 10));
        modelo = new DefaultListModel<>();
        JList<String> lista = new JList<>(modelo);
        JScrollPane scroll = new JScrollPane(lista);
        frame.add(anyadir);
        frame.add(quitar);
        anyadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.addElement("Numero " + numero++);
            }
        });
        quitar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (modelo.size() > 0) {
                    modelo.remove(0);
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

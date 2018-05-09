import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class EjemploComboBox {
    static JFrame frame;

    private static void createAndShowGUI() {
        frame = new JFrame("Ejemplo ComboBox"); //TITULO
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
        frame.setLayout(new GridLayout(0, 2, 10, 10));
        frame.add(new JLabel("Elija un idioma"));
        String[] idiomasCastellano = new String[Idioma.values().length];
        for (int i = 0; i < Idioma.values().length; i++) {
            idiomasCastellano[i] = Idioma.values()[i].toString();
        }
        JComboBox<String> idiomas = new JComboBox<>(idiomasCastellano);
        idiomas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cambias al idioma: " + idiomas.getSelectedItem());
                Idioma seleccionado = null;
                for (Idioma i :
                        Idioma.values()) {
                    if (i.toString().equals(idiomas.getSelectedItem())) {
                        seleccionado = i;
                        break;
                    }
                }
                System.out.println(seleccionado);
            }
        });
        frame.add(idiomas);
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

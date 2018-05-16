import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Bombas {
    private final static int ANCHO = 4;
    private final static int ALTO = 4;
    private static JFrame frame;
    private static JPanel panelJuego;
    private static JPanel panelMarcador;

    public static void createAndShowGUI() {

        frame = new JFrame("¡¡¡¡Dale a la bomba que Explotas!!!!!"); //TITULO
        frame.setResizable(false);
        frame.setLayout(new GridLayout(0, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
//        frame.pack();
        panelJuego = new JPanel(new GridLayout(ALTO, ANCHO));
        Bomba[] bombas = new Bomba[ANCHO * ALTO];
        for (int i = 0; i < ANCHO * ALTO; i++) {
            bombas[i] = new Bomba();
            panelJuego.add(bombas[i].getBoton());
        }
        panelMarcador = new JPanel();


        frame.add(panelJuego);
        frame.add(panelMarcador);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);
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

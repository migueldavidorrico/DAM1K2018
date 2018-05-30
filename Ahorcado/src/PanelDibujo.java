import javax.swing.*;
import java.awt.*;

public class PanelDibujo {
    JPanel panel;
    Controlador controlador;
    JLabel label = new JLabel();
    int numeroImagen = 0;
    static ImageIcon[] imagenes = new ImageIcon[8];

    static {
        for (int i = 0; i < imagenes.length; i++) {
            PanelDibujo.imagenes[i] = new ImageIcon("ahorcado" + (i + 1) + ".png");
        }
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public PanelDibujo(Controlador controlador) {
        this.controlador = controlador;
        panel = new JPanel();
        panel.add(label);
        label.setIcon(imagenes[numeroImagen]);
    }

    public void siguienteImagen() {
        this.label.setIcon(imagenes[++numeroImagen]);
    }

    public static void main(String[] args) {

        PanelDibujo panelDibujo = new PanelDibujo(new Controlador());
        JFrame frame = new JFrame("LAS TRES EN RAYA"); //TITULO
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
//        frame.pack();
        frame.add(panelDibujo.getPanel());
        panelDibujo.siguienteImagen();
        panelDibujo.siguienteImagen();
        panelDibujo.siguienteImagen();
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//MUESTRA LA VENTANA
    }
}

import javax.swing.*;
import java.awt.*;

public class EjemploMaloJFrame extends JFrame {
    public static void main(String[] args) {
        EjemploMaloJFrame e = new EjemploMaloJFrame();
        e.inicio();

    }

    public void inicio() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
        JLabel etiqueta = new JLabel("Programa de ejemplo");
        etiqueta.setPreferredSize(new Dimension(200, 180));
        getContentPane().add(etiqueta);//AÑADE AL CONTENEDOR DEL FRAME
        pack();//LO PONE TODO AL TAMAÑO MÍNIMO NECESARIO
        setVisible(true);//MUESTRA LA VENTANA
    }
}

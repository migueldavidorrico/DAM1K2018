import javax.swing.*;
import java.awt.*;

public class Frame1 {
    private JLabel numeroDigito;
    Controlador c;

    public Frame1(Controlador c) {
        this.c = c;
    }

    public JLabel getNumeroDigito() {
        return numeroDigito;
    }

    public void setNumeroDigito(int i) {
        this.numeroDigito.setText("" + i);
    }

    public void incializa() {
        numeroDigito = new JLabel("1");
        numeroDigito.setFont(new Font("Serif", Font.PLAIN, 48));

        JFrame frame = new JFrame("DOS FRAMES"); //TITULO
        frame.add(numeroDigito);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
//        frame.pack();
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

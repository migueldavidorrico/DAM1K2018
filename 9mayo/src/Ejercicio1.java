import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 {
    private JButton botónDeLaIzquierdaButton;
    private JButton botónDeLaDerechaButton;
    private JPanel panel;
    private JLabel etiquetaAbajo;

    public Ejercicio1() {
        botónDeLaIzquierdaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiquetaAbajo.setText("Has pulsado el botón de la Izquierda");
            }
        });
        botónDeLaDerechaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiquetaAbajo.setText("Has pulsado el botón de la Derecha");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio1");
        frame.setContentPane(new Ejercicio1().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

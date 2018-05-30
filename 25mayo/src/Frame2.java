import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 {
    Controlador c;

    public Frame2(Controlador c) {
        this.c = c;
    }

    public void inicializa() {
        JFrame frame2 = new JFrame("DOS FRAMES"); //TITULO
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
//        frame.pack();
        JComboBox<Numeros> combo = new JComboBox<Numeros>(Numeros.values());
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.cambiadoNumero(Numeros.values()[combo.getSelectedIndex()].getNumero());
            }
        });
        frame2.add(combo);
        frame2.setBounds(5, 5, 100, 100);
        frame2.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DosFrames {
    static JLabel numeroDigito;

    public static void main(String[] args) {
        numeroDigito = new JLabel("1");

        JFrame frame = new JFrame("DOS FRAMES"); //TITULO
        frame.add(numeroDigito);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
//        frame.pack();
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//MUESTRA LA VENTANA
        JFrame frame2 = new JFrame("DOS FRAMES"); //TITULO
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
//        frame.pack();
        JComboBox<Numeros> combo = new JComboBox<Numeros>(Numeros.values());
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedIndex());
                numeroDigito.setText("" + Numeros.values()[(int) combo.getSelectedIndex()].getNumero());
            }
        });
        frame2.add(combo);
        frame2.setBounds(5, 5, 100, 100);
        frame2.setVisible(true);//MUESTRA LA VENTANA
    }
}

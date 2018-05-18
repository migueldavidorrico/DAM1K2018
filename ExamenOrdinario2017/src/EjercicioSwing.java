import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioSwing {
    static JFrame ventana = new JFrame("Examen");
    static JTextField id = new JTextField(5);
    static JTextField nombre = new JTextField(20);
    static JTextField posicion = new JTextField(5);
    static JButton mostrar = new JButton("Mostrar posición");

    public static void main(String[] args) {
        int[] ids = {3, 5, 7, 10, 4};
        String[] nombres = {"Ana", "Bea", "Clara", "Delia", "Elena"};
        ventana.setLayout(new GridLayout(4, 2));
        ventana.add(new JLabel("ID: "));
        ventana.add(id);
        ventana.add(new JLabel("Nombre:"));
        ventana.add(nombre);
        ventana.add(new JLabel("Posición a mostrar"));
        ventana.add(posicion);
        ventana.add(mostrar);
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//A rellenar
                try {
                    int posicionPedida = Integer.parseInt(posicion.getText());
                    id.setText("" + ids[posicionPedida]);
                    nombre.setText("" + nombres[posicionPedida]);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(ventana, "Eso no es un número");
                    nfe.printStackTrace();
                } catch (ArrayIndexOutOfBoundsException aiobe) {
                    JOptionPane.showMessageDialog(ventana, "Esa posición no existe");
                    aiobe.printStackTrace();
                }
            }
        });
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
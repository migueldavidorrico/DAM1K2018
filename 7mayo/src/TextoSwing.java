import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Date;

public class TextoSwing {
    static JFrame frame;
    static JTextField texto;
    static JTextField texto2;
    static JButton muestra = new JButton("Pulsame!!");

    private static void createAndShowGUI() {
        frame = new JFrame("Ejemplo Texto"); //TITULO
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
        frame.setLayout(new GridLayout(0, 2, 10, 10));

        frame.add(new JLabel("Nombre:"));

        texto = new JTextField("Pon tu nombre", 20);
        frame.add(texto);
        frame.add(new JLabel("Apellidos"));

        texto2 = new JTextField("", 20);
        frame.add(texto2);

        frame.add(new JLabel("Contraseña"));
        JPasswordField pass = new JPasswordField();


        frame.add(pass);
        pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Contraseña: " + pass.getPassword());
                System.out.println("Contraseña: " + pass.getText());
                for (char c :
                        pass.getPassword()) {
                    System.out.println(c);
                }
            }
        });

        frame.add(new JLabel("Introduce un número"));
        JFormattedTextField formateado = new JFormattedTextField(new Integer(0));
        frame.add(formateado);
        frame.add(new JLabel("Introduce un decimal"));
        JFormattedTextField formattedTextField = new JFormattedTextField(new Double(0));
        frame.add(formattedTextField);

        frame.add(new JLabel("Fecha de Nacimiento:"));
        JFormattedTextField fechaFormateada = new JFormattedTextField(new Date());
        frame.add(fechaFormateada);


        frame.add(muestra);
        muestra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(formateado.getValue());
                System.out.println(formattedTextField.getValue());
                JOptionPane.showMessageDialog(frame, "Hola, " + texto.getText() + " " + texto2.getText());
                texto.setText("");
                texto2.setText("");
            }
        });
        texto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Enter pulsado");
            }
        });


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

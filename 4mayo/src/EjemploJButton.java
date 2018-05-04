import com.sun.javafx.collections.MappingChange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class EjemploJButton {
    static JFrame frame;
    static HashMap<JButton, String> botonesMensaje = new HashMap<>();

    private static void createAndShowGUI() {
        frame = new JFrame("Ejemplo JFrame"); //TITULO
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
        GridLayout grid = new GridLayout(0, 2);
        grid.setHgap(10);
        grid.setVgap(10);
        frame.setLayout(grid);
        frame.setResizable(false);
        botonesMensaje.put(new JButton("Prueba"), "Has pulsado el de la izquierda");
        botonesMensaje.put(new JButton("<html><h2>Púlsame</h2>"), "El de la derecha");
//        botones.add(new JButton(new ImageIcon("redondel.gif")));
        JButton nuevo = new JButton("No puedes pulsarme");
        nuevo.setEnabled(false);

        botonesMensaje.put(nuevo, null);

        for (JButton boton :
                botonesMensaje.keySet()
                ) {
            frame.getContentPane().add(boton);
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pulsacionBoton(e);
                }
            });
        }
        JPanel botonesChicos = new JPanel();
        botonesChicos.add(new JButton("Pequeño"));
        botonesChicos.add(new JButton("Pequeñito"));
        frame.getContentPane().add(botonesChicos);

        frame.pack();//LO PONE TODO AL TAMAÑO MÍNIMO NECESARIO
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//MUESTRA LA VENTANA
    }

    private static void pulsacionBoton(ActionEvent e) {
        System.out.println(botonesMensaje.get(e.getSource()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Motif".equals(info.getName())) {
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


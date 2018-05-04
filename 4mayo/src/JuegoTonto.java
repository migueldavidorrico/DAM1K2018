import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuegoTonto {
    static JFrame frame;
    static JButton boton = new JButton();
    static boolean pulsable = false;
    static Timer temporizador;
    static int puntuacion = 0;

    private static int tiempoRojo() {
        return (int) (Math.random() * 500) + 200;
    }

    private static int tiempoVerde() {
        return (int) (Math.random() * 2000) + 100;
    }

    private static void createAndShowGUI() {
        frame = new JFrame("Juego Tonto"); //TITULO
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA

        boton.setPreferredSize(new Dimension(100, 100));
        frame.getContentPane().add(boton);
        boton.setBackground(new Color(255, 0, 0));
        frame.pack();//LO PONE TODO AL TAMAÑO MÍNIMO NECESARIO
//        frame.setLocationRelativeTo(null);
        temporizador = new Timer(tiempoRojo(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiaColor();

            }
        });
        temporizador.start();

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsadoBoton();
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//MUESTRA LA VENTANA


    }

    private static void pulsadoBoton() {
        if (pulsable) {
            puntuacion++;
            JOptionPane.showMessageDialog(frame, "BIEN!!! Un punto más, llevas: " + puntuacion);

        } else {
            JOptionPane.showMessageDialog(frame, "Perdiste. Puntuación final:" + puntuacion);
            puntuacion = 0;
        }
    }

    private static void cambiaColor() {
        if (!pulsable) {
            pulsable = true;
            boton.setBackground(new Color(0, 255, 0));
            temporizador.setDelay(tiempoRojo());
        } else {
            pulsable = false;
            boton.setBackground(new Color(255, 0, 0));
            temporizador.setDelay(tiempoVerde());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
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


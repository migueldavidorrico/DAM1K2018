import javax.naming.ldap.Control;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPalabra {
    JPanel panel;
    Palabra palabra;
    JLabel cadenaPalabra;
    Controlador controlador;
    int tiempo = 15;
    JLabel etiquetaTiempo;
    Timer temporizador;

    public Timer getTemporizador() {
        return temporizador;
    }

    public void setTemporizador(Timer temporizador) {
        this.temporizador = temporizador;
    }

    public PanelPalabra(Palabra palabra, Controlador controlador) {
        this.palabra = palabra;
        this.controlador = controlador;
        cadenaPalabra = new JLabel();


        cadenaPalabra.setFont(new Font("Arial", Font.BOLD, 48));
        cadenaPalabra.setText(palabra.toString());
        cadenaPalabra.setBackground(Color.WHITE);
        cadenaPalabra.setForeground(Color.GRAY);
        this.panel = new JPanel();
        this.panel.setLayout(new GridLayout(2, 0));
        this.panel.add(cadenaPalabra);
        this.etiquetaTiempo = new JLabel(tiempo + " segundos");
        etiquetaTiempo.setFont(new Font("Arial", Font.BOLD, 30));
        etiquetaTiempo.setForeground(Color.BLUE);
        this.panel.add(etiquetaTiempo);

        this.panel.setBackground(Color.white);
        temporizador = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizaTiempo();
            }
        });
        temporizador.start();
    }

    private void actualizaTiempo() {
        if (tiempo == 0) {
            controlador.tiempoAgotado();
        }
        this.tiempo--;
        System.out.println(this.tiempo);
        this.etiquetaTiempo.setText(tiempo + " segundos");
        if (tiempo <= 10) {
            if (tiempo % 2 == 0) {
                etiquetaTiempo.setForeground(Color.RED);
            } else {
                etiquetaTiempo.setForeground(Color.CYAN);
            }
        }

    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public Palabra getPalabra() {
        return palabra;
    }

    public void setPalabra(Palabra palabra) {
        this.palabra = palabra;
    }

    public static void main(String[] args) {
//        PanelPalabra panelPalabra=new PanelPalabra(new Palabra("destornillador"));
//        JFrame frame = new JFrame("LAS TRES EN RAYA"); //TITULO
//        frame.setResizable(false);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
////        frame.pack();
//        frame.add(panelPalabra.getPanel());
//        frame.setSize(600, 100);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);//MUESTRA LA VENTANA
//        panelPalabra.adivina('r');
//        panelPalabra.adivina('d');

    }

    public boolean adivina(char r) {
        boolean esta = palabra.adivinaLetra(r);
        cadenaPalabra.setText(palabra.toString());
        return esta;
    }
}

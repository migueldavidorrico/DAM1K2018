import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Controlador {
    int fallos = 0;
    JFrame frame;
    PanelPalabra panelPalabra;
    PanelBotones panelBotones;
    PanelDibujo panelDibujo;
    Palabra aAdivinar;
    AudioInputStream ganar;
    AudioInputStream perder;
    AudioInputStream fallo;
    AudioInputStream acierto;
    Clip sonidoBoton;


    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public PanelPalabra getPanelPalabra() {
        return panelPalabra;
    }

    public void setPanelPalabra(PanelPalabra panelPalabra) {
        this.panelPalabra = panelPalabra;
    }

    public PanelBotones getPanelBotones() {
        return panelBotones;
    }

    public void setPanelBotones(PanelBotones panelBotones) {
        this.panelBotones = panelBotones;
    }

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.inicializa();
    }

    private void inicializa() {
        sonidoFondo();
        frame = new JFrame("EL AHORCADO"); //TITULO
        JFrame frame2 = new JFrame("DIBUJO");
        panelDibujo = new PanelDibujo(this);
        frame2.add(panelDibujo.getPanel());
        frame2.setResizable(false);
        frame2.setBounds(10, 10, 300, 310);
        frame2.setVisible(true);//MUESTRA LA VENTANA
        frame2.setResizable(false);
        frame.setLayout(new GridLayout(2, 0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
//        frame.pack();
        PalabraAleatoria listado = new PalabraAleatoria();
        aAdivinar = new Palabra(listado.obtenerPalabra());
        System.out.println("La palabra es: " + aAdivinar.palabra);
        panelPalabra = new PanelPalabra(aAdivinar, this);
        frame.add(panelPalabra.getPanel());
        panelBotones = new PanelBotones(this);
        frame.add(panelBotones.getPanel());
        frame.setBounds(350, 350, 600, 300);
        frame.setVisible(true);//MUESTRA LA VENTANA
    }

    private void sonidoFondo() {
        Clip fondo;
        AudioInputStream s = null;
        try {
            s = AudioSystem.getAudioInputStream(new File("Fondo.wav"));
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        AudioFormat format = s.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        try {
            fondo = (Clip) AudioSystem.getLine(info);
            fondo.open(s);
            fondo.start();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void pulsadaLetra(String name) {
        System.out.println(panelPalabra.adivina(name.charAt(0)));
        if (!panelPalabra.adivina(name.charAt(0))) {
            reproduceSonido("Fallo.wav");
            panelDibujo.siguienteImagen();
            fallos++;
            if (fallos == 7) {
                JOptionPane.showMessageDialog(null, "HAS PERDIDO. La palabra era:  " + aAdivinar.palabra);
                System.exit(0);
            }
        } else {
            reproduceSonido("Acierto.wav");
        }
        if (panelPalabra.getPalabra().acertada) {
            reproduceSonido("Ganar.wav");
            panelPalabra.getTemporizador().stop();
            JOptionPane.showMessageDialog(null, "HAS GANADO. La palabra era:  " + aAdivinar.palabra);
            System.exit(0);
        }
    }

    public void tiempoAgotado() {
        reproduceSonido("Perder.wav");
        JOptionPane.showMessageDialog(null, "HAS PERDIDO. La palabra era:  " + aAdivinar.palabra);
        System.exit(0);
    }

    private void reproduceSonido(String se) {
        AudioInputStream s = null;
        try {
            s = AudioSystem.getAudioInputStream(new File(se));
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sonidoBoton != null) {
            if (sonidoBoton.isRunning()) {
                sonidoBoton.stop();
                sonidoBoton.close();
            }
        }
        AudioFormat format = s.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);

        try {
            sonidoBoton = (Clip) AudioSystem.getLine(info);
            sonidoBoton.open(s);
            sonidoBoton.start();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

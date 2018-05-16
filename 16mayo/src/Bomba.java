import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bomba {
    private static final int T_MAX = 12000;
    private static final int T_MIN = 4000;
    JButton boton;
    ImageIcon blanco;
    ImageIcon bomba;
    Timer temporizador;

    public Bomba() {
        this.boton = new JButton("");
        this.blanco = new ImageIcon("white.png");
        this.bomba = new ImageIcon("bomb.gif");
        this.bomba.setImageObserver(this.boton);
        this.boton.setIcon(this.blanco);
        this.boton.setSize(40, 40);
        temporizador = new Timer(tiempoAleatorio(T_MIN, T_MAX), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiaABomba();
            }
        });
        temporizador.start();
    }

    private int tiempoAleatorio(int tMin, int tMax) {
        int salida = (int) (Math.random() * (tMax - tMin)) + tMin;
        System.out.println(salida);
        return salida;
    }

    private void cambiaABomba() {
        if (this.boton.getIcon().equals(this.blanco)) {
            this.boton.setIcon(this.bomba);
            temporizador.setDelay(tiempoAleatorio(T_MIN, T_MAX));
        } else {
            this.boton.setIcon(this.blanco);
            temporizador.setDelay(tiempoAleatorio(T_MIN, T_MAX));
        }
    }

    public JButton getBoton() {
        return boton;
    }
}

import javax.swing.*;
import java.awt.*;

public class TableroSwing extends Tablero {
    static CasillasSwing[][] casillasSwings;
    static JFrame frame;
    static TableroSwing juego;

    public static void main(String[] args) {
        juego = new TableroSwing();
        frame = new JFrame("LAS TRES EN RAYA"); //TITULO
        inicializa();
        frame.setResizable(false);
        frame.setLayout(new GridLayout(3, 3));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
//        frame.pack();

        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//MUESTRA LA VENTANA

    }

    private static void inicializa() {
        casillasSwings = new CasillasSwing[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillasSwings[i][j] = new CasillasSwing(i, j, juego);
                frame.add(casillasSwings[i][j].boton);
            }
        }
    }

    public void imprimeQueSi() {
        System.out.println("Si");
    }

    public void compruebaSiFinal() {
        if (esGanador(this.turno)) {
            JOptionPane.showMessageDialog(frame, "GANA: " + this.turno);
            System.exit(0);
            return;
        }
        if (tableroLleno()) {
            JOptionPane.showMessageDialog(frame, "TABLAS");
            System.exit(0);
        }


    }
}



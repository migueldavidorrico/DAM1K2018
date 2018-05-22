import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CasillasSwing extends Casilla {
    JButton boton;
    TableroSwing tablero;
    int fila;
    int columna;

    public CasillasSwing(int fila, int columna, TableroSwing tablero) {
        super();
        this.tablero = tablero;
        this.fila = fila;
        this.columna = columna;
        boton = new JButton();
        boton.setIcon(new ImageIcon("vacia.png"));
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablero.ponFicha(fila, columna, tablero.turno);
                boton.setIcon(new ImageIcon(tablero.turno.getImagen()));
                tablero.compruebaSiFinal();
                tablero.turno = tablero.turno.equals(Jugador.PLAYER1) ? Jugador.PLAYER2 : Jugador.PLAYER1;
            }
        });
    }
}

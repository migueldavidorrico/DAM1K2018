import java.util.Arrays;
import java.util.Scanner;

public class Tablero {
    Casilla[][] casillas;
    boolean hayGanador;
    Jugador ganador;
    Jugador turno;

    public boolean isHayGanador() {
        return hayGanador;
    }

    public void setHayGanador(boolean hayGanador) {
        this.hayGanador = hayGanador;
    }

    public Jugador getGanador() {
        return ganador;
    }

    public void setGanador(Jugador ganador) {
        this.ganador = ganador;
    }

    public void ponFicha(int fila, int columna, Jugador jugador) {
        if (!casillas[fila][columna].getEstado().equals(EstadoCasilla.VACIA)) {
            throw new IllegalArgumentException("La casilla está ya ocupada");
        }
        casillas[fila][columna].setEstado(jugador.getEstado());
        if (esGanador(jugador)) {
            this.hayGanador = true;
            this.ganador = jugador;
        }
    }

    public boolean tableroLleno() {
        for (Casilla[] fila :
                casillas) {
            for (Casilla c :
                    fila) {
                if (c.getEstado().equals(EstadoCasilla.VACIA)) {
                    return false;
                }
            }
        }
        return true;
    }

    protected boolean esGanador(Jugador jugador) {
        for (int i = 0; i < 3; i++) {
            if (casillas[i][0].getEstado().equals(jugador.getEstado())
                    && casillas[i][1].getEstado().equals(jugador.getEstado())
                    && casillas[i][2].getEstado().equals(jugador.getEstado())
                    ) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (casillas[0][i].getEstado().equals(jugador.getEstado())
                    && casillas[1][i].getEstado().equals(jugador.getEstado())
                    && casillas[2][i].getEstado().equals(jugador.getEstado())
                    ) {
                return true;
            }
        }

        if (casillas[0][0].getEstado().equals(jugador.getEstado())
                && casillas[1][1].getEstado().equals(jugador.getEstado())
                && casillas[2][2].getEstado().equals(jugador.getEstado())
                ) {
            return true;
        }
        if (casillas[0][2].getEstado().equals(jugador.getEstado())
                && casillas[1][1].getEstado().equals(jugador.getEstado())
                && casillas[2][0].getEstado().equals(jugador.getEstado())
                ) {
            return true;
        }
        return false;
    }


    public Tablero() {
        this.turno = Jugador.PLAYER1;
        this.casillas = new Casilla[3][3];
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = new Casilla();
            }
        }
        hayGanador = false;
        ganador = null;
    }

    @Override
    public String toString() {
        String salida = "TABLERO:\n--------\n";
        for (Casilla[] fila :
                casillas) {
            for (Casilla c :
                    fila) {
                salida += c;
            }
            salida += "\n";
        }
        return salida;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero();
        tablero.turno = Jugador.PLAYER2;
        do {
            tablero.turno = tablero.turno.equals(Jugador.PLAYER1) ? Jugador.PLAYER2 : Jugador.PLAYER1;
            System.out.println(tablero);
            System.out.println("Turno de " + tablero.turno);
            System.out.println("ESCRIBA FILA Y COLUMNA SEPARADA POR ESPACIOS");
            int fila = sc.nextInt();
            int columna = sc.nextInt();
            tablero.ponFicha(fila, columna, tablero.turno);
        } while (!tablero.esGanador(tablero.turno) && !tablero.tableroLleno());
        if (tablero.tableroLleno()) {
            System.out.println("TABLAS");
        } else {
            System.out.println("Gana " + tablero.turno);
        }
    }
}

import java.util.Arrays;

public class Tablero {
    Casilla[][] casillas;
    boolean hayGanador;
    Jugador ganador;

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

    private boolean esGanador(Jugador jugador) {
        for (int i = 0; i < 3; i++) {

        }
        return false;
    }


    public Tablero() {
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
        Tablero tablero = new Tablero();
        System.out.println(tablero);
    }
}

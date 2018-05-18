public class Casilla {
    EstadoCasilla estado;

    public Casilla() {
        this.estado = EstadoCasilla.VACIA;
    }

    public EstadoCasilla getEstado() {
        return estado;
    }

    public void setEstado(EstadoCasilla estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        switch (estado) {
            case VACIA:
                return "·";
            case O:
                return "O";
            case X:
                return "X";
            default:
                return "SI LLEGA AQUÍ, ERROR";
        }
    }
}

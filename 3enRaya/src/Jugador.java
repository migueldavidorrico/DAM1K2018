public enum Jugador {
    PLAYER1(EstadoCasilla.O), PLAYER2(EstadoCasilla.X);
    EstadoCasilla estado;

    Jugador(EstadoCasilla x) {
        estado = x;
    }

    public EstadoCasilla getEstado() {
        return estado;
    }

    public void setEstado(EstadoCasilla estado) {
        this.estado = estado;
    }
}

public enum Jugador {
    PLAYER1(EstadoCasilla.O, "P1.png"), PLAYER2(EstadoCasilla.X, "P2.png");
    EstadoCasilla estado;
    String imagen;

    Jugador(EstadoCasilla x, String imagen) {
        estado = x;
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public EstadoCasilla getEstado() {
        return estado;
    }

    public void setEstado(EstadoCasilla estado) {
        this.estado = estado;
    }
}

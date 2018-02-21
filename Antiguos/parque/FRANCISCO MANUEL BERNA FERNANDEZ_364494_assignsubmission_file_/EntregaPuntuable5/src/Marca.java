public enum Marca {
    MERCEDES("Mercedes"), FORD("Ford"), PEGASO("Pegaso");
    private final String cadenaTipo;

    Marca(String nombre) {
        this.cadenaTipo = nombre;
    }

    @Override
    public String toString() {
        return cadenaTipo;
    }
}

public enum Marcas {
    MERCEDES("Mercedes"),
    PEGASO("Pegaso"),
    FORD("Ford");

    private String marca;

    Marcas(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return marca;
    }
}



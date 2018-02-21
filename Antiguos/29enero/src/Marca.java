public enum Marca {
    FANTA("Fanta"),MIRINDA("Mirinda"),COCACOLA("Coca Cola"),BEZOYA("Bezoya"),
    SOLAN("Solán de cabras"),LANJARON("Lanjarón");

    private final String nombre;

    Marca(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return  this.nombre;
    }
}

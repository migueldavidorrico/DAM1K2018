public enum Unidades {
    MEGAS("Mb", 1024 * 1024),
    BYTES("b", 1),
    KBS("Kb", 1024);

    String nombre;
    int multiplicador;


    Unidades(String nombre, int multiplicador) {
        this.nombre = nombre;
        this.multiplicador = multiplicador;
    }

    int getBytes(int bytes) {
        return bytes * this.multiplicador;
    }
}

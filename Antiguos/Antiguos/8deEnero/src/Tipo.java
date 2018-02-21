public enum Tipo {
    REY("Rey",'\u2654','\u265A'),
    REINA("Reina",'\u2655','\u265B'),
    TORRE("Torre",'\u2656','\u265C'),
    ALFIL("Alfil",'\u2657','\u265D'),
    CABALLO("Caballo",'\u2658','\u265E'),
    PEON("Peón",'\u2659','\u265F');
    private final String salida;
    private final char simboloBlancas;
    private final char simboloNegras;

    Tipo(String salida, char simboloBlancas, char simboloNegras) {
        this.salida = salida;
        this.simboloBlancas = simboloBlancas;
        this.simboloNegras = simboloNegras;
    }

    public char obtenSimbolo(Color c){
        if(c==Color.BLANCA){
            return this.simboloBlancas;
        } else {
            return this.simboloNegras;
        }
    }

    @Override
    public String toString() {
        return salida;
    }


}

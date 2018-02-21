public enum TipoFruta {
    BAYA("Baya"),CITRICO("Cítrico"),CUCURBITACEA("Cucurbitácea"),
    EXOTICA("Exótica"),DULCE("Dulce");
    String cadenaTipo;
    TipoFruta(String cadena){
        this.cadenaTipo=cadena;
    }

    @Override
    public String toString() {
        return cadenaTipo;
    }
}

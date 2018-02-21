public enum Palos {
    COPAS,ESPADAS,BASTOS,OROS;

    @Override
    public String toString() {
        String salida=this.name().substring(0,1).toUpperCase();
        salida+=this.name().substring(1).toLowerCase();
        return salida;
    }

    public String nombreDirectorio(){
        return this.name().toLowerCase();
    }
}

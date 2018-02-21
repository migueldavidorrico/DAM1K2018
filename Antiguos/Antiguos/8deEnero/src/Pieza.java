public class Pieza {
    private final Color color;
    private Tipo tipo;

    public Pieza(Color color, Tipo tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    public String salida(){
        return ""+this.tipo.obtenSimbolo(this.color);
    }

    public Color getColor() {
        return color;
    }
}

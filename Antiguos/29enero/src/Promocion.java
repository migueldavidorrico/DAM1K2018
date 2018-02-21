import javax.swing.*;

public enum Promocion {
    ENPROMOCION("En Promoción",10),SINPROMOCION("No tiene Promoción",0)
    ,PROMOCIONNAVIDAD("Promoción especial Navidad",50);

    private final String mensaje;
    private final int descuento;
    Promocion(String s,int descuento) {
        this.mensaje=s;
        this.descuento=descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        return mensaje;
    }
}

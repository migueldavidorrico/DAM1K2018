public class Fruta {
    private final String nombre;
    private final TipoFruta tipo;
    private final double calorias100gr;

    public TipoFruta getTipo() {
        return tipo;
    }

    public Fruta(String nombre, TipoFruta tipo, double calorias100gr) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.calorias100gr = calorias100gr;
    }

    @Override
    public String toString() {
        return this.nombre+" - "+this.getCalorias100gr();
    }

    public double getCalorias100gr() {
        return calorias100gr;
    }

    public String getNombre() {
        return nombre;
    }

    public static Fruta[] arrayInicial(){
        Fruta[] salida={
                new Fruta("Fresa",TipoFruta.BAYA,300),
                new Fruta("Plátano",TipoFruta.EXOTICA,100),
                new Fruta("Melón",TipoFruta.CUCURBITACEA,200),
                new Fruta("Kiwi",TipoFruta.EXOTICA,300),
                new Fruta("Albercoque",TipoFruta.DULCE,150),
                new Fruta("Mandarina",TipoFruta.CITRICO,600),
                new Fruta("Coco",TipoFruta.EXOTICA,350),
        };
        return salida;
    }
}

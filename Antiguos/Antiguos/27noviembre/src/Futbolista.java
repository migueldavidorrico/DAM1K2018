public class Futbolista {
    private final String nombre;
    private String apodo;
    private int dorsal;
    private final Posicion posicion;
    private int edad;
    private final double mediaGoleadora2016;
    private boolean estaEnForma;

    @Override
    public String toString() {
        return nombre  +
                ", apodo='" + getApodo() + '\'' +
                ", dorsal=" + dorsal +
                ", posicion=" + posicion +
                ", edad=" + edad +
                ", mediaGoleadora2016=" + mediaGoleadora2016 +
                ", estaEnForma=" + estaEnForma;
    }

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getMediaGoleadora2016() {
        return mediaGoleadora2016;
    }

    public boolean isEstaEnForma() {
        return estaEnForma;
    }

    public void setEstaEnForma(boolean estaEnForma) {
        this.estaEnForma = estaEnForma;
    }

    public int getDorsal(){
        return this.dorsal;
    }

    public void setDorsal(int dorsal){
        this.dorsal=dorsal;
    }

    public void setApodo(String apodo){
        this.apodo=apodo;
    }
    public String getApodo(){
        return this.apodo.toUpperCase();
    }

    public Futbolista(String nombre, int dorsal, Posicion posicion,int edad){
        this(nombre,nombre,dorsal,posicion,edad,0.0,true);
    }

    public Futbolista(String nombre, String apodo, int dorsal, Posicion posicion, int edad, double mediaGoleadora2016, boolean estaEnForma) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.edad = edad;
        this.mediaGoleadora2016 = mediaGoleadora2016;
        this.estaEnForma = estaEnForma;
    }
    public String posicionNombre(){
        return this.getPosicion().toString().toUpperCase()+": "+this.apodo;
    }

    public static void main(String[] args) {
        Futbolista maradona=new Futbolista("Maradona",10,Posicion.DELANTERO,20);
        System.out.println(maradona);
    }

}

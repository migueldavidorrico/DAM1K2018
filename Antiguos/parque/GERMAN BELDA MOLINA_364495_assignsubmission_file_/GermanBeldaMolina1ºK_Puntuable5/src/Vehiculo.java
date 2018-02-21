public class Vehiculo {

    private final String matricula;
    private final MarcaCoche marca;
    private final int cargaMaxima;
    private int kilometraje;

    public Vehiculo(String matricula, MarcaCoche marca, int cargaMaxima, int kilometraje) {
        this.matricula = matricula;
        this.marca = marca;
        this.cargaMaxima = cargaMaxima;
        this.kilometraje = kilometraje;
    }

    public String getMatricula() {
        return matricula;
    }

    public MarcaCoche getMarca() {
        return marca;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return  marca +"  "+
                "|| "+matricula +"  "+
                "|| "+cargaMaxima +"  "+"...Carga MAX"+
                "|| "+kilometraje+"...KMs";
    }
}

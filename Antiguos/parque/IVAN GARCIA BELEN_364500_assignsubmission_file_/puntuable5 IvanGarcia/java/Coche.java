public class Coche {
    private final String matricula;
    private final Marcas marca;
    private int cargaMaxima;
    private int kilometraje;
    public int contadorCoches;

    public Coche(String matricula, Marcas marca, int cargaMaxima, int kilometraje) {
        this.matricula = matricula;
        this.marca = marca;
        this.cargaMaxima = cargaMaxima;
        this.kilometraje = kilometraje;

    }

    public Coche(String matricula, Marcas marca, int cargaMaxima) {
        this.matricula = matricula;
        this.marca = marca;
        this.cargaMaxima = cargaMaxima;
        this.kilometraje = 0;


    }

    public String getMatricula() {
        return matricula;
    }



    public Marcas getMarca() {
        return marca;
    }


    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getKilometraje(){
        return kilometraje;
    }

    public String salidaDatos(){
        String salida=String.format("%20s %20s %20s %20s " , getMatricula(),getMarca() , getCargaMaxima()+" Kg", getKilometraje()+" Km");
        return salida;
    }



    @Override
    public String toString() {
        return matricula;
    }
}

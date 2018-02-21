public class Vehiculo {
    private int kilometraje;
    private Marcas marca;
    private int cargaMaxima;
    private String matricula;

    public int getKilometraje() {
        return kilometraje;
    }

    public Marcas getMarca() {
        return marca;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo(int kilometros, Marcas marca, int carga, String matricula) {
        this.kilometraje = kilometros;
        this.marca = marca;
        this.cargaMaxima = carga;
        this.matricula = matricula;
    }

    public Vehiculo(Marcas marca, int carga, String matricula) {
        this(0, marca, carga, matricula);
    }

    @Override
    public String toString() {
        return this.getMatricula();
    }

    public String getDatosVehiculo() {
        return String.format("%10s %10s %10dKg %8dkm",
                this.getMatricula(),
                this.getMarca(),
                this.getCargaMaxima(),
                this.getKilometraje());
    }

}
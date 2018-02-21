public class Vehiculo {

    private final String matricula; //AAA-9999
    private final Marca marca;
    private int cargaMaxima; //kilo
    private int kilometraje; //km

    public Vehiculo(String matricula, Marca marca, int cargaMaxima, int kilometraje) {
        this.matricula = matricula;
        this.marca = marca;
        this.cargaMaxima = cargaMaxima;
        this.kilometraje = kilometraje;
    }

    public Vehiculo(String matricula, Marca marca, int cargaMaxima) {
        this(matricula, marca, cargaMaxima, 0);
    }

    public String getMatricula() {
        return this.matricula;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public int getCargaMaxima() {
        return this.cargaMaxima;
    }

    public int getKilometraje() {
        return this.kilometraje;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String datosVehiculo() {
        return String.format("%10s %10s %8dKg %5dKm", this.matricula, this.marca, this.cargaMaxima, this.kilometraje);
    }

    @Override
    public String toString() {
        return this.matricula;
    }

    public static final Vehiculo[] porDefecto() {
        Vehiculo[] porDefecto = new Vehiculo[50];
        porDefecto[0] = new Vehiculo("2222-BBB", Marca.MERCEDES, 5000);
        porDefecto[1] = new Vehiculo("1111-AAA", Marca.FORD, 3500);
        porDefecto[2] = new Vehiculo("5555-EEE", Marca.FORD, 1000);
        porDefecto[3] = new Vehiculo("4444-DDD", Marca.MERCEDES, 3500);
        porDefecto[4] = new Vehiculo("3333-CCC", Marca.PEGASO, 4000);
        return porDefecto;
    }

    // pruebas
    public static void main(String[] args) {
        Vehiculo[] v = Vehiculo.porDefecto();
        for (Vehiculo b :
                v) {
            System.out.println(b);
        }

    }
}

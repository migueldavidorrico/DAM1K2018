public class Vehiculo {
    private final Marca marca;
    private int kilometraje;
    private final String matricula;
    private final int cargaMaximaKG;

    public Vehiculo(Marca marca, String matricula, int km, int cargaMax) {
        this.marca = marca;
        this.matricula = matricula;
        this.kilometraje = km;
        this.cargaMaximaKG = cargaMax;
    }

    public Vehiculo(Marca marca, String matricula, int cargaMax) {
        this(marca, matricula, 0, cargaMax);
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCargaMaximaKG() {
        return cargaMaximaKG;
    }

    public String DescripciónVehiculo() {
        return "Marca: " + this.getMarca() + "\n" +
                "Matrícula: " + this.getMatricula() + "\n" +
                "Kilometraje: " + this.getKilometraje() + " Km\n" +
                "Carga Máxima: " + this.getCargaMaximaKG() + " Kg\n";
    }

    public String getCadenaDatos() {
        return String.format("%15s %15s %10dKg %7dkm", this.getMatricula(), this.getMarca(), this.getCargaMaximaKG(), this.getKilometraje());
    }

    @Override
    public String toString() {
        return matricula;
    }
}

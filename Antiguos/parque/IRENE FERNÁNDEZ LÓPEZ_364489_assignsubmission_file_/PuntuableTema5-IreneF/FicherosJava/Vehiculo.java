public class Vehiculo {
    private final String matricula;
    private final Marca marca;
    private final int carga;
    private final int kilometraje;

    public Vehiculo(String matricula, Marca marca, int carga, int kilometraje){
        this.matricula=matricula;
        this.marca=marca;
        this.carga=carga;
        this.kilometraje=kilometraje;
    }
    public Vehiculo(String matricula, Marca marca, int carga){
        this(matricula,marca,carga,0);
    }

    public String getMatricula() {
        return matricula;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getCarga() {
        return carga;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    @Override
    public String toString() {
        return "<html><pre style=\"font-size:120%;color:blue;\">"+String.format("%10s",getMatricula()) + " "
                + String.format("%10s",getMarca().toString()) + " " + String.format("%10d",getCarga()) + " "
                + String.format("%10d",getKilometraje());
    }

    public static void main(String[] args) {
        Vehiculo nuevo=new Vehiculo("SE-3040-DG",Marca.PEGASO, 1500, 250);
        Vehiculo otro=new Vehiculo("1978-YBH",Marca.MERCEDES,1400);
        System.out.println(nuevo);
        System.out.println(otro);
    }
}

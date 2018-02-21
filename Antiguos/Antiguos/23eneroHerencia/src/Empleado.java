public abstract class Empleado {
    public static final int PLUS=300;
    private final String nombre;
    private int edad;
    private int salario;

    public abstract boolean plus();

    @Override
    public String toString() {
        return nombre+" - "+edad+" años "+salario+"€";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
}

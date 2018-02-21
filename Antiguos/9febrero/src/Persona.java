public class Persona {
    String nombre;
    int edad;
    String puesto;

    public Persona(String nombre, int edad, String puesto) {
        if(edad<0 || edad>120){
            throw new IllegalArgumentException("Edad mala");
        }
        if(nombre==null || "".equals(nombre)){
            throw new IllegalArgumentException("Nombre malo");
        }
        if(puesto==null || "".equals(puesto)){
            throw new IllegalArgumentException("Puesto malo");
        }
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return  nombre + ", puesto='" + puesto ;
    }
}

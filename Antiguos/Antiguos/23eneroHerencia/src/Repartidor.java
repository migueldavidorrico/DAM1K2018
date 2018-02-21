public class Repartidor extends Empleado{
    private String zona;

    public Repartidor(String nombre, int edad, int salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    @Override
    public boolean plus() {
        if(getEdad()<25 && this.zona.equals("zona 3")){
            setSalario(getSalario()+PLUS);
            System.out.println("Aumenta el salario");
            return true;
        }
        System.out.println("no aumenta el salario");
        return false;
    }

    @Override
    public String toString() {
        return "Repartidos: "+super.toString()+ " trabaja en: "+this.zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}

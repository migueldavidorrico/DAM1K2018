public class Comercial extends Empleado{
    private double comision;

    @Override
    public boolean plus() {
        if(getEdad()>30 && comision>300){
            setSalario(getSalario()+PLUS);
            System.out.println("Aumenta el salario");
            return true;
        }
        System.out.println("no aumenta el salario");
        return false;
    }

    @Override
    public String toString() {
        return "Comercial: "+super.toString()+ "comision de:" +comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public Comercial(String nombre, int edad, int salario, double comision) {
        super(nombre, edad, salario);
        this.comision=comision;
    }
}

public class Empresa {
    private final String nombre;
    private int ingresos;
    private int gastos;

    private static int numeroEmpresas=0;

    public String getNombre(){
        return nombre;
    }

    public int getBeneficio(){
        return this.ingresos-this.gastos;
    }

    public static int devuelveImpuesto(){
        if (numeroEmpresas < 10) {
            return 5;
        }
        if(numeroEmpresas<=20){
            return 10;
        }
        return 15;
    }

    public int pagoImpuestos(){
        int beneficio=ingresos-gastos;
        if(beneficio<=0){
            return 0;
        }
        return beneficio*Empresa.devuelveImpuesto()/100;
    }

    public Empresa(String nombre){
        this(nombre,0,0);
    }
    public Empresa(String nombre,int ingresos,int gastos){
        this.nombre=nombre;
        this.ingresos=ingresos;
        this.gastos=gastos;
        numeroEmpresas++;
    }
}

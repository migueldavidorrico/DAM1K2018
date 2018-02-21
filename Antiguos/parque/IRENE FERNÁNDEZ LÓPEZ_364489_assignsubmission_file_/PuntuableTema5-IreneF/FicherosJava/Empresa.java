import javax.swing.*;
import java.util.Arrays;

public class Empresa {
    private static final int MAXIMO_VEHICULOS=50;
    private static Vehiculo[] parqueMovil=new Vehiculo[MAXIMO_VEHICULOS];
    private static int numeroDeVehiculos=0;

    public static Empresa Inicializa(){
        Empresa parqueMovil=new Empresa();
        parqueMovil.anyadeVehiculo(new Vehiculo("IF-5439-DL",Marca.FORD,1230));
        parqueMovil.anyadeVehiculo(new Vehiculo("5674-HDY",Marca.PEGASO,1500,350));
        parqueMovil.anyadeVehiculo(new Vehiculo("2999-ABE",Marca.MERCEDES,1800,820));
        parqueMovil.anyadeVehiculo(new Vehiculo("1000-XDT",Marca.PEGASO,1500));
        parqueMovil.anyadeVehiculo(new Vehiculo("SA-5676-TP",Marca.FORD,2000,1050));
        return parqueMovil;
    }

    public static boolean anyadeVehiculo(Vehiculo v){
        if(numeroDeVehiculos==MAXIMO_VEHICULOS){
            return false;
        }
        parqueMovil[numeroDeVehiculos++]=v;
        return true;
    }

    public static void altaVehiculo(){
        Empresa parqueMovil=new Empresa();
        Vehiculo v=pideDatosVehiculo();
        if (parqueMovil.anyadeVehiculo(v)){
            JOptionPane.showMessageDialog(null,"Se ha dado de alta satisfactoriamente el vehiculo.");
        }else{
            JOptionPane.showMessageDialog(null,"Se ha alcanzado el máximo de Vehiculos.");
        }
    }

    private static Vehiculo pideDatosVehiculo() {
        String matricula=JOptionPane.showInputDialog(null,"Introduce la matrícula del vehiculo: ");
        if (matricula==null || matricula.equals("")){
            return null;
        }
        if (compruebaMatricula(matricula)) {
            Marca marca = (Marca) JOptionPane.showInputDialog(null, "Elige la marca del vehiculo: ",
                    "Marca", JOptionPane.OK_OPTION, null, Marca.values(), Marca.PEGASO);
            if (marca == null) {
                return null;
            }
            String cadenaCarga = JOptionPane.showInputDialog(null, "Introduce la carga máxima en kg: ");
            if (cadenaCarga == null || cadenaCarga.equals("")) {
                return null;
            }
            int carga = Integer.parseInt(cadenaCarga);
            String cadenaKilometraje = JOptionPane.showInputDialog(null, "Introduce el kilometraje (opcional): ");
            if (cadenaKilometraje == null || cadenaKilometraje.equals("")) {
                return new Vehiculo(matricula, marca, carga);
            }
            int kilometraje = Integer.parseInt(cadenaKilometraje);
            return new Vehiculo(matricula, marca, carga, kilometraje);
        }
        return null;
    }

    private static boolean compruebaMatricula(String matricula) {
        for (int i = 0; i < numeroDeVehiculos; i++) {
            if (matricula.equals(parqueMovil[i].getMatricula())){
                JOptionPane.showMessageDialog(null,"Este vehiculo ya esta dado de alta.");
                return false;
            }
        }
        return true;
    }

    public static String listadoVehiculos() {
        ordenaBurbuja(parqueMovil);
        String salida="<html><pre style=\"font-size:120%;color:purple;\">"
                +String.format("%9s %10s %12s %11s", "Matrícula","Marca","Carga_Máxima","Kilometraje")+"</pre>";
        for (int i=0; i<numeroDeVehiculos; i++){
            salida+=parqueMovil[i]+"<br />";
        }
        return salida;
    }

    private static void ordenaBurbuja(Vehiculo[] parqueMovil) {
        for (int i = 0; i < numeroDeVehiculos; i++) {
            for (int j = 0; j < numeroDeVehiculos - 1; j++) {
                if (parqueMovil[j].toString().compareTo(parqueMovil[j+1].toString())>0){
                    Vehiculo aux=parqueMovil[j];
                    parqueMovil[j]=parqueMovil[j+1];
                    parqueMovil[j+1]=aux;
                }
            }
        }
    }

    public static String datosDelVehiculo(){
        String[] matriculas=new String[numeroDeVehiculos];
        for (int i = 0; i < numeroDeVehiculos; i++) {
            matriculas[i]=parqueMovil[i].getMatricula();
        }
        String matricula = (String)JOptionPane.showInputDialog(null, "Elige la matricula del vehiculo: ",
                "Datos del vehiculo: ", JOptionPane.OK_OPTION, null, matriculas, matriculas[0]);
        String salida="<html><pre style=\"font-size:120%;color:purple;\">"
                +String.format("%9s %10s %12s %11s", "Matrícula","Marca","Carga_Máxima","Kilometraje")+"</pre>";
        for (int i = 0; i < numeroDeVehiculos; i++) {
            if (matricula.equals(parqueMovil[i].getMatricula())){
                salida+=""+parqueMovil[i];
            }
        }
        return salida;
    }

    public static void bajaVehiculo() {
        String[] matriculas=new String[numeroDeVehiculos];
        for (int i = 0; i < numeroDeVehiculos; i++) {
            matriculas[i]=parqueMovil[i].getMatricula();
        }
        String matricula = (String)JOptionPane.showInputDialog(null, "Elige la matricula del vehiculo: ",
                "Vehiculo a dar de baja: ", JOptionPane.OK_OPTION, null, matriculas, matriculas[0]);
        if (borrar(matricula)){
            JOptionPane.showMessageDialog(null, "El vehículo se ha borrado correctamente.");
        }
    }

    private static boolean borrar(String matricula) {
        int posicionBuscada=0;
        for (int i = 0; i < numeroDeVehiculos; i++) {
            if (parqueMovil[i].getMatricula().equals(matricula)){
                posicionBuscada=i;
            }
        }
        for (int i = posicionBuscada; i <numeroDeVehiculos ; i++) {
            parqueMovil[i]=parqueMovil[i+1];
        }
        numeroDeVehiculos--;
        return true;
    }
}

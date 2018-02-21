import javax.swing.*;

public class ParqueMovil {
    public final Vehiculo[] vehiculos = new Vehiculo[50];

    public String pideMatricula() {
        return JOptionPane.showInputDialog("Introduce la matricula");
    }

    public Vehiculo seleccionaVehiculo() {

        return (Vehiculo) JOptionPane.showInputDialog(null,
                "Selecciona el vehículo", "Selecciona", JOptionPane.PLAIN_MESSAGE, null,
                vehiculos, vehiculos[0]);
    }

    public void nuevoVehiculo(String matricula) {
        Marca marca = (Marca) JOptionPane.showInputDialog(null,
                "Selecciona la marca", "Marca",
                JOptionPane.PLAIN_MESSAGE, null, Marca.values(), Marca.values()[0]);
        int cargaMax = Integer.parseInt(JOptionPane.showInputDialog("Introduce la carga máxima del vehículo:"));
        int selector = 0;
        while (this.vehiculos[selector] != null) {
            selector++;
        }
        this.vehiculos[selector] = new Vehiculo(marca, matricula, cargaMax);
    }

    public void eliminaVehiculo(Vehiculo v) {
        if (v == null) {
        } else {
            for (int i = 0; i < vehiculos.length; i++) {
                if (vehiculos[i].equals(v)) {
                    vehiculos[i] = null;
                    break;
                }
            }
        }
    }

    public boolean existeVehiculo(Vehiculo v) {
        if (v == null) {
            return false;
        } else {
            for (Vehiculo vh : this.vehiculos) {
                if (vh.equals(v)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void vehiculosIniciales() {
        this.vehiculos[0] = new Vehiculo(Marca.FORD, "G-4353-CSS", 10000);
        this.vehiculos[1] = new Vehiculo(Marca.MERCEDES, "A-1873-ML", 12000);
        this.vehiculos[2] = new Vehiculo(Marca.PEGASO, "S-2345-AXG", 20000);
        this.vehiculos[3] = new Vehiculo(Marca.MERCEDES, "A-2335-SIN", 2000);
        this.vehiculos[4] = new Vehiculo(Marca.FORD, "MA-8845-SIS", 5000);
        for (int i = 5; i < vehiculos.length; i++) {
            vehiculos[i] = null;
        }
    }

    public void eliminaTodo() {
        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i] = null;
        }
    }

    public String listadoVehiculos() {
        String listado = "";
        for (Vehiculo v : this.vehiculos) {
            if (v == null) {
            } else {
                listado += v.getCadenaDatos() + "\n";
            }
        }
        return listado;
    }
}

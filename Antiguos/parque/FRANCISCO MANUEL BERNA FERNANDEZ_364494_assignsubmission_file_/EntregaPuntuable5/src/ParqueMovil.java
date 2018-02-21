import javax.swing.*;
import java.util.Arrays;

public class ParqueMovil {

    private static final int MAX_VEHICULOS_EN_PARQUE = 50;
    private static final int VEHICULOS_POR_DEFECTO = 5;
    private static final String MENSAJE_PARQUE_VACIO = "No hay vehículos en el parque";
    private Vehiculo[] parque = new Vehiculo[MAX_VEHICULOS_EN_PARQUE];
    private static int cantidadVehiculos = 0;


    public ParqueMovil() {
    }

    public void ParqueMovilPorDefecto() {
        this.parque = Vehiculo.porDefecto();
        cantidadVehiculos = VEHICULOS_POR_DEFECTO;
    }

    public Vehiculo[] parqueMovilRecortado(Vehiculo[] parque) {
        Vehiculo[] parqueMovilRecortado;
        parqueMovilRecortado = Arrays.copyOf(parque, cantidadVehiculos);
        return parqueMovilRecortado;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    @Override
    public String toString() {
        String salida = String.format("%10s %10s %10s %10s", "MATRÍCULA", "MARCA", "CARGA", "KM") + "\n";
        for (Vehiculo b :
                this.parque) {
            salida += b + "\n";
        }
        return salida;
    }

    private boolean existeMatriculaEnParque(Vehiculo v) {
        if (v == null) {
            return false;
        }
        int posicionMatricula = Utilidades.buscarPosicionEnArray(this.parque, v.getMatricula());
        if (posicionMatricula >= 0) {
            return true;
        }
        return false;
    }

    public boolean anyadeVehiculo() {
        if (this.getCantidadVehiculos() >= MAX_VEHICULOS_EN_PARQUE) {
            JOptionPane.showMessageDialog(null, "El parque esta lleno");
            return false;
        }

        Vehiculo v = Utilidades.entradaVehiculo();
        boolean existeVehiculo = existeMatriculaEnParque(v);
        if (v == null) {
            JOptionPane.showMessageDialog(null, "Entrada cancelada");
            return false;
        } else if (existeVehiculo) {
            JOptionPane.showMessageDialog(null, "La matrícula introducida ya existe");
            return false;
        } else {
            int posicionLibre = Utilidades.buscaPosicionVacia(this.parque);
            this.parque[posicionLibre] = v;
            JOptionPane.showMessageDialog(null, "Vehículo añadido con éxito");
            cantidadVehiculos++;
            return true;
        }
    }

    public boolean borrarVehiculo() {
        if (getCantidadVehiculos() <= 0) {
            JOptionPane.showMessageDialog(null, MENSAJE_PARQUE_VACIO);
            return false;
        }

        Vehiculo vehiculoABorrar = (Vehiculo) JOptionPane.showInputDialog(null, "Selecciona un vehículo", "MATRÍCULA", JOptionPane.DEFAULT_OPTION, null, parqueMovilRecortado(this.parque), parqueMovilRecortado(this.parque)[0]);
        if (vehiculoABorrar == null) {
            JOptionPane.showMessageDialog(null, "Borrado cancelado");
            return false;
        } else {
            String matricula = vehiculoABorrar.getMatricula();
            int posicionVehiculoBorrar = Utilidades.buscarPosicionEnArray(parque, matricula);
            for (int i = posicionVehiculoBorrar; i < parque.length - 1; i++) {
                parque[i] = parque[i + 1];
            }
            cantidadVehiculos--;
            JOptionPane.showMessageDialog(null, "Vehículo borrado con éxito");
            return true;
        }
    }

    private String obtenListaVehiculos() {
        Vehiculo[] v = parqueMovilRecortado(this.parque);

        String salida = "";
        salida += "<HTML><h2>LISTADO DE VEHÍCULOS:</h2>";
        salida += "<hr/>";
        salida += "<pre style=\"font-size:130%\">";
        salida += String.format("%10s %10s %10s %5s", "MATRÍCULA", "MARCA", "CARGA", "KM");
        salida += "<hr/>";
        for (int i = 0; i < cantidadVehiculos; i++) {
            salida += Utilidades.salidaVehiculo(v[i]);
            salida += "<br/>";
        }
        salida += "</pre><hr/></html>";
        return salida;
    }

    public boolean mostrarListado() {
        if (cantidadVehiculos <= 0) {
            JOptionPane.showMessageDialog(null, MENSAJE_PARQUE_VACIO);
            return false;
        } else {
            JOptionPane.showMessageDialog(null, obtenListaVehiculos());
            return true;
        }
    }

    public boolean mostrarDatosVehiculoSeleccionado() {
        if (cantidadVehiculos <= 0) {
            JOptionPane.showMessageDialog(null, MENSAJE_PARQUE_VACIO);
            return false;
        }
        Vehiculo seleccionado = (Vehiculo) JOptionPane.showInputDialog(null, "Selecciona una Vehículo", null, JOptionPane.DEFAULT_OPTION, null, parqueMovilRecortado(this.parque), parqueMovilRecortado(this.parque)[0]);
        if (seleccionado == null) {
            return false;
        } else {
            JOptionPane.showMessageDialog(null, seleccionado.datosVehiculo());
            return true;
        }
    }

    public void ordenaParquePorMatricula() {
        Utilidades.ordenaArray(this.parque,cantidadVehiculos);
    }
}

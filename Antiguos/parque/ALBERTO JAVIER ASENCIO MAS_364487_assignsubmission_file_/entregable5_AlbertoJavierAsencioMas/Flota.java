import javax.swing.*;

public class Flota {
    private static final int VEHICULOS_MAXIMOS = 50;
    private Vehiculo[] vehiculos = new Vehiculo[VEHICULOS_MAXIMOS];
    private static int cantidadVehiculos = 0;

    public boolean altaVehiculo(Vehiculo vehiculo) {
        if (cantidadVehiculos == VEHICULOS_MAXIMOS) {
            return false;
        } else {
            this.vehiculos[cantidadVehiculos] = vehiculo;
            this.cantidadVehiculos++;
            return true;
        }
    }

    public int posicionVehiculo(Vehiculo vehiculoABuscar) {
        int posicion = -1;
        for (int i = 0; i < this.cantidadVehiculos; i++) {
            if (this.vehiculos[i].getMatricula().equals(vehiculoABuscar.getMatricula())) {
                posicion = i;
            }
        }
        return posicion;
    }

    public boolean bajaVehiculo(Vehiculo vehiculo) {
        int posicionABorrar = this.posicionVehiculo(vehiculo);

        if (posicionVehiculo(vehiculo) != -1) {
            for (int i = posicionABorrar; i < cantidadVehiculos; i++) {
                this.vehiculos[i] = this.vehiculos[i + 1];
            }
            this.cantidadVehiculos--;
            return true;
        } else {
            return false;
        }
    }

    public void flotaInicial() {
        this.altaVehiculo(new Vehiculo(300, Marcas.FORD, 3000, "4352-GHY"));
        this.altaVehiculo(new Vehiculo(Marcas.MERCEDES, 5000, "5432-BGC"));
        this.altaVehiculo(new Vehiculo(Marcas.MERCEDES, 3500, "1234-NKU"));
        this.altaVehiculo(new Vehiculo(150, Marcas.PEGASO, 3000, "7865-RTW"));
        this.altaVehiculo(new Vehiculo(Marcas.FORD, 2000, "9874-HYQ"));
    }

    public String getCadenaFlota() {
        String cadena = "";
        if (this.cantidadVehiculos == 0) {
            return "No hay ningún vehiculo";
        } else {
            cadena = cadena + String.format("%10s %10s %10s %14s", "Matricula", "Marca", "Carga", "KM");
            cadena += "\n";
            for (int i = 0; i < this.cantidadVehiculos; i++) {
                cadena = cadena + this.vehiculos[i].getDatosVehiculo() + "\n";
            }

            return cadena;
        }
    }

    public Vehiculo[] menuDesplegable() {
        Vehiculo[] salida = new Vehiculo[this.cantidadVehiculos];

        for (int i = 0; i < this.cantidadVehiculos; i++) {
            salida[i] = this.vehiculos[i];
        }

        return salida;
    }

    public static Vehiculo introducirVehiculo() {
        String matricula = JOptionPane.showInputDialog(null, "Matricula");
        if (matricula == null) {
            return null;
        } else {
            Marcas marca = (Marcas) JOptionPane.showInputDialog((null),
                    "Marca",
                    "Marca",
                    0,
                    null,
                    Marcas.values(),
                    Marcas.FORD);

            if (marca == null) {
                return null;
            } else {
                String StringCarga = JOptionPane.showInputDialog(null, "Carga Máxima");
                if (StringCarga == null) {
                    return null;
                } else {
                    int carga = Integer.parseInt(StringCarga);
                    Vehiculo vehiculo = new Vehiculo(marca, carga, matricula);
                    return vehiculo;
                }
            }
        }
    }

    public boolean comprobarMatricula(Vehiculo vehiculo) {
        for (int i = 0; i < cantidadVehiculos; i++) {
            if (this.vehiculos[i].getMatricula().equals(vehiculo.getMatricula())) {
                return true;
            }
        }
        return false;

    }

    public static Flota ordenarMatriculas(Flota flota) {
        Vehiculo aux;

        for (int i = 0; i < cantidadVehiculos - 1; i++) {
            for (int j = 0; j < cantidadVehiculos - i - 1; j++) {
                if (flota.vehiculos[j].getMatricula().compareTo(flota.vehiculos[j + 1].getMatricula()) > 0) {
                    aux = flota.vehiculos[j];
                    flota.vehiculos[j] = flota.vehiculos[j + 1];
                    flota.vehiculos[j + 1] = aux;
                }
            }
        }
        return flota;
    }
}

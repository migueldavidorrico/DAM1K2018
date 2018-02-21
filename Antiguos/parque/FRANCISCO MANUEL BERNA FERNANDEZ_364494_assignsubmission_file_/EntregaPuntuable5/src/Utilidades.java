import javax.swing.*;

public class Utilidades {
    public Utilidades() {
    }

    public static int buscaPosicionVacia(Vehiculo[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static int buscarPosicionEnArray(Vehiculo[] v, String matricula) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == null) {
                return -1;
            }
            if (v[i].getMatricula().equals(matricula)) {
                return i;
            }
        }
        return -1;
    }

    public static Vehiculo entradaVehiculo() {
        String matricula = JOptionPane.showInputDialog(null, "Introduzca una matricula con el siguiente formato 1111-XXX");
        if (matricula == null) {
            return null;
        } else {
            Marca marca = (Marca) JOptionPane.showInputDialog(null, "Seleccione una marca", "MARCA", 0, null, Marca.values(), Marca.MERCEDES);
            if (marca == null) {
                return null;
            } else {
                String cargaString = JOptionPane.showInputDialog(null, "Carga Maxima:");
                if (cargaString == null) {
                    return null;
                } else {
                    int cargaMaxima = Integer.parseInt(cargaString);
                    Vehiculo v = new Vehiculo(matricula, marca, cargaMaxima);
                    return v;
                }
            }
        }

    }

    public static String salidaVehiculo(Vehiculo v) {
        String salida = "";

        salida += "<hr/>";
        salida += v.datosVehiculo();

        return salida;
    }

    public static void ordenaArray(Vehiculo[] v, int longitudOrdenacion) {
        int menor;
        Vehiculo aux;

        for (int i = 0; i < longitudOrdenacion - 1; i++) {
            menor = i;
            for (int j = i + 1; j < longitudOrdenacion; j++) {
                if (v[j].getMatricula().compareTo((v[menor].getMatricula())) < 0) {
                    menor = j;
                }
            }
            if (menor != i) {
                aux = v[menor];
                v[menor] = v[i];
                v[i] = aux;
            }
        }
    }

    public static boolean comprobarSalir() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
            return true;
        }
        return false;
    }
}
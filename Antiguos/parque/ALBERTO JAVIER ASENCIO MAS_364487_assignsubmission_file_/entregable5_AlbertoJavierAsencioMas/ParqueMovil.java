import javax.swing.*;

public class ParqueMovil {
    private static Flota flota;

    public static void main(String[] args) {
        flota = new Flota();

        if (JOptionPane.showConfirmDialog(null,
                "¿Quieres inicializar la flota con 5 vehiculos?",
                "Inicialización", 0) == 0) {
            flota.flotaInicial();
            flota = Flota.ordenarMatriculas(flota);
        }

        JOptionPane.showMessageDialog(null, flota.getCadenaFlota());
        Menu opcionMenu;
        do {
            int opcion = JOptionPane.showOptionDialog(null,
                    "Elija una opción",
                    "Menu",
                    0,
                    -1,
                    null,
                    Menu.values(),
                    Menu.Alta);

            opcionMenu = Menu.values()[opcion];
            Vehiculo[] desplegable;
            Vehiculo vehiculo;

            switch (opcionMenu) {
                case Alta:
                    vehiculo = Flota.introducirVehiculo();
                    if (vehiculo == null) {
                        JOptionPane.showMessageDialog(null, "Fallo al introducir algun dato");
                    } else if (flota.comprobarMatricula(vehiculo)) {
                        JOptionPane.showMessageDialog(null, "El vehiculo ya existe");
                    } else {
                        flota.altaVehiculo(vehiculo);
                    }
                    break;
                case Baja:
                    desplegable = flota.menuDesplegable();
                    if (desplegable.length > 0) {
                        vehiculo = (Vehiculo) JOptionPane.showInputDialog(null,
                                "Elija un vehiculo a dar de baja",
                                "Lista disponible",
                                3,
                                null,
                                desplegable, desplegable[0]);

                        flota.bajaVehiculo(vehiculo);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay ningún vehiculo");
                    }
                    break;
                case Datos:
                    flota = Flota.ordenarMatriculas(flota);
                    desplegable = flota.menuDesplegable();

                    if (desplegable.length > 0) {
                        vehiculo = (Vehiculo) JOptionPane.showInputDialog(null,
                                "Elije un vehiculo a mostrar",
                                "Lista disponible",
                                3,
                                null,
                                desplegable,
                                desplegable[0]);
                        if (vehiculo != null) {
                            String cadena = String.format("%10s %10s %13s %14s",
                                    "Matricula", "Marca", "Carga", "KM");
                            cadena += "\n" + vehiculo.getDatosVehiculo();
                            JOptionPane.showMessageDialog(null, cadena);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay ningún vehiculo");
                    }
                    break;
                case Listado:
                    flota = Flota.ordenarMatriculas(flota);
                    JOptionPane.showMessageDialog(null, flota.getCadenaFlota());
                    break;
                default:
                    break;
            }
        } while (opcionMenu != Menu.Salir);
    }
}

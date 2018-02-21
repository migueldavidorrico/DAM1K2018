import javax.swing.*;

public class MenuPrincipal {
    private boolean comprobarSalir = false;

    public MenuPrincipal() {
    }

    public void iniciarMenu(ParqueMovil parqueMovil) {
        if (JOptionPane.showConfirmDialog(null, "Desea inicializar el parque con 5 vehiculos?", null, JOptionPane.YES_NO_OPTION) == 0) {
            parqueMovil.ParqueMovilPorDefecto();
            parqueMovil.ordenaParquePorMatricula();
            parqueMovil.mostrarListado();
        }
    }

    public void ejecutarMenuPincipal(ParqueMovil parqueMovil) {
        BotonesMenu presionado;

        do {
            int opcionElegida = JOptionPane.showOptionDialog(null, "Elige una opcion", "MENU", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, BotonesMenu.values(), BotonesMenu.ALTA);
            if (opcionElegida < 0) {
                presionado = BotonesMenu.SALIR;
            } else {
                presionado = BotonesMenu.values()[opcionElegida];
            }

            switch (presionado) {
                case ALTA:
                    parqueMovil.anyadeVehiculo();
                    parqueMovil.ordenaParquePorMatricula();
                    break;
                case BAJA:
                    parqueMovil.borrarVehiculo();
                    break;
                case DATOS:
                    parqueMovil.mostrarDatosVehiculoSeleccionado();
                    break;
                case LISTADO:
                    parqueMovil.mostrarListado();
                    break;
                case SALIR:
                    comprobarSalir = Utilidades.comprobarSalir();
                default:
                    break;
            }
        } while (!comprobarSalir);
    }
}

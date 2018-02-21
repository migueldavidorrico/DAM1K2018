
import javax.swing.*;

public class ProgramaPrincipal {
    private static Flota Flota;
    private static int SALIR = 4;
    private static int CANCELAR = -1;

    public static void main(String[] args) {

        Flota = new Flota();
        int botonIntroducido;
        int p = JOptionPane.showConfirmDialog(null, "¿Desea iniciar con 5 coches?", "Pregunta", JOptionPane.YES_NO_OPTION);

        if (p == JOptionPane.YES_OPTION) {
            Flota.iniciarFlota();
            JOptionPane.showMessageDialog(null, Flota.listarCoches());
        } else JOptionPane.showMessageDialog(null, Flota.listarCoches());


        do {

            botonIntroducido = JOptionPane.showOptionDialog(null, "Menú", "Escoga una opción", 0, 0, null, BotonesMenu.values(), BotonesMenu.ALTA);
            System.out.println(botonIntroducido);

            switch (botonIntroducido) {
                case 0:
                    if (Flota.comprobarMaximoCoches() == false) {
                        JOptionPane.showMessageDialog(null, "Se ha excedido el máximo de coches permitidos");
                        continue;
                    }

                    String introducirMatricula = JOptionPane.showInputDialog(null, "Introduzca el número de matrícula");
                    if (introducirMatricula == null) {
                        JOptionPane.showMessageDialog(null, "Has cancelado el alta del coche\n " +
                                "Volviendo al menu principal...");

                        System.out.println(introducirMatricula);
                        continue;
                    } else if (Flota.comprobarMatricula(introducirMatricula) == false) {
                        JOptionPane.showMessageDialog(null, "Este coche ya está añadido.");
                        continue;
                    }
                    String matricula = Utilidades.pasarAMayusculas(introducirMatricula);

                    Marcas marca = (Marcas) JOptionPane.showInputDialog(null, "Marca", "Introduzca la marca del coche", JOptionPane.QUESTION_MESSAGE, null, Marcas.values(), Marcas.FORD);

                    if (marca == null) {
                        JOptionPane.showMessageDialog(null, "Has cancelado el alta del coche\n " +
                                "Volviendo al menu principal...");
                        continue;
                    }
                    String carga = JOptionPane.showInputDialog(null, "Introduzca la carga máxima");
                    System.out.println(carga);
                    if (carga == null) {
                        JOptionPane.showMessageDialog(null, "Has cancelado el alta del coche\n " +
                                "Volviendo al menu principal...");
                        continue;
                    }
                    int cargaMax = Integer.parseInt(carga);
                    Flota.darDeAlta(new Coche(matricula, marca, cargaMax));
                    break;
                case 1: {
                    if (Flota.comprobarSiHayCoches() == false) {
                        JOptionPane.showMessageDialog(null, "No hay ningún coche creado\n" +
                                "Volviendo al menu principal...");
                        continue;
                    }
                    Coche c = (Coche) JOptionPane.showInputDialog(null, "Seleccione matrícula", "Seleccione la matrícula del coche a borrar.", JOptionPane.QUESTION_MESSAGE, null, Flota.seleccionarCoche(), Flota.seleccionarCoche()[0]);
                    if (c == null) {
                        JOptionPane.showMessageDialog(null, "Has cancelado la baja del coche\n " +
                                "Volviendo al menu principal...");
                        continue;
                    }

                    Flota.borrarCoche(c);
                    System.out.println(Flota.listarCoches());
                    break;
                }

                case 2: {
                    if (Flota.comprobarSiHayCoches() == false) {
                        JOptionPane.showMessageDialog(null, "No hay ningún coche creado\n" +
                                "Volviendo al menu principal...");
                        continue;
                    }
                    Coche c = (Coche) JOptionPane.showInputDialog(null, "Datos", "Introduzca la matrícula del coche: ", JOptionPane.QUESTION_MESSAGE, null, Flota.seleccionarCoche(), Flota.seleccionarCoche()[0]);

                    if (c == null) {
                        continue;
                    }
                    JOptionPane.showMessageDialog(null, c.salidaDatos());
                    break;
                }

                case 3: {
                    JOptionPane.showMessageDialog(null, Flota.listarCoches());
                }
                break;
            }


        } while (botonIntroducido != SALIR && botonIntroducido != CANCELAR);


    }
}

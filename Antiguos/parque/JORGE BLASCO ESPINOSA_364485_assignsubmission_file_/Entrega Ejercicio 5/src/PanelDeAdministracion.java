import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDeAdministracion {
    private JButton botonAlta;
    private JButton botonListado;
    private JButton botonBaja;
    private JPanel menuPrincipal;
    private JButton botonDatos;
    private static String[] opciones = {"Si", "No"};
    private static ParqueMovil p = new ParqueMovil();

    public PanelDeAdministracion() {

        botonAlta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.nuevoVehiculo(p.pideMatricula());
                JOptionPane.showMessageDialog(null, "El vehículo se ha dado de Alta correctamente.");
            }
        });
        botonBaja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vehiculo v = p.seleccionaVehiculo();
                if (p.existeVehiculo(v)) {
                    p.eliminaVehiculo(v);
                    JOptionPane.showMessageDialog(null, "El vehículo se ha dado de baja correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "El vehículo no existe.");
                }
            }
        });
        botonDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vehiculo v = p.seleccionaVehiculo();
                if (v == null) {
                    JOptionPane.showMessageDialog(null, "No hay vehículo");
                } else {
                    JOptionPane.showMessageDialog(null, v.DescripciónVehiculo());
                }
            }
        });
        botonListado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, p.listadoVehiculos(), "Listado", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {

        if (JOptionPane.showOptionDialog(null,
                "¿Quieres empezar el parque con 5 vehiculos predefinidos?",
                "Vehiculos predefinidos", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]) == 0) {
            p.vehiculosIniciales();
        } else {
            p.eliminaTodo();
        }
        JFrame frame = new JFrame("Panel de Administración");
        frame.setContentPane(new PanelDeAdministracion().menuPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

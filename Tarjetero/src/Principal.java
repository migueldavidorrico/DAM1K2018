import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.time.LocalDateTime;

public class Principal {
    JFrame ventanaLector = new JFrame("LECTOR");
    JPanel panelLector;
    JLabel bienvenida = new JLabel("Acerque su tarjeta o llavero");
    String introducidas = "";
    String id;

    JFrame ventanaNuevo = new JFrame("NUEVO USUARIO");
    JPanel panelNuevo;
    JTextField nombre = new JTextField();

    JFrame ventanaInfo = new JFrame("INFO USUARIO");
    JPanel panelinfo;
    JLabel hola;
    String persona;

    private void inicializa() {
        panelLector = new JPanel();
        panelLector.add(bienvenida);
        panelLector.setFocusable(true);
        panelLector.requestFocusInWindow();
        panelLector.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                System.out.println(e.getKeyChar() + " - " + e.getKeyCode());
                char pulsada = e.getKeyChar();
                if (Character.isDigit(pulsada)) {
                    introducidas += pulsada;
                    if (introducidas.length() == 10) {
                        System.out.println("Se ha introducido el ID:" + introducidas);
                        id = introducidas;
                        introducidas = "";
                        File fichero = new File(id);
                        if (!fichero.exists()) {
                            System.out.println("CREANDO ID: " + id);
                            ventanaNuevo.setVisible(true);
                        } else {
                            try (BufferedReader br = new BufferedReader(new FileReader(new File(id)))) {
                                persona = br.readLine();
                                bienvenida.setText("Bienvenido: " + persona);
                                hola.setText("Bienvenido " + persona + " Hoy es " + LocalDateTime.now());
                                ventanaInfo.setVisible(true);
                            } catch (FileNotFoundException e1) {
                                e1.printStackTrace();
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }
                } else {
                    introducidas = "";
                }

            }
        });


        nombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(id)))) {
                    bw.write(nombre.getText());
                    nombre.setText("");
                    ventanaNuevo.setVisible(false);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        panelNuevo = new JPanel(new GridLayout(2, 0));
        panelNuevo.add(new JLabel("Nombre: "));
        panelNuevo.add(nombre);
        ventanaNuevo.add(panelNuevo);
        ventanaNuevo.setBounds(400, 400, 200, 100);
        ventanaNuevo.setVisible(false);

        panelinfo = new JPanel();
        hola = new JLabel("");

        panelinfo.add(hola);
        ventanaInfo.add(panelinfo);
        ventanaInfo.setBounds(0, 0, 600, 600);
        ventanaInfo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        ventanaInfo.setVisible(false);


        ventanaLector.add(panelLector);
        ventanaLector.setBounds(10, 10, 300, 200);
        ventanaLector.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        ventanaLector.pack(); Demasiado pequeño
        ventanaLector.setVisible(true);
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.inicializa();

    }
}

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    private static PanelInfoPais panelinfo = new PanelInfoPais();
    private static JList<String> listaPaises;
    private static List<CancionEurovision> miLista = new ArrayList<>();
    private static JButton anyadirPais = new JButton("Añadir País");
    private static JButton votarPais = new JButton("Votar País");
    private static DefaultListModel<String> modelo = new DefaultListModel<>();
    private static JButton guardar = new JButton("Guardar en Archivo");

    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("Euro2018")))) {
            miLista = (List<CancionEurovision>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (CancionEurovision c :
                miLista) {
            modelo.addElement(c.getPais().toString());
        }

        listaPaises = new JList<>(modelo);
        listaPaises.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);

        listaPaises.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String nombrePais = listaPaises.getSelectedValue();
                Pais elegido = Pais.valueOf(nombrePais);
                for (CancionEurovision c :
                        miLista) {
                    if (c.getPais().equals(elegido)) {
                        panelinfo.setCancion(c);
                        break;
                    }
                }

            }
        });


        JFrame frame = new JFrame("EUROVISIÓN 2018");
        frame.setLayout(new GridLayout(0, 2, 10, 10));
        JScrollPane scroll = new JScrollPane(listaPaises);
        frame.add(scroll);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panelinfo.getPanel());

        JPanel dummy = new JPanel(new GridLayout(0, 2, 5, 5));
        dummy.add(anyadirPais);
        anyadirPais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<String> nombresPaises = new ArrayList<>();
                for (Pais p :
                        Pais.values()) {
                    nombresPaises.add(p.toString());
                    System.out.println(p.toString());
                }
                for (CancionEurovision c : miLista) {
                    nombresPaises.remove(c.getPais().toString());
                }
                MiDialogoCanciones pideCancion = new MiDialogoCanciones(
                        frame,
                        nombresPaises.toArray(new String[0])
                );
                pideCancion.setVisible(true);
                CancionEurovision c = pideCancion.getCancion();
                miLista.add(c);
                modelo.addElement(c.getPais().toString());
            }
        });
        dummy.add(votarPais);
        votarPais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (miLista.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "La lista de paises estávacía");
                    return;
                }
                String seleccionado = listaPaises.getSelectedValue();
                Pais aVotar = Pais.valueOf(seleccionado);
                CancionEurovision c = null;
                for (CancionEurovision cancion :
                        miLista) {
                    if (cancion.getPais().equals(aVotar)) {
                        c = cancion;
                        break;
                    }
                }
                MiDialogoVotacion dialogoVotacion = new MiDialogoVotacion(frame, c);
                dialogoVotacion.setVisible(true);
                c.votacion(dialogoVotacion.getPais(), dialogoVotacion.getVotos());
                panelinfo.setCancion(c);
            }
        });
        dummy.add(guardar);
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("Euro2018")))) {
                    oos.writeObject(miLista);
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        frame.add(dummy);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

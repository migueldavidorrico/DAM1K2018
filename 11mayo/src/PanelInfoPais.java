import com.sun.javafx.collections.MappingChange;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.*;

public class PanelInfoPais {
    private CancionEurovision cancion;
    private final JPanel panel;

    private final JTextField nombrePais;
    private final JTextField nombreCancion;
    private final JList<String> votaciones;
    private final JLabel puntosTotales;

    public PanelInfoPais() {
        this.cancion = null;
        this.panel = new JPanel();
        nombrePais = new JTextField(10);
        nombrePais.setToolTipText("Por favor,Introduce el nombre");
        nombreCancion = new JTextField(10);
        nombreCancion.setToolTipText("Por favor, el nombre");
        votaciones = new JList<>();
        puntosTotales = new JLabel("Tiene 0 puntos");

        inicializaPanel();
    }

    private void inicializaPanel() {
        JPanel dummy = new JPanel();
        dummy.setLayout(new GridLayout(0, 2, 10, 10));
        TitledBorder titled = new TitledBorder("País");
        panel.setLayout(new GridLayout(0, 1, 10, 10));
        dummy.add(new JLabel("País:"));
        dummy.add(nombrePais);
        dummy.add(new JLabel("Canción:"));
        dummy.add(nombreCancion);
        this.panel.add(dummy);
        this.panel.add(new JLabel("Votaciones"));
        JScrollPane scroll = new JScrollPane(votaciones);

        scroll.setSize(200, 200);
        this.panel.add(scroll);
        puntosTotales.setFont(new Font(Font.SERIF, Font.PLAIN, 24));
        this.panel.add(puntosTotales);
    }

    public CancionEurovision getCancion() {
        return cancion;
    }

    public void setCancion(CancionEurovision cancion) {

        this.cancion = cancion;
        this.nombreCancion.setText(cancion.getTitulo());
        this.nombrePais.setText(cancion.getPais().name());
        TreeMap<Pais, Integer> votos = cancion.getPuntosOtorgados();
        List<String> lista = new ArrayList<>();
        int totalPuntos = 0;
        for (Map.Entry<Pais, Integer> entrada :
                votos.entrySet()) {

            lista.add(String.format("<html><pre>%2d - %10s", entrada.getValue(), entrada.getKey()));
            totalPuntos += entrada.getValue();
        }
        puntosTotales.setText("Tiene " + totalPuntos + " puntos");
        System.out.println(Arrays.deepToString(lista.toArray()));
        votaciones.setListData(lista.toArray(new String[0]));

    }

    public JPanel getPanel() {
        return panel;
    }

    public static void main(String[] args) {

        CancionEurovision doitforyourlove = new CancionEurovision(Pais.ESPAÑA, "Do It For your Love");
        doitforyourlove.votacion(Pais.ALEMANIA, 12);
        doitforyourlove.votacion(Pais.FRANCIA, 10);
        doitforyourlove.votacion(Pais.AUSTRALIA, 8);
        doitforyourlove.votacion(Pais.ITALIA, 2);


        JFrame frame = new JFrame("Prueba del Panel Canción");
        frame.setLayout(new GridLayout(1, 0, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelInfoPais panelInfoPais = new PanelInfoPais();
        frame.add(panelInfoPais.getPanel());
        JButton anyadeEspaña = new JButton("AñadeEspaña");
        frame.add(anyadeEspaña);
        anyadeEspaña.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {
                                               panelInfoPais.setCancion(doitforyourlove);
                                           }
                                       }
        );
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiDialogoVotacion extends JDialog {
    private CancionEurovision cancionEurovision;
    private JComboBox<Pais> votante;
    private JComboBox<Integer> puntos;
    private JButton votar;
    JDialog dialogo;
    JButton aceptar;

    public MiDialogoVotacion(Frame frame, CancionEurovision cancionEurovision) {
        super(frame, true);
        this.cancionEurovision = cancionEurovision;
        dialogo = this;
        this.getContentPane().setSize(300, 300);
        this.getContentPane().setLayout(new GridLayout(0, 2, 5, 5));
        JLabel paisAVotar = new JLabel("Va usted a votar a: " + cancionEurovision.getPais());
        paisAVotar.setFont(new Font(Font.SERIF, Font.PLAIN, 24));
        JLabel tituiloCancionAVotar = new JLabel("Canción: " + this.cancionEurovision.getTitulo());
        tituiloCancionAVotar.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

        this.getContentPane().add(paisAVotar);
        this.getContentPane().add(tituiloCancionAVotar);
        this.getContentPane().add(new JLabel("Elija El País votante"));
        votante = new JComboBox<>(Pais.values());
        this.getContentPane().add(votante);
        this.getContentPane().add(new JLabel("Puntos que se lleva"));
        Integer[] valoresPosibles = {12, 10, 8, 7, 6, 5, 4, 3, 2, 1};
        puntos = new JComboBox<>(valoresPosibles);
        this.getContentPane().add(puntos);
        aceptar = new JButton("Votar");
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ;
                dialogo.dispose();
            }
        });
        this.getContentPane().add(aceptar);
        this.pack();
    }

    public Pais getPais() {
        return (Pais) this.votante.getSelectedItem();
    }

    public Integer getVotos() {
        return (Integer) this.puntos.getSelectedItem();
    }

    public static void main(String[] args) {

        CancionEurovision doitforyourlove = new CancionEurovision(Pais.ESPAÑA, "Do It For your Love");
        MiDialogoVotacion dialogo = new MiDialogoVotacion(null, doitforyourlove);
        dialogo.setVisible(true);
    }
}

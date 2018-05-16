import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiDialogoCanciones extends JDialog {
    CancionEurovision nueva;
    String[] paisesPosibles;
    String tituloCancion;
    JDialog dialogo;
    JComboBox<String> listaPaises;
    JTextField textoTitulo;
    JButton aceptar;

    public MiDialogoCanciones(Frame frame, final String[] paisesPosibles) {
        super(frame, true);
        this.paisesPosibles = paisesPosibles;
        dialogo = this;
        this.getContentPane().setSize(300, 300);
        this.getContentPane().setLayout(new GridLayout(0, 2, 5, 5));
        this.getContentPane().add(new JLabel("Elija El país"));

        listaPaises = new JComboBox<>(paisesPosibles);
        this.getContentPane().add(listaPaises);
        this.getContentPane().add(new JLabel("Titulo de la canción"));
        textoTitulo = new JTextField(10);
        this.getContentPane().add(textoTitulo);
        aceptar = new JButton("Aceptar");
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obtenCancion();
                dialogo.dispose();
            }
        });
        this.getContentPane().add(aceptar);
        this.pack();
    }

    private void obtenCancion() {
        this.nueva = new CancionEurovision(
                Pais.valueOf((String) listaPaises.getSelectedItem()),
                textoTitulo.getText()
        );
    }

    public CancionEurovision getCancion() {
        return this.nueva;
    }

    public static void main(String[] args) {
        String[] paises = {"ESPAÑA", "FRANCIA", "UK"};

        MiDialogoCanciones dialogo = new MiDialogoCanciones(null, paises);
        dialogo.setVisible(true);
        System.out.println(dialogo.getCancion());
    }
}

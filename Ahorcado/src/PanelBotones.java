import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBotones {
    JPanel panel;
    JButton[] botones;
    Controlador controlador;

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;


    }

    public PanelBotones(Controlador controlador) {
        this.controlador = controlador;
        this.panel = new JPanel(new GridLayout(3, 0));
        this.botones = new JButton[26];
        for (char i = 'a'; i <= 'z'; i++) {
            this.botones[i - 'a'] = new JButton();
            this.botones[i - 'a'].setText(("" + i).toUpperCase());
            this.botones[i - 'a'].setFont(new Font("Arial", Font.ITALIC, 24));
            this.botones[i - 'a'].setForeground(Color.BLUE);
            this.botones[i - 'a'].setName("" + i);
            this.botones[i - 'a'].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton pulsado = (JButton) e.getSource();
                    controlador.pulsadaLetra(pulsado.getName());
                    System.out.println(pulsado.getName());
                    pulsado.setEnabled(false);
                }
            });
            this.panel.add(this.botones[i - 'a']);
        }


    }

    public static void main(String[] args) {
//        PanelBotones panelBotones=new PanelBotones();
//        JFrame frame = new JFrame("LAS TRES EN RAYA"); //TITULO
//        frame.setResizable(false);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
////        frame.pack();
//        frame.add(panelBotones.getPanel());
//        frame.setSize(600, 200);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);//MUESTRA LA VENTANA

    }
}

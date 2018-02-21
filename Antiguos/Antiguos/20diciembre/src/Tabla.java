import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabla {
    static private JFrame miFrame;
    static private JTable tabla;
    static private JPanel panel1;
    static private JLabel etiqueta;
    static private JTextField etiqueta2;

    public static void main(String[] args) {
        etiqueta2=new JTextField("0");
        etiqueta=new JLabel("Prueba");
        miFrame=new JFrame("PRUEBA DE JTABLE");
        panel1=new JPanel(new GridLayout(2,2));
        miFrame.add(panel1);
        panel1.add(etiqueta);
        String[] titulos={"A","B","C"};
        String[][] informacion={
                {"1","3","4"},
                {"1","5","7"},
                {"1","3","l"}
        };



        Timer Reloj = new Timer(1, action);
        Reloj.start();
        tabla=new JTable(informacion,titulos);
        panel1.add(tabla);
        panel1.add(etiqueta2);
        miFrame.setVisible(true);
        miFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        miFrame.setSize(400,300);
        miFrame.setLocationRelativeTo(null);


        //


    }
    static ActionListener action = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            // Acciones a ejecutar cada "delay".
            int numero=Integer.parseInt(etiqueta2.getText());
            numero++;
            etiqueta2.setText(""+numero++);
        }
    };

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RadioButtonEjemplo {
    static JFrame frame;
    static JRadioButton[] botones = {
            new JRadioButton("Azul"),
            new JRadioButton("Rojo"),
            new JRadioButton("Verde"),
    };
    static JCheckBox[] checkBoxes = {
            new JCheckBox("Queso"),
            new JCheckBox("Aceitunas Negras"),
            new JCheckBox("Tomate"),
            new JCheckBox("Albercoques")
    };


    private static void createAndShowGUI() {
        frame = new JFrame("Ejemplo Texto"); //TITULO
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CERRAR VENTANA
        frame.setLayout(new GridLayout(0, 2, 10, 10));

        frame.add(new JLabel("Nombre:"));
        ButtonGroup grupo = new ButtonGroup();

        for (JRadioButton boton :
                botones) {

            grupo.add(boton);
            frame.add(boton);
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    muestraBotonPulsado(e);
                }
            });
        }
        botones[0].setActionCommand("Ponlo en azul");
        botones[1].setActionCommand("Ponlo en Rojo");
        botones[2].setActionCommand("Va a ser verde");


        for (JCheckBox c :
                checkBoxes) {
            c.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    muestraPizza(e);
                }
            });
            frame.add(c);
        }

        frame.pack();//LO PONE TODO AL TAMAÑO MÍNIMO NECESARIO
        frame.setLocationRelativeTo(null);
//        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//MUESTRA LA VENTANA
    }

    private static void muestraPizza(ActionEvent e) {
        List<String> ingredientes = new ArrayList<>();
        for (JCheckBox c :
                checkBoxes) {
            if (c.isSelected()) {
                ingredientes.add(c.getText());
            }
        }
        if (ingredientes.size() == 0) {
            System.out.println("PIZZA SOSA");
            return;
        }
        String salida = "";
        Iterator<String> iterator = ingredientes.iterator();
        salida += iterator.next();
        if (iterator.hasNext()) {
            salida += " y " + iterator.next();
            while (iterator.hasNext()) {
                salida = iterator.next() + ", " + salida;
            }
        }
        System.out.println("La pizza la quieres: " + salida);
    }

    private static void muestraBotonPulsado(ActionEvent e) {
        for (JRadioButton boton :
                botones) {
            if (e.getSource().equals(boton)) {
                System.out.println("Has pulsado: " + boton.getText());
                System.out.println("Y quieres  que hagamos: " + e.getActionCommand());

            }
        }
        switch (e.getActionCommand()) {
            case "Ponlo en azul":
                System.out.println("En el switch");
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (Exception e) {
                    // If Nimbus is not available, you can set the GUI to another look and feel.
                }

                createAndShowGUI();
            }
        });
    }
}

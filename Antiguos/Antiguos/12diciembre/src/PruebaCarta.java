import javax.swing.*;

public class PruebaCarta {
    public static void main(String[] args) {
        Palos elegido=(Palos) JOptionPane.showInputDialog(null,
                "Elige un palo",
                "Palos de la baraja",
                JOptionPane.OK_CANCEL_OPTION,
                null,
                Palos.values(),
                Palos.OROS);
        Valor valorElegido=(Valor) JOptionPane.showInputDialog(null,
                "Elige un valor",
                "Valores de la baraja",
                JOptionPane.OK_CANCEL_OPTION,
                null,
                Valor.values(),
                Valor.AS);
        Carta c=new Carta(elegido,valorElegido);
        JOptionPane.showMessageDialog(null,"Ha elegido el "+c);
    }
}

import javax.swing.*;

public class PruebaValores {
    public static void main(String[] args) {
        Valor valorElegido=(Valor) JOptionPane.showInputDialog(null,
                "Elige un valor",
                "Valores de la baraja",
                JOptionPane.OK_CANCEL_OPTION,
                null,
                Valor.values(),
                Valor.AS);
        JOptionPane.showMessageDialog(null,
                "La carta elegida tiene un valor de:"+valorElegido.getValorCadena());
    }
}

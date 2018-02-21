import javax.swing.*;

public class PruebaPalos {
    public static void main(String[] args) {
        Palos p=Palos.valueOf("OROS");
        Palos[] distintos=Palos.values();
        System.out.println(p);
        System.out.println(p.name());
        System.out.println("Palos de la baraja:");
        for (Palos palo:distintos
             ) {
            System.out.println(palo);
        }
        Palos elegido=(Palos)JOptionPane.showInputDialog(null,
                "Elige un palo",
                "Palos de la baraja",
                JOptionPane.OK_CANCEL_OPTION,
                null,
                Palos.values(),
                Palos.OROS);
        if(elegido==null) {
            System.out.println("No has elegido nada");
        } else {
            if(elegido.equals(Palos.BASTOS)){
                JOptionPane.showMessageDialog(null,"A mí también me gustan los bastos");
            }
        }
    }
}

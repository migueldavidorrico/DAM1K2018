import javax.swing.*;

public class Histograma {
    public static void main(String[] args) {
        int numeroIntroducido= Integer.parseInt(JOptionPane.showInputDialog(null,"Numero"));
        int numerosPositivos=0;
        int numerosNegativos=0;
        while(numeroIntroducido!=0){
            if(numeroIntroducido>0){
                numerosPositivos++;
            } else {
                numerosNegativos++;
            }
            numeroIntroducido= Integer.parseInt(JOptionPane.showInputDialog(null,"Numero"));
        }
        String salida="";
        salida+="Positivos:";
        for (int i = 0; i <numerosPositivos; i++) {
            salida+="*";
        }
        salida+="\nNegativos:";
        for (int i = 0; i <numerosNegativos; i++) {
            salida+="*";
        }
        JOptionPane.showMessageDialog(null,salida);

    }
}

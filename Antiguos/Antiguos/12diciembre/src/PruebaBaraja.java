import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class PruebaBaraja {
    public static void main(String[] args) {
        Baraja baraja=new Baraja();
//        JOptionPane.showMessageDialog(null,baraja);
        baraja.shuffleArray();
        double puntuacionActual=0;
        while(puntuacionActual<=7.5){
            if(JOptionPane.showConfirmDialog(null,"Llevas "+puntuacionActual+"\n"+"¿Te plantas?","Elige",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                break;
            } else {
                Carta c = baraja.reparteCarta();
                JOptionPane.showMessageDialog(null, "Te ha salido: " + c,"CARTA",JOptionPane.YES_OPTION,c.getIcono());
                puntuacionActual += c.getValor();
                if(puntuacionActual==7.5){
                    break;
                }
            }
        }
        String anyade="\n";
        if(puntuacionActual<7.5){
            anyade="Te quedas como estas";
        }
        if(puntuacionActual==7.5){
            anyade="Ganas el doble";
        }
        if(puntuacionActual>7.5){
            anyade="Has perdido";
        }
        JOptionPane.showMessageDialog(null, "Has conseguido: "+puntuacionActual+anyade);


    }
}

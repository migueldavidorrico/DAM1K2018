import javax.swing.*;

public class ESVentanaBebida {
    public static AguaMineral pideAgua(){
        Bebida b=pideBebida();
        String origen= JOptionPane.showInputDialog("% Azúcar?");
        return new AguaMineral(b,origen);
    }
    public static BebidaAzucarada pideBebidaAzucarada(){
        Bebida b=pideBebida();
        int azucar= Integer.parseInt(JOptionPane.showInputDialog("% Azúcar?"));
        Promocion p=Promocion.values()[JOptionPane.showOptionDialog(null,"¿Está en promoción?","Elige",JOptionPane.OK_OPTION,
                JOptionPane.INFORMATION_MESSAGE,null,Promocion.values(),Promocion.SINPROMOCION)];
        BebidaAzucarada bebidaAzucarada=new BebidaAzucarada(b,azucar);
        bebidaAzucarada.setPromocion(p);
        return bebidaAzucarada;
    }
    public static Bebida pideBebida(){
        String ID= JOptionPane.showInputDialog("Introduce el ID");
        int litros= Integer.parseInt(JOptionPane.showInputDialog("Litros?"));
        int precio= Integer.parseInt(JOptionPane.showInputDialog("Precio?"));
        Marca marca= (Marca)JOptionPane.showInputDialog(null,
                "Marca",
                "Elige la marca",JOptionPane.INFORMATION_MESSAGE,null,
                Marca.values(),Marca.COCACOLA);
        return new Bebida(ID,litros,precio,marca);
    }
    public static Bebida pideBebidaConEleccion(){
        String[] opciones={
                "Bebida simple","Azucarada","Agua"
        };
        int elegida=JOptionPane.showOptionDialog(null,"¿Qué tipo de bebida?","Elige",JOptionPane.OK_OPTION,
                JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
        switch(elegida){
            case 0: return pideBebida();
            case 1: return pideBebidaAzucarada();
            case 2:return pideAgua();
        }
        return null;
    }

    public static void main(String[] args) {
        Bebida[] bebidas=new Bebida[4];
        for (int i = 0; i < bebidas.length; i++) {
            bebidas[i]=pideBebidaConEleccion();
        }
        for (Bebida b :
                bebidas) {
            System.out.println(b);
        }
    }

}

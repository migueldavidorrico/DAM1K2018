import javax.swing.*;

public class ESFruta {
    public static String muestraFrutas(Fruta[] frutero){
        String salida="<html><h1 style=\"font-family:Serif;\">Frutero</h1><pre style=\"font-size:160%;color:red;\">";
        for (Fruta f :
                frutero) {
            if(f.getTipo()==TipoFruta.EXOTICA){
                salida += "<span style=\"font-size:160%;color:green;\">"+f+"</span><br />";
            } else {
                salida += f + "<br />";
            }
        }
        return salida;
    }
    public static Fruta pideFrutaOSal(){
        Fruta nueva;
        do{
            nueva=ESFruta.pideFruta();
            if(nueva==null){
                if(JOptionPane.showConfirmDialog(null,"¿Desea Salir?","SALIDA",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                    return null;
                }
            }
        } while(nueva==null);
        return nueva;
    }
    public static Fruta pideFruta(){
        String nombre= JOptionPane.showInputDialog(null,"Nombre de la Fruta");
        if(nombre==null || nombre.equals("")){
            return null;
        }
        TipoFruta tipo=(TipoFruta) JOptionPane.showInputDialog(
                null,
                "Tipo de Fruta",
                "TIPO",
                JOptionPane.OK_OPTION,
                null,
                TipoFruta.values(),
                TipoFruta.EXOTICA);
        if(tipo==null){
            return null;
        }
        String cadenaCalorias=JOptionPane.showInputDialog(null,"Calorias");
        if(cadenaCalorias==null){
            return null;
        }
        int calorias=Integer.parseInt(cadenaCalorias);
        return new Fruta(nombre,tipo,calorias);
    }

    public static void main(String[] args) {
        Fruta nueva=ESFruta.pideFruta();
        System.out.println(nueva);
    }

}

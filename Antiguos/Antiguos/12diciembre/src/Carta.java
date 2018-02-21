import javax.swing.*;

public class Carta {
    private Palos palo;
    private Valor valor;
    private Icon icono;

    public Carta(Palos palo, Valor valor) {
        this.palo = palo;
        this.valor = valor;
        String ruta=palo.nombreDirectorio()+"/"+valor.getNombreFichero()+".jpg";
        this.icono= new ImageIcon(ruta);
    }

    public double getValor(){
        return this.valor.getValor();
    }

    @Override
    public String toString() {
        return this.valor+" de "+this.palo;
    }

    public static void main(String[] args) {
        Carta c=new Carta(Palos.BASTOS,Valor.CABALLO);
        JOptionPane.showMessageDialog(null,"Prueba","Prueba",JOptionPane.YES_OPTION,c.getIcono());
    }

    public Icon getIcono() {
        return icono;
    }
}

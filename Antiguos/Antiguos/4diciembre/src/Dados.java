import javax.swing.*;

public class Dados {
    public static void main(String[] args) {
        int numeroPosibilidades=0;
        int numeroObjetivo=Integer.parseInt(JOptionPane.showInputDialog(null,"numero"));
        String salida="<html><body><p style=\"size:24px\">";
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                System.out.println(i + "+" + j+"="+(i+j));
                if(i+j==numeroObjetivo){
                    numeroPosibilidades++;
                    salida+=i + "+" + j+"\n";
                }
            }
        }
        salida+="El número de combinaciones es: "+numeroPosibilidades+"</p>";
        System.out.println(salida);
        JOptionPane.showMessageDialog(null,String.format(salida));
    }
}

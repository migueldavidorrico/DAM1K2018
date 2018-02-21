import javax.swing.*;

public class Euler5b {
    public static boolean esElBuscado(int n,int numeroDivisores){
        for(int i=1;i<=numeroDivisores;i++){
            if(n%i!=0){
                return false;
            }
        }
        return true;
    }
    public static int menorDivisibleEntreTodos(int numeroDivisores){
        int numeroActual=1;
        while(!esElBuscado(numeroActual, numeroDivisores)){
            numeroActual++;
        }
        return numeroActual;
    }
    public static void main(String[] args) {
        int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Divisores"));
        JOptionPane.showMessageDialog(null,menorDivisibleEntreTodos(numero));
    }
}

import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Segundo {
    public static void muestraPosicion(int[] vector,int posicion){
        System.out.println(vector[posicion]);
    }
    public static void lanzaChecked() throws FileNotFoundException {
//        throw new FileNotFoundException();
    }
    public static void lanzaNoChecked(){
        throw new IllegalArgumentException();
    }
    public static int[] pideNNumeros(int n) {
        int[] salida=new int[n];
        for (int i = 0; i < salida.length; i++) {
            salida[i]=pideNumeroBien();
        }
        return salida;
    }
    public static void main(String[] args) {
//            System.out.println(pideNumeroBien());
        int[] vector={7,5,4,23,4,5,56,45,453,34};
        try {
            int i=0;
            while(true){
                System.out.println(vector[i++]);
            }
        } catch (Exception e) {
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    private static int pideNumeroBien() {
        int numero=0;
        String entrada=JOptionPane.showInputDialog(null, "Numero?");
        if(entrada==null){
            throw new QuiereSalirException("Quiere Salir");
        }
        Integer introducido=Integer.parseInt(entrada);
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero?"));
        System.out.println(50/numero);
        return numero;
    }
}

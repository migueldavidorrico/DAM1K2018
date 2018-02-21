import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Primera {
    public static void muestraPosicion(int[] vector,int posicion){
        System.out.println(vector[posicion]);
    }
    public static void lanzaChecked() throws FileNotFoundException {
//        throw new FileNotFoundException();
    }
    public static void lanzaNoChecked(){
        throw new IllegalArgumentException();
    }
    public static int[] pideNNumeros(int n) throws Exception {
        int[] salida=new int[n];
        for (int i = 0; i < salida.length; i++) {
            salida[i]=pideNumeroBien();
        }
        return salida;
    }
    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(pideNNumeros(3)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"CANCELASTE");
        }

//
//        try {
//            System.out.println("Antes");
//            lanzaChecked();
//            System.out.println("Después");
//        } catch (FileNotFoundException e) {
//            System.out.println("Saltó");
//            e.printStackTrace();
//        } finally{
//            System.out.println("Se ejecuta sí o sí");
//        }
//        int[] a={3,4,5,6};
//        muestraPosicion(a,8);
//        int a=6;
//        int b=0;
//        System.out.println(a / b);
    }

    private static int pideNumeroBien() throws Exception {
        boolean respuestaCorrecta=false;
        int numero=0;
        while(!respuestaCorrecta) {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero?"));
                System.out.println(numero * 2);
                respuestaCorrecta=true;
            } catch (NumberFormatException n) {
                if(n.getMessage().equals("null")){
                    JOptionPane.showMessageDialog(null,"HAS PULSADO CANCELAR");
                    throw new Exception("Se pulsó cancelar");
                }
                JOptionPane.showMessageDialog(null,"HAS ESCRITO MAL EL NÚMERO");
            }
        }
        return numero;
    }
}

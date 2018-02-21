import javax.swing.*;
import java.util.Arrays;

public class MuestraSeleccionados {
    public static void main(String[] args) {
        int[] a = {3, 2, 4, 45, 5, 6, 4, 34, 6, 5, 76567, 54, 6, 34, 5, 34, 4};
        System.out.println(Arrays.toString(modifica(a, new Operable() {
            @Override
            public int modifica(int n) {
                return 2 * n;
            }
        })));
        System.out.println(Arrays.toString(modifica(a, new Operable() {
            @Override
            public int modifica(int n) {
                if(n%2==0){
                    return 0;
                }
                return n;
            }
        })));
        System.out.println(Arrays.toString(modifica(a, new Operable() {
            @Override
            public int modifica(int n) {
                return n+10;
            }
        })));


//
//        muestraEnPantalla(a, new Mostrable() {
//            @Override
//            public void muestra(int n) {
//                System.out.println(n);
//            }
//        });
//        muestraEnPantalla(a, new Mostrable() {
//            @Override
//            public void muestra(int n) {
//                JOptionPane.showMessageDialog(null,""+n);
//            }
//        });
//        muestraEnPantalla(a, new Mostrable() {
//            @Override
//            public void muestra(int n) {
//                JOptionPane.showMessageDialog(null,"<html><pre>"+n);
//            }
//        });
//
//

    }

    private static int[] modifica(int[] a,Operable p) {
        int[] salida=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            salida[i]=p.modifica(a[i]);
        }
        return salida;
    }

    static void muestraEnPantalla(int[] a,Mostrable m){
        for (int n :
                a) {
            m.muestra(n);
        }
    }
    static void muestraSeleccion(int[]a, Seleccionable s){
        for (int n :a) {
            if (s.esElegible(n)) {
                System.out.println(n);
            }
        }
    }

}

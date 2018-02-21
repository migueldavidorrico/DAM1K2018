import java.util.Arrays;
import java.util.Scanner;

public class Seleccion {
    private static Scanner sc=new Scanner(System.in);
    public static void seleccion(Fruta[] a){
        for (int i = 0; i < a.length-1; i++) {
            int posicionMinimo= obtienePosicionMinimoDesdeIndice(a,i);
            if(i!=posicionMinimo){
                intercambia(a,i,posicionMinimo);
            }
        }
    }

    private static void intercambia(Fruta[] a, int i, int posicionMinimo) {
        Fruta aux=a[i];
        a[i]=a[posicionMinimo];
        a[posicionMinimo]=aux;
    }

    private static int obtienePosicionMinimoDesdeIndice(Fruta[] a, int i) {
        Fruta minimo=a[i];
        int posicionMinimo=i;
        for (int j = i+1; j <a.length; j++) {
            if(a[j].getTipo().compareTo(minimo.getTipo())>0 ||
                    (a[j].getTipo().compareTo(minimo.getTipo())==0
                            && a[j].getNombre().compareTo(minimo.getNombre())>0))
            {
                minimo=a[j];
                posicionMinimo=j;
            }

        }
        return posicionMinimo;
    }

    public static void main(String[] args) {
        Fruta[] miArray=Fruta.arrayInicial();
        System.out.println(Arrays.toString(miArray));
        seleccion(miArray);
        System.out.println(Arrays.toString(miArray));
    }
}

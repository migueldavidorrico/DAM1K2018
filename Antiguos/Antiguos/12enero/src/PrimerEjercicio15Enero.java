import java.util.Arrays;

public class PrimerEjercicio15Enero {
    public static void main(String[] args) {
        int[] array={1,4,7,9,0,9,3,2,3};

        System.out.println(estaEnArray(array, 0)?"El número está en el array":"No está en el array");
        System.out.println("El número aparece "+contarEnteros(array, 9)+" veces en el array.");
        System.out.println(posicionEnteros(array, 3));
    }

    private static int[] posicionEnteros(int[] array, int numero) {
        int[] posiciones=new int[contarEnteros(array, numero)];
        int porElQueVoy=0;
        for (int i = 0; i < array.length; i++) {
            if (numero==array[i]){
                posiciones[porElQueVoy++]=i;
            }
        }
        return posiciones;
    }

    private static int contarEnteros(int[] array, int numero) {
        int cantidad=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==numero){
                cantidad++;
            }
        }
        return cantidad;
    }

    private static boolean estaEnArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==numero){
                return true;
            }
        }
        return false;
    }


}

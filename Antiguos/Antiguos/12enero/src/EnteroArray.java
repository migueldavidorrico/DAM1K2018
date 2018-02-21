import java.util.Arrays;

public class EnteroArray {
    static int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};

    public static void main(String[] args) {
        System.out.println(estaEnArray(9));
        System.out.println(Arrays.toString(posicionesQueEsta(9)));
    }
    static int numeroDeVeces=0;
    public static boolean estaEnArray(int numero){
        for (int i = 0; i <enteros.length; i++) {
            if (enteros[i]==numero){
                return true;
            }
        }
        return false;
    }
    public static int[] posicionesQueEsta(int numero){
        int[] todasLasPosiciones=new int[enteros.length];
        int j=0;
        for (int i = 0; i < enteros.length; i++) {

            if (enteros[i]==numero){
                numeroDeVeces++;
                todasLasPosiciones[j++]=i;
                System.out.println("Entro");
            }
        }
        return todasLasPosiciones;
    }
}
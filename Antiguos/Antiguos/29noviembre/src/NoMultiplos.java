/*
Escriba un programa que muestre los números naturales menores o
iguales que un número n determinado, que no sean múltiplos ni
de 3 ni de 7.
 */
public class NoMultiplos {
    public static void main(String[] args) {
        int numeroFinal = 24;
        for (int i = 1; i <= numeroFinal; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.println("" + i);
            }
        }
        int i=1;
        while(i<=numeroFinal){
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.println("" + i);
            }
            i++;
        }
        int j=1;
        do{
            if (j % 3 != 0 && j % 7 != 0) {
                System.out.println("" + j);
            }
            j++;
        } while(j<=numeroFinal);
    }
}

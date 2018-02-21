/*
Escriba un programa que muestre n números naturales desde el 1
que no sean múltiplos ni de 3 ni de 7.
 */
public class NoMultiplos2 {
    public static void main(String[] args) {
        int cantidadNumeros=10;
        int numeroMostrados=0;
        int numeroActual=1;

        while(numeroMostrados<cantidadNumeros){
            if(numeroActual%3!=0 && numeroActual%7!=0){
                System.out.println(numeroActual);
                numeroMostrados++;
            }
            numeroActual++;
        }
    }
}

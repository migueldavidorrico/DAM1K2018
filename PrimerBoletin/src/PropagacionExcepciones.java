/**
 * Created by Miguel-David Orrico Teruel on 02/03/2018.
 */
public class PropagacionExcepciones {
    private final static int CASO = 2; // puede valer 0, 1 o 2
    private static void puedeLanzarExcepcion() {
        switch (CASO) {
            case 0:
// Caso 0: no lanza excepción
                return;
            case 1:
// Caso 1: lanza ArithmeticException
                throw new ArithmeticException();
            case 2:
// Caso 2: lanza ArrayIndexOutOfBoundsException
                throw new ArrayIndexOutOfBoundsException();
        }
    }
    private static void metodo() {
        try {
            System.out.println(" Método: antes");
            puedeLanzarExcepcion();
            System.out.println(" Método: después");
            return;
        } catch (ArithmeticException e) {
            System.out.println(" Método: cazada ArithmeticException");
        } finally {

            System.out.println(" Método: finally");
        }
        System.out.println(" Método: después try-catch");
    }
    public static void main(String[] args) {
        try {
            System.out.println(" Main: antes");
            metodo();
            System.out.println(" Main: después");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    " Main: cazada ArrayIndexOutOfBoundsException");
        }
        System.out.println(" Main: después try-catch");
    }
}

public class Exponenciacion {
    public static void main(String[] args) {
        System.out.println(potenciaRecursiva(3, 4));
        System.out.println(sumaDigitos(345));
        System.out.println(lista(6));
        System.out.println(PB(6));
        System.out.println(PBfor(8));
        System.out.println(descendenteAscendente(4));
        System.out.println(MCD(60, 12));
        System.out.println(MCD(33, 12));
    }
    /*
    Escribir un programa que calcule el máximo común divisor (MCD) de dos enteros positivos. Si M >= N una función recursiva para MCD es

Caso Base N =0, devuelve m

Caso recursivo si N <> 0 devuelve MCD (N, M mod N)
     */
    public static int MCD(int m,int n){
        if(n==0){
            return m;
        }
        return MCD(n,m%n);
    }

    /* Implementa una funci´on recursiva que imprima por pantalla los valores
desde 1 hasta un n´umero introducido por el usuario
    Lista:
    Caso base: si el número es un 1, devuelve un 1
    Caso recursivo: devuelve Lista del numero-1 con el numero concatenado
*/
    public static String lista(int numero){
        if(numero==1){
            return ""+numero;
        }
        return lista(numero-1)+numero;
    }
    /*
    Cuenta Descendente y Ascentdente
    Le damos el 6 e imprime 65432123456
    descendenteAscendete
    Caso Base: si el número es un 1, devuelve un 1;
    Caso recursivo:numero concatenado con descendenteAscendente(numero-1)
    concatenado con numero

     */
    public static String descendenteAscendente(int numero){
        if(numero==1){
            return ""+numero;
        }
        return numero+descendenteAscendente(numero-1)+numero;
    }
    public static String PBfor(int numero){
        String salida="";
        for(int i=numero;i>=1;i--){
            salida+=i;
        }
        for(int i=2;i<=numero;i++){
            salida+=i;
        }
        return salida;
    }

    public static String PB(int numero){
        String salida="";
        int numeroInicial=numero;
        boolean desciende=true;
        do{
            salida+=numero;
            if(desciende){
                numero--;
            } else {
                numero++;
            }
            if(numero==1){
                desciende=!desciende;
            }
        } while(numero<=numeroInicial);
        return salida;
    }

    /*Suma de dígitos
      caso base: si es un dígito, se devuelve el dígito
      caso recursivo: si es más de un dígito, ul último dígito más
      Suma de dígitos del resto de dígitos
      */

    public static int sumaDigitos(int numero){
        if(numero<10){
            return numero;
        }
        return numero%10+sumaDigitos(numero/10);
    }

    public static int potenciaRecursiva(int base, int exponente) {
        if(exponente==0){
            return 1;
        }
        return base*potenciaRecursiva(base,exponente-1);

    }
}

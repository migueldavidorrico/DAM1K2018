public class PruebaRelleno {
    static String[] palabras;
    public static boolean insertarEnPosiciones(String s, int posInicial,int posFinal){
        //Comprobar que quedan posiciones vacías
        boolean hayPosicionesVacias=false;
        int primeraPosicionVacia=-1;
        for(int i=posInicial;i<=posFinal;i++){
            if(palabras[i]==null){
                hayPosicionesVacias=true;
                if(primeraPosicionVacia==-1){
                    primeraPosicionVacia=i;
                }
            }
        }
        if(!hayPosicionesVacias){
            return false;
        }
        palabras[primeraPosicionVacia]=s;
        return true;
    }

    public static String contenidoPalabras() {
        String salida="";
        for (String s :
                palabras) {
            salida+=String.format("%4s",s)+"-";
        }
        salida=salida.substring(0,salida.length()-1);
        return salida;
    }

    public static void main(String[] args) {
        palabras=new String[11];
        System.out.println(contenidoPalabras());
        insertarEnPosiciones("abc",0,0);
        System.out.println(contenidoPalabras());
        insertarEnPosiciones("abc",5,8);
        System.out.println(contenidoPalabras());
        insertarEnPosiciones("abc",5,8);
        System.out.println(contenidoPalabras());
        insertarEnPosiciones("abc",5,8);
        System.out.println(contenidoPalabras());
        insertarEnPosiciones("abc",5,8);
        System.out.println(contenidoPalabras());
        System.out.println(insertarEnPosiciones("abc", 5, 8));
        System.out.println(contenidoPalabras());


    }
}

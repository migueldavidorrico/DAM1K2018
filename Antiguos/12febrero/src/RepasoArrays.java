public class RepasoArrays {
    public static void main(String[] args) {
        int[] listaNumeros=new int[30];
        listaNumeros[0]=4;
        listaNumeros[1]=3;
        listaNumeros[2]=6;
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print(" "+listaNumeros[i]);
        }
        System.out.println("");
        char[] letras=new char[30000];
        int letrasIntroducidas=0;
        for (int i = 0; i < letrasIntroducidas; i++) {
            System.out.print(letras[i]);
        }
        System.out.println("");
        letras[letrasIntroducidas++]='a';
        letras[letrasIntroducidas++]='e';
        letras[letrasIntroducidas++]='i';
        letras[letrasIntroducidas++]='a';
        for (int i = 0; i < letrasIntroducidas; i++) {
            System.out.print(letras[i]);
        }
        System.out.println("");
    }
}

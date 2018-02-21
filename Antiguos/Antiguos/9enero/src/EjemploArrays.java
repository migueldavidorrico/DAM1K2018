import java.util.Arrays;

public class EjemploArrays {
    public static int[] obtenerPares(final int[] v){
        int[] salida=new int[getNumeroPares(v)];
        for(int i=0,indicePar=0;i<v.length;i++){
            if(v[i]%2==0){
                salida[indicePar++]=v[i];
            }
        }
        return salida;
    }

    private static int getNumeroPares(int[] v) {
        int numeroPares = 0;
        for (int e :
                v) {
            if (e % 2 == 0) {
                numeroPares++;
            }
        }
        return numeroPares;
    }

    public static int[] dobla(final int[] v){
        int[] salvaGuarda=new int[v.length];
        for(int i=0;i<v.length;i++){
            salvaGuarda[i]=v[i];
        }
        for (int i = 0; i < v.length; i++) {
            salvaGuarda[i]=2*v[i];
        }
        return salvaGuarda;
    }
    public static int[] dobla2(final int[] v){
        int[] salida=Arrays.copyOf(v,v.length);
        System.out.println(Arrays.toString(salida));;
        for (int i = 0; i < v.length; i++) {
            salida[i]=2*v[i];
        }
        return salida;
    }

    public static void main(String[] args) {

        int[] ejemplo={6,2,2,0,9,42,4,0};
        System.out.println(Arrays.toString(obtenerPares(ejemplo)));
//        System.out.println(Arrays.toString(ejemplo));
//        int[] elDoble=dobla(ejemplo);
//        System.out.println(Arrays.toString(ejemplo));
//        System.out.println(Arrays.toString(elDoble));
//        System.out.println(Arrays.toString(dobla2(ejemplo)));

    }

}

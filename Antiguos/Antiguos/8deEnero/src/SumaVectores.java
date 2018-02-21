import java.util.Arrays;

public class SumaVectores {
    public static int[] suma(final int[] a,final int[] b){
        int[] pp={3,4,56,76,7,8};
        int[] largo;
        int[] corto;
        if(a.length>b.length){
            largo=a;
            corto=b;
        } else {
            largo=b;
            corto=a;
        }

        for (int i = 0; i < corto.length; i++) {
            largo[i]+=corto[i];
        }
        return largo;

//        int longitudASumar=Math.min(a.length,b.length);
//        int longitudFinal=Math.max(a.length,b.length);
//        int[] salida=new int[longitudFinal];
//        for (int i = 0; i < longitudASumar; i++) {
//            salida[i]=a[i]+b[i];
//        }
//        for (int i = longitudASumar; i < longitudFinal; i++) {
//            if(a.length>b.length){
//                salida[i]=a[i];
//            } else {
//                salida[i]=b[i];
//            }
//        }
//        return salida;
    }

    public static void main(String[] args) {
        int[] a={2,3,1,8,3,1,7};
        int[] b={2,3,4};


        System.out.println(Arrays.toString(suma(a, b)));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

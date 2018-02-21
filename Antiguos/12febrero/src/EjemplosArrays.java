public class EjemplosArrays {
    public static void main(String[] args) {
        int[] numeros={3,2,4,54,564,34,-65,3,3_422,-56,65645};
        int poblacionEEUU=250_876_433;
        int poblacionMex=140_876_433;
        int numeroPositivos=0;
        int numeroNegativos=0;
        int numeroCeros=0;
        for (int i = 0; i < numeros.length; i++) {
            int actual=numeros[i];
            if(actual==0){
                numeroCeros++;
            }
            if(actual>0){
                numeroPositivos++;
            }
            if(actual<0){
                numeroNegativos++;
            }
        }
        System.out.println(numeroPositivos + " " + numeroNegativos + " " + numeroCeros);


    }
}

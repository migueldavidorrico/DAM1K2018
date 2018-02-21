public class Ejercicio1 {
    public static String secuenciaCollatz(int n){
        if(n==1){
            return "1";
        }

        if(n%2==0){
            return n+" "+secuenciaCollatz(n/2);
        }else {
            return n+" "+secuenciaCollatz((n*3)+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(secuenciaCollatz(19));
    }
}

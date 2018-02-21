public class Ejercicio2 {
    public static void trianguloInverso1(int n){
        for(int i=1;i<=n;i++){
            String salida="";
            for (int j = 0; j < i; j++) {
                salida+="*";
            }
            String formato="%"+n+"s";
            System.out.printf(formato,salida);
            System.out.println("");
        }
    }
    public static void trianguloInverso2(int n){
        int numeroEspacios=n-1;
        int numeroAsteriscos=1;
        for(int i=0;i<n;i++){
            for (int j = 0; j < numeroEspacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numeroAsteriscos; j++) {
                System.out.print("*");
            }
            numeroAsteriscos++;
            numeroEspacios--;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        trianguloInverso2(9);
    }
}

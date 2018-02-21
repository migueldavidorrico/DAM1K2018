public class Cubos {
    public static boolean numeroEspecial(int n){
        int unidades=n%10;
        int resto=n/10;
        int decenas=resto%10;
        int centenas=resto/10;
//        System.out.println(n + " " + centenas + "-" + decenas + "-" + unidades);
        int unidadesCubo=unidades*unidades*unidades;
        int decenasCubo=decenas*decenas*decenas;
        int centenasCubo=centenas*centenas*centenas;
        return centenasCubo+decenasCubo+unidadesCubo==n;
    }
    public static void main(String[] args) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    int numeroActual=i*100+j*10+k;
                    if(numeroEspecial(numeroActual)){
                        System.out.println(numeroActual);
                    }
                }
            }
        }

        time_end = System.currentTimeMillis();
        System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
        time_start = System.currentTimeMillis();
        int numerosEncontrados=0;
        for(int i=150;i<=410;i++) {
            if(numeroEspecial(i)) {
                System.out.println(i);
                numerosEncontrados++;
                if(numerosEncontrados==4){
                    break;
                }
            }
        }

        time_end = System.currentTimeMillis();
        System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");



    }

}

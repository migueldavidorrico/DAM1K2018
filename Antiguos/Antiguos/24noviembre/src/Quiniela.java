public class Quiniela {
    private static final String ENCABEZADO="PRONÓSTICOS";
    private static final String PRONOSTICO=" 1 X 2 ";

    public static String cadenaBoleto(int partidos,int columnas){
        String salida=ENCABEZADO+"\n";
        for(int i=1;i<=partidos;i++){
            salida+=String.format("%2s",""+i);
            for(int j=0;j<columnas;j++){
                salida+=PRONOSTICO;
            }
            salida+="\n";
        }

        return salida;
    }
}

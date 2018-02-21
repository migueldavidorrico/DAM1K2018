public class Ejercicio3 {
    public static int[][] generarMatriz(int tamanyoMatriz, int diagonal, int relleno) {
        int[][] matriz = new int[tamanyoMatriz][tamanyoMatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = diagonal;
                } else {
                    matriz[i][j] = relleno;
                }
            }
        }
        return matriz;
    }
    public static int[][] generarMatrizIdentidad(int tamanyoMatriz) {
        return generarMatriz(tamanyoMatriz, 1, 0);
    }

    public static void swapColumnas(int[][] matriz, int columna1, int columna2) {
        int temporal;
        for (int i = 0; i < matriz.length; i++) {
            temporal = matriz[i][columna1];
            matriz[i][columna1] = matriz[i][columna2];
            matriz[i][columna2] = temporal;
        }
    }
    public static void swapColumnasPrimeraUltima(int[][] matriz) {
        swapColumnas(matriz, 0, matriz.length - 1);
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {2,3,4,5,6,4,4,3,3,3,3},
                {1,1,1,1,1,1,1,1,1,1,1},
                {2,2,2,2,2,2,2,2,2,2,2},
                {7,7,7,7,5,5,4,3,6,5,4},
                {2,2,3,3,4,4,5,5,6,7,7}
        };
//        Utilidades.muestraTabla(matriz);
//        swapColumnas(matriz, 1, 2);
//        Utilidades.muestraTabla(matriz);
        int[][] identidad = generarMatrizIdentidad(4);
//        Utilidades.muestraTabla(identidad);
//        swapColumnasPrimeraUltima(identidad);
//        Utilidades.muestraTabla(identidad);
        Utilidades.muestraTabla(matriz);
        swapFilas(matriz,1,2);

        Utilidades.muestraTabla(matriz);
        swapFilasPrimeraUltima(matriz);
    }

    private static void swapFilasPrimeraUltima(int[][] matriz) {
        swapFilas(matriz,0,matriz.length-1);
    }

    private static void swapFilas(int[][] matriz, int i, int j) {
        int[] aux=matriz[i];
        matriz[i]=matriz[j];
        matriz[j]=aux;
    }
}
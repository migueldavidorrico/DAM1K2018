import javax.swing.*;

public class Ejercicio1 {
    private JLabel etiquetaAbajo;

    public static int[][] rellenaDiagonalMatrizCon(int[][] matriz, int diagonal, int relleno) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i] == matriz[j]) {
                    matriz[i][j] = diagonal;
                } else {
                    matriz[i][j] = relleno;
                }
            }
        }
        return matriz;
    }

    public static int[][] matrizUnidad(int tamanyo) {
        int[][] matrizUnidad = new int[tamanyo][tamanyo];

        rellenaDiagonalMatrizCon(matrizUnidad, 1, 0);

        return matrizUnidad;

    }


    public static void main(String[] args) {
        for (int i=1; i<10; i++) {
            Utilidades.muestraTabla(matrizUnidad(i));
        }
    }
}

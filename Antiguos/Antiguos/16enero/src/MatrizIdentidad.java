import javax.swing.*;

public class MatrizIdentidad {
    public static void main(String[] args) {
        int tamanyo=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el tamanyo:"));
        int[][] matriz=new int[tamanyo][tamanyo];

        rellenaMatrizIdentidad(matriz);
        Utilidades.muestraTabla(matriz);
        intercambiaColumnas(matriz,0,1);
        Utilidades.muestraTabla(matriz);

        int[][] matriz2={{2,3,4,5},{2,3,4,5},{2,3,4,5}};
        Utilidades.muestraTabla(matriz2);
        intercambiaColumnas(matriz2, 0,matriz2[0].length-1);

        Utilidades.muestraTabla(matriz2);
    }

    private static void intercambiaColumnas(int[][] matriz, int numColumna, int numColumna2) {
        for (int i = 0; i < matriz.length; i++) {

                int aux=matriz[i][numColumna];
                matriz[i][numColumna]=matriz[i][numColumna2];
                matriz[i][numColumna2]=aux;


        }
    }

    private static void rellenaMatrizIdentidad(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i]==matriz[j]){
                    matriz[i][j]=1;
                }
            }
        }
    }



}


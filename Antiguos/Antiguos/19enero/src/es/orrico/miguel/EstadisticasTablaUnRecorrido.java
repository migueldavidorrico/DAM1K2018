package es.orrico.miguel;

/**
 * Clase estadisticas de tabla
 * @author miguel
 * @version 1.0
 */

public class EstadisticasTablaUnRecorrido {
    public static void main(String[] args) {
        int[][] tabla = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
                {4, 4, 3},
                {1, 1, 1}
        };
        Utilidades.muestraTabla(tabla);

        int[][] tablaNueva = tablaEstadisticas(tabla);
        Utilidades.muestraTabla(tablaNueva);
    }

    /**
     * Calcula las estasísticas de una tabla
     * @param tabla la tabla a calcular estadísticas
     * @return una nueva tabla de tamaño +1 con...
     */
    public static int[][] tablaEstadisticas(int[][] tabla) {
        int[][] tablaNueva=new int[tabla.length+1][tabla[0].length+1];
        Utilidades.muestraTabla(tablaNueva);
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tablaNueva[i][j]=tabla[i][j];
                tablaNueva[i][tablaNueva[0].length-1]+=tabla[i][j];
                tablaNueva[tablaNueva.length-1][j]+=tabla[i][j];
                tablaNueva[tablaNueva.length-1][tablaNueva[0].length-1]+=tabla[i][j];
//                es.orrico.miguel.Utilidades.muestraTabla(tablaNueva);
            }
        }
        return tablaNueva;
    }
}

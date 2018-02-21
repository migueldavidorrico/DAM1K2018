package es.orrico.miguel;

import java.util.Arrays;

public class EstadisticasTabla2 {
    public static int sumaArray(int[] array){
        int suma=0;
        for (int elemento :
                array) {
            suma+=elemento;
        }
        return suma;
    }
    public static int[] devuelveFila(int fila,int[][] v){
        if(fila<0 || fila>=v.length){
            return new int[0];
        }
        return v[fila].clone();
    }
    public static int[] devuelveColumna(int columna,int[][] v){
        if(columna<0 || columna>=v[0].length){
            return new int[0];
        }
        int[] salida=new int[v.length];
        for (int i = 0; i < v.length; i++) {
            salida[i]=v[i][columna];
        }
        return salida;
    }
    public static void main(String[] args) {

        int[][] tabla = {
                {1, 2, 0},
                {1, 2, 0},
                {1, 2, 0},
                {0, 0, 0},
                {1, 1, 1}
        };
        int[] sumaFilas = devuelveSumaFilas(tabla);
        int[] sumaColumnas = devuelveSumaColumnas(tabla);
        if(sumaArray(sumaColumnas)==sumaArray(sumaFilas)){
            System.out.println("La suma total es: " + sumaArray(sumaColumnas));
        }
        else {
            System.out.println("Has violado las reglas de la matemática");
        }
    }

    public static int[] devuelveSumaFilas(int[][] tabla) {
        int[] sumaFilas=new int[tabla.length];
        for (int i=0;i<tabla.length;i++) {
            sumaFilas[i]=sumaArray(devuelveFila(i,tabla));
        }
        return sumaFilas;
    }
    private static int[] devuelveSumaColumnas(int[][] tabla) {
        int[] sumaColumnas=new int[tabla[0].length];
        for (int i=0;i<tabla[0].length;i++) {
            sumaColumnas[i]=sumaArray(devuelveColumna(i,tabla));
        }
        return sumaColumnas;
    }
}

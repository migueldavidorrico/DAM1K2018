package es.orrico.miguel;

import java.util.Arrays;

public class EstadisticasTabla {
    public static void main(String[] args) {
        int[][] tabla={
                {1,2,0},
                {1,2,0},
                {1,2,0},
                {0,0,0},
                {1,1,1}
        };
        //Calculo las sumas de las filas
        int[] resumenFilas=new int[tabla.length];
        int indiceGuardarSuma=0;
        for (int i = 0; i <tabla.length; i++) {
            int suma=0;
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j]);
                suma+=tabla[i][j];
            }
            System.out.println("La fila suma:"+suma);
            resumenFilas[indiceGuardarSuma++]=suma;
        }
        System.out.println(Arrays.toString(resumenFilas));
        int[] resumenColumnas=new int[tabla.length];
        indiceGuardarSuma=0;
        for (int j = 0; j <tabla[0].length; j++) {
            int suma=0;
            for (int i = 0; i < tabla.length; i++) {
                System.out.print(tabla[i][j]);
                suma+=tabla[i][j];
            }
            System.out.println("La fila suma:"+suma);
            resumenColumnas[indiceGuardarSuma++]=suma;
        }
        System.out.println(Arrays.toString(resumenColumnas));
        int sumaTotal=0;
        for (int[] fila :
                tabla) {
            for (int numero :
                    fila) {
                sumaTotal+=numero;
            }
        }
        System.out.println(sumaTotal);

    }
}

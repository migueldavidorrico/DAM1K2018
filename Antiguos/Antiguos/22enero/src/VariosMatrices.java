import es.miguel.orrico.UtilidadesTablas;

/*

Saber si 2 matrices tienen el mismo contenido

Sumar la diagonal principal de una matriz

Cuadrado de unos

Obtener primera fila rellena, la última, la primera columna y la última (recortar una imagenquitando los ceros que sobran)
 */
public class VariosMatrices {
    private int primeraColumna;
    private int[][] matriz;
    VariosMatrices(int[][] matriz){
        this.matriz=matriz;
        this.primeraColumna=this.devuelvePrimeraColumnaNoVacia();
    }
    public static void main(String[] args) {
        int[][] m1={
                {1,1,1},
                {1,1,1}
        };
        int[][] m2={
                {1,1,1},
                {1,1,1}
        };
        int[][] m3={
                {1,1,1},
                {0,1,0},
                {0,0,1}
        };
        System.out.println(iguales(m1, m2) ? "Son iguales" : "Son diferentes");
        System.out.println(sumaDiagonal(m3));
        UtilidadesTablas.muestraTabla(cuadradoUnos(6));
        int[][] imagen={
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,1,1,0,0,0},
                {0,0,1,1,1,1,0,0}, //ancho debe ser 5
                {0,0,1,1,1,1,1,0}, //alto debe ser 7
                {0,0,1,1,1,1,1,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0}
        };
        VariosMatrices v=new VariosMatrices(imagen);
        int alto=v.devuelveUltimaFilaNoVacia()-v.devuelvePrimeraFilaNoVacia()+1;
        int ancho=v.devuelveUltimaColumnaNoVacia()-v.devuelvePrimeraColumnaNoVacia()+1;
        int[][] recortada=new int[alto][ancho];
        //Ejercicio. Modificar usando uno varios Arrays.copyofRange
        for (int i = v.devuelvePrimeraFilaNoVacia(); i <= v.devuelveUltimaFilaNoVacia(); i++) {
            for (int j = v.devuelvePrimeraColumnaNoVacia(); j <=v.devuelveUltimaColumnaNoVacia() ; j++) {
                System.out.print(imagen[i][j]+" ");
                recortada[i-v.devuelvePrimeraFilaNoVacia()][j-v.devuelvePrimeraColumnaNoVacia()]=imagen[i][j];
            }
            System.out.println("");
        }
        System.out.println(ancho + " " + alto);
        UtilidadesTablas.muestraTabla(recortada);
    }
    public int devuelvePrimeraColumnaNoVacia(){
        for (int i = 0; i < this.matriz[0].length; i++) {
            if(!estaVaciaLaColumna(i)){
                return i;
            }
        }
        return -1;
    }
    public int devuelveUltimaColumnaNoVacia(){
        for (int i = this.matriz[0].length-1; i >=0; i--) {
            if(!estaVaciaLaColumna(i)){
                return i;
            }
        }
        return -1;
    }
    public int devuelvePrimeraFilaNoVacia(){
        for (int i = 0; i < this.matriz.length; i++) {
            if(!estaVaciaLaFila(i)){
                return i;
            }
        }
        return -1;
    }
    public int devuelveUltimaFilaNoVacia(){
        for (int i = this.matriz.length-1; i >=0; i--) {
            if(!estaVaciaLaFila(i)){
                return i;
            }
        }
        return -1;
    }



    public boolean estaVaciaLaFila(int fila){
        for (int i = 0; i < this.matriz[fila].length; i++) {
            if(this.matriz[fila][i]!=0){
                return false;
            }
        }
        return true;
    }
    public boolean estaVaciaLaColumna(int columna){
        for (int i = 0; i < this.matriz.length; i++) {
            if(this.matriz[i][columna]!=0){
                return false;
            }
        }
        return true;
    }
    private static int[][] cuadradoUnos(int tamanyo) {
        int[][] salida=new int[tamanyo][tamanyo];
        for (int i = 0; i < salida.length; i++) {
            salida[i][0]=1;
            salida[i][salida[i].length-1]=1;
        }
        for (int i = 0; i < salida[0].length; i++) {
            salida[0][i]=1;
            salida[salida.length-1][i]=1;
        }
        return salida;
    }

    private static int sumaDiagonal(int[][] m3) {
        int suma=0;
        for (int i = 0; i < m3.length; i++) {
            suma+=m3[i][i];
        }
        return suma;
    }

    private static boolean iguales(int[][] m1, int[][] m2) {
        if(m1==null || m2==null){
            return false;
        }
        if(m1==m2){
            return true;
        }
        if(m1.length!=m2.length){
            return false;
        }
        for (int i = 0; i <m1.length; i++) {
            if(m1[i].length!=m2[i].length){
                return false;
            }
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if(m1[i][j]!=m2[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}

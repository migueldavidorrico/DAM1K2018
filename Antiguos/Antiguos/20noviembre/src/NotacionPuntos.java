public class NotacionPuntos {
    public static int sumaArray(int... array){
        int suma=0;
        for(int i=0;i<array.length;i++){
            suma+=array[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println(sumaArray(6, 7, 4, 3, 4));
        int[] a={4,3,2,45,7};
        System.out.println(sumaArray(a));

    }
}

/*
4 6 9 4

 */

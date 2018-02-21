import java.util.Arrays;
import java.util.Random;

public class OrdenarParalelo {
    static final int TAMANYO=100000000;
    static void rellenarArray(int[]v){
        Random r=new Random();
        for (int i = 0; i < v.length; i++) {
            v[i]=r.nextInt();
        }

    }

    public static void main(String[] args) {
        int[] v=new int[TAMANYO];
        rellenarArray(v);
//        System.out.println(Arrays.toString(v));
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        Arrays.sort(v);
        time_end = System.currentTimeMillis();
        System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
        rellenarArray(v);
        time_start = System.currentTimeMillis();
        Arrays.parallelSort(v);
        time_end = System.currentTimeMillis();
        System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
    }
}

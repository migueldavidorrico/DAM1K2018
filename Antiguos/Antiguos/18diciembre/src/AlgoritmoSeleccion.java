import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class AlgoritmoSeleccion {
    public static void seleccion(int[] matrix) {
        int i;
        int k;
        int p;
        int buffer;
        int limit = matrix.length - 1;
        for (k = 0; k < limit; k++) {
            p = k;
            for (i = k + 1; i <= limit; i++)
                if (matrix[i] < matrix[p]) p = i;
            if (p != k) {
                buffer = matrix[p];
                matrix[p] = matrix[k];
                matrix[k] = buffer;
            }
        }

    }

    public static void main(String[] args) {
        int[] matrix = {1,53, 767, 234, 872, 564762, 8534, 1, 8563, 3,3};
        seleccion(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i]+" ");
        }
        System.out.println("");
    }
}

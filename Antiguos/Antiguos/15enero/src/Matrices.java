public class Matrices {
    public static void main(String[] args) {
        int[][] b={
                {4,23,5,564,6},
                {2,1,3,34,2,4,543,54},
                {0,0}
        };
        int[][] m=new int[3][];
        m[0]=new int[6];
        m[1]=new int[2];
        m[2]=new int[3];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }

    }
}

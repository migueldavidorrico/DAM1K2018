public class EjemploForEach {
    public static void main(String[] args) {
        int[] original={4,5,3,2,4,5,3,234,0};
        for(int i=0;i<original.length;i++){
            System.out.println(original[i] * 2);
        }
        for (int valor :
                original) {
            System.out.println(valor * 2);
        }

    }
}

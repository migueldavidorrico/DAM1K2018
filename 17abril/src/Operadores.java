public class Operadores {
    public static void main(String[] args) {
        int numero = 32;
        System.out.println(Integer.toBinaryString(numero));
        numero = numero >> 2;
        System.out.println("  " + Integer.toBinaryString(numero));
        System.out.println(numero);
        int numero2 = -16;
        System.out.println(Integer.toBinaryString(numero2));
        numero2 = numero2 >>> 1;
        System.out.println(" " + Integer.toBinaryString(numero2));
        System.out.println(numero2);
    }
}

public class OperadoresBits {
    public static void main(String[] args) {
        int numero = 0b1111001;
        int numero2 = 0b1111;
        System.out.println(Integer.toBinaryString(numero));
        System.out.println(Integer.toBinaryString(numero2));
        System.out.println(Integer.toBinaryString(numero | numero2));
        System.out.println(Integer.toBinaryString(numero >>> 2));
    }
}

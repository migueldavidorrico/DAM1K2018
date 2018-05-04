public class StringBuilderBuffer {
    public static void main(String[] args) {
        StringBuffer salida = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            salida.append(i);
        }
        System.out.println(salida.toString());
    }
}

public class FinalEnParametro {
    static void imprime(int... numericos) {
        System.out.println("El numero de numeros es:" + numericos.length);
        for (int n :
                numericos) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int a = 86;
        imprime(65, 423, 54, 65, 76, 345, 4, 54, 234, 432, 234);
        System.out.println(a);
    }
}

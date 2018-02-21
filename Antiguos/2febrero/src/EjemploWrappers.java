public class EjemploWrappers {
    public static void main(String[] args) {
        int a=1;
        Integer entero=1;
        Integer otro=new Integer(1);
        Integer otromas=new Integer("4764");

        System.out.println(Integer.parseInt("1234"));
        System.out.println(Integer.parseInt("1234",8));
        System.out.println(Integer.parseInt("1234",16));
        System.out.println(Integer.decode("0xFF"));
        System.out.println(Integer.decode("010101010"));
        System.out.println(Integer.toBinaryString(5423));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}

public class PruebaCreacionObjetos {
    public static void conObjetos() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void sinObjetos() {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        sinObjetos(); // llamamos a la tarea
        time_end = System.currentTimeMillis();
        System.out.println("Sin objetos "+ ( time_end - time_start ) +" milliseconds");
        time_start = System.currentTimeMillis();
        conObjetos(); // llamamos a la tarea
        time_end = System.currentTimeMillis();
        System.out.println("Con Objetos "+ ( time_end - time_start ) +" milliseconds");

    }

}

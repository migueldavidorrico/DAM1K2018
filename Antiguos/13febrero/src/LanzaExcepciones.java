public class LanzaExcepciones {
    public static void main(String[] args) {
        try {
            String a = null;
//            if (a.equals("")) {
//                System.out.println("NO VA");
//            }
//            Integer.parseInt("Treinta y siete");
            if(a.equals("KOK")) throw new ME1("ME1");
            throw new ME2("ME2");
        } catch (NullPointerException npe){
            System.out.println("PASA ALGO CON NULL");
        } catch (RuntimeException rte){
            System.out.println("PASÓ ALGO EN RUNTIME");
        } catch (ME2 me2){
            me2.printStackTrace();
        } catch (ME1 me1) {
            me1.printStackTrace();
        }
        System.out.println("HEMOS PASADO LA PRUEBA");
    }
}

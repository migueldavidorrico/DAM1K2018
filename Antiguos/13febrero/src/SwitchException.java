import sun.reflect.annotation.ExceptionProxy;

public class SwitchException {
    public static void main(String[] args) {
        try{
            int a=7/0;
            Integer.parseInt("Cuarenta y Dos");
        } catch (ArithmeticException | NumberFormatException n){
            System.out.println("Problema con números");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
